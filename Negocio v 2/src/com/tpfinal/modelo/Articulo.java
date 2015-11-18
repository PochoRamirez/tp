package com.tpfinal.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Desi
 */
public class Articulo {
    int idArticulo;
    String Nombre;
    String Marca;
    float Precio;
    int Stock;
    String Observaciones;
    String Descripcion;
    String Actividad;
    Date fechaAlta;

    public Articulo() {
    }

    public int getIDarticulo() {
        return idArticulo;
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

    public void setIDarticulo(int IDarticulo) {
        this.idArticulo = IDarticulo;
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

    public void Articulo( String Nombre, String Marca, String Precio, String Stock, String Observaciones, String Descripcion, String Actividad) {
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Precio = (float)Integer.parseInt(Precio);
        this.Stock = Integer.parseInt(Stock);
        this.Observaciones = Observaciones;
        this.Descripcion = Descripcion;
        this.Actividad = Actividad;
        this.fechaAlta = new Date();
    }

}
