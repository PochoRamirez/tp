package com.tpfinal.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Articulo {

    private int idArticulo;
    private String nombre;
    private String marca;
    private float precio;
    private int stock;
    private String observaciones;
    private String descripcion;
    private String actividad;
    private Date fechaAlta;

    private Set<Venta> ventas = new HashSet<>();

    public Articulo() {
    }
    
    public Articulo(String nombre, String marca, float precio, int stock, String observaciones, String descripcion, String actividad) {
        this.setArticulo(nombre, marca, precio, stock, observaciones, descripcion, actividad);     
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
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getActividad() {
        return actividad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public void setArticulo(String nombre, String marca, float precio, int stock, String observaciones, String descripcion, String actividad) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.observaciones = observaciones;
        this.descripcion = descripcion;
        this.actividad = actividad;
        this.fechaAlta = new Date();
    }

}
