package com.tpfinal.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Desi
 */
public class Venta {

    int IDventa;
    String dni;
    List<Articulo> articulos;
    int IDempleado;
    Float montototal;
    String Diaventa;
    String Mesventa;
    String Añoventa;
    String Minutoventa;

    public Venta() {
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public int getIDventa() {
        return IDventa;
    }

    public String getDni() {
        return dni;
    }

    public int getIDempleado() {
        return IDempleado;
    }

    public Float getMontototal() {
        return montototal;
    }

    public String getDiaventa() {
        return Diaventa;
    }

    public String getMesventa() {
        return Mesventa;
    }

    public String getAñoventa() {
        return Añoventa;
    }

    public String getMinutoventa() {
        return Minutoventa;
    }

    public void setIDventa(int IDventa) {
        this.IDventa = IDventa;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void setIDempleado(int IDempleado) {
        this.IDempleado = IDempleado;
    }

    public void setMontototal(Float montototal) {
        this.montototal = montototal;
    }

    public void setDiaventa(String Diaventa) {
        this.Diaventa = Diaventa;
    }

    public void setMesventa(String Mesventa) {
        this.Mesventa = Mesventa;
    }

    public void setAñoventa(String Añoventa) {
        this.Añoventa = Añoventa;
    }

    public void setMinutoventa(String Minutoventa) {
        this.Minutoventa = Minutoventa;
    }

    public void Venta(String codpro, String prod, String cant, String car, String elid) {
        Connection con = null;
        PreparedStatement s;

        String url = "jdbc:://Agustin-PC:1433;databaseName=Negocio";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String user = "usuario_java";
        String clave = "123";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, clave);

            s = con.prepareStatement("insert into Venta values (?,?,?,?,?,?,?,?)");

            s.setString(1, codpro);
            s.setString(2, prod);
            s.setString(3, cant);

            s.setString(4, car);
            Fecha a = new Fecha();
            a.FechaMovimiento();

            s.setString(5, a.getDd());
            s.setString(6, a.getMm());
            s.setString(7, a.getAa());
            s.setString(8, elid);
            s.executeUpdate();

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
