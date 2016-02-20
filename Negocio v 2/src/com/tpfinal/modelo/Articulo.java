package com.tpfinal.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Desi
 */
public class Articulo {

    private int idArticulo;
    private String Nombre;
    private String Marca;
    private float Precio;
    private int Stock;
    private String Observaciones;
    private String Descripcion;
    private String Actividad;
    private Date fechaAlta;

    private Set<Venta> ventas = new HashSet<Venta>();

    public Articulo() {
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Set<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(Set<Venta> ventas) {
        this.ventas = ventas;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public float getPrecio() {
        return Precio;
    }

    public int getStock() {
        return Stock;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }

    public void Articulo(String Nombre, String Marca, String Precio, int Stock, String Observaciones, String Descripcion, String Actividad) {
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Precio = (float) Integer.parseInt(Precio);
        this.Stock = Stock;
        this.Observaciones = Observaciones;
        this.Descripcion = Descripcion;
        this.Actividad = Actividad;
        this.fechaAlta = new Date();
    }

}
