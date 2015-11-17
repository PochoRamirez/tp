package com.tpfinal.DAO;

import com.tpfinal.modelo.Empleado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Desi
 */
public class EmpleadoDAO {

    private Session sesion;
    private Transaction tx;

    public String guardaEmpleado(Empleado empleado) throws HibernateException {
        String NumEmpleado = "0";

        try {
            this.iniciaOperacion();
            NumEmpleado = (String) sesion.save(empleado);
            tx.commit();

        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.flush();
            sesion.close();
        }

        return NumEmpleado;
    }

    public void actualizaCurso(Empleado empleado) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.update(empleado);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public void eliminaEmpleado(Empleado empleado) throws HibernateException, IllegalStateException {
        try {
            iniciaOperacion();
            sesion.delete(empleado);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public Empleado obtenEmpleado(String NumEmpleado) throws HibernateException {
        Empleado empleado = null;
        try {
            iniciaOperacion();

            empleado = (Empleado) sesion.get(Empleado.class, NumEmpleado);
        } finally {
            sesion.close();
        }

        return empleado;
    }

    public Empleado datosEmpleado(String NumEmpleado) throws HibernateException {
        Empleado empleado = null;
        try {
            iniciaOperacion();

            empleado = (Empleado) sesion.get(Empleado.class, NumEmpleado);
        } finally {
            sesion.close();
        }

        return empleado;
    }

    @SuppressWarnings("unchecked")
    public List<Empleado> obtenListaEmpleado() throws HibernateException {
        List<Empleado> listaEmpleado = null;

        try {
            iniciaOperacion();
            listaEmpleado = sesion.createQuery("from Empleado").list();

        } finally {
            sesion.close();
        }

        return listaEmpleado;
    }

    private void iniciaOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = (Transaction) sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException, IllegalStateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public void BorrarEmpleado(String dni) {

        Connection con = null;
        PreparedStatement s;
        String url = "jdbc:sqlserver://Agustin-PC:1433;databaseName=Kiosco";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String user = "usuario_java";
        String clave = "123";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, clave);
            s = con.prepareStatement("DELETE FROM ClienteFinal Where DNI= " + dni + "");

            s.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos borrados correctamente");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ModificarEmpleado(String dni, String telefono, String direccion, String nombre, String dd, String mm, String aa) {

        Connection con = null;
        PreparedStatement s;
        String url = "jdbc:sqlserver://Agustin-PC:1433;databaseName=Kiosco";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String user = "usuario_java";
        String clave = "123";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, clave);
            s = con.prepareStatement("UPDATE ClienteFinal SET Telefono =(?), Direccion=(?), Nombre=(?), Dia=(?), Mes=(?), Año=(?) Where DNI = " + dni + "");
            s.setString(1, telefono);
            s.setString(2, direccion);
            s.setString(3, nombre);
            s.setString(4, dd);
            s.setString(5, mm);
            s.setString(6, aa);

            s.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos Modificados correctamente");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void CargarEmpleado(String dni) {

        try {

            Connection con;
            PreparedStatement s;
            ResultSet r;
            ResultSetMetaData rsm;
            DefaultTableModel dtm;

            String url = "jdbc:sqlserver://Agustin-PC:1433;databaseName=Kiosco";

            String user = "usuario_java";
            String clave = "123";

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, user, clave);

            s = con.prepareStatement("select Nombre, Telefono, Direccion, Dia, Mes, Año from ClienteFinal WHERE DNI = " + dni + "");
            r = s.executeQuery();
            rsm = r.getMetaData();
            ArrayList<Object[]> data = new ArrayList<>();
            while (r.next()) {

                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = r.getObject(i + 1);
//                    this.Nombre=(r.getString(1));
//                    this.Telefono=(r.getString(2));
//                    this.Domicilio=(r.getString(3));
//                    this.DiaNacimiento=(r.getString(4));
//                    this.MesNacimiento=(r.getString(5));
//                    this.AñoNacimiento=(r.getString(6));

                }
                data.add(rows);

            }
        } catch (ClassNotFoundException | SQLException e) {

        }

    }

}
