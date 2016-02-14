package com.tpfinal.modelo;

import java.util.Date;
import java.util.HashSet;

import java.util.Set;

/**
 *
 * @author Desi
 */
public class Venta {

    private int idVenta;
    private int dni;
    private Set<Articulo> articulos = new HashSet<Articulo>();
    private int idEmpleado;
    private int idCliente;
    private int monto;
    private Date fechaVenta;

    public Venta() {
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    

    public int getDni() {
        return dni;
    }

    public int getMonto() {
        return monto;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    
    public void setMonto(int monto) {
        this.monto = monto;
    }

//   public void Venta(String codpro, String prod, String cant, String car, String elid) {
//        try {
//        
//            s = con.prepareStatement("insert into Venta values (?,?,?,?,?,?,?,?)");
//
//            s.setString(1, codpro);
//            s.setString(2, prod);
//            s.setString(3, cant);
//
//            s.setString(4, car);
//            Fecha a = new Fecha();
//            a.FechaMovimiento();
//
//            s.setString(5, a.getDd());
//            s.setString(6, a.getMm());
//            s.setString(7, a.getAa());
//            s.setString(8, elid);
//            s.executeUpdate();
//
//        } catch (ClassNotFoundException e) {
//            JOptionPane.showMessageDialog(null, e);
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
}
