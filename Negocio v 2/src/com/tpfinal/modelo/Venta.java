package com.tpfinal.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Venta {

    private int idVenta;
    private int dni;
    private Set<Articulo> articulos = new HashSet<>();
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

}
