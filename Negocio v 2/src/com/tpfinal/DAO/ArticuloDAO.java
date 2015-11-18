package com.tpfinal.DAO;

import com.tpfinal.modelo.Articulo;
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
public class ArticuloDAO {

    private Session sesion;
    private Transaction tx;

    public String guardaArticulo(Articulo articulo) throws HibernateException {
        String NumArticulo = "0";

        try {
            this.iniciaOperacion();
            NumArticulo = (String) sesion.save(articulo);
            tx.commit();

        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.flush();
            sesion.close();
        }

        return NumArticulo;
    }

    public void actualizaArticulo(Articulo articulo) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.update(articulo);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public void eliminaArticulo(Articulo articulo) throws HibernateException, IllegalStateException {
        try {
            iniciaOperacion();
            sesion.delete(articulo);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public Articulo obtenArticulo(String NumArticulo) throws HibernateException {
        Articulo articulo = null;
        try {
            iniciaOperacion();

            articulo = (Articulo) sesion.get(Articulo.class, NumArticulo);
        } finally {
            sesion.close();
        }

        return articulo;
    }

    public Articulo datosArticulo(String NumArticulo) throws HibernateException {
        Articulo articulo = null;
        try {
            iniciaOperacion();

            articulo = (Articulo) sesion.get(Articulo.class, NumArticulo);
        } finally {
            sesion.close();
        }

        return articulo;
    }

    @SuppressWarnings("unchecked")
    public List<Articulo> obtenListaArticulo() throws HibernateException {
        List<Articulo> listaCurso = null;

        try {
            iniciaOperacion();
            listaCurso = sesion.createQuery("from Articulo").list();

        } finally {
            sesion.close();
        }

        return listaCurso;
    }

    private void iniciaOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = (Transaction) sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException, IllegalStateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

    public void ModificarArticulo(String id, String nombre, String marca, String p, String stock) {

        Connection con = null;
        PreparedStatement s;
        String url = "jdbc:sqlserver://Agustin-PC:1433;databaseName=Kiosco";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String user = "usuario_java";
        String clave = "123";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, clave);
            s = con.prepareStatement("UPDATE Articulo SET Nombre =(?), Marca=(?), Precio=(?), IVA=(?), Stock=(?) Where id_producto = " + id + "");
            s.setString(1, nombre);
            s.setString(2, marca);
            s.setString(3, p);
            s.setString(4, stock);

            s.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos Modificados correctamente");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void BorrarArticulo(String id) {

        Connection con = null;
        PreparedStatement s;
        String url = "jdbc:sqlserver://Agustin-PC:1433;databaseName=Kiosco";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String user = "usuario_java";
        String clave = "123";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, clave);
            s = con.prepareStatement("DELETE FROM Producto Where id_producto= " + id + "");

            s.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos borrados correctamente");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
