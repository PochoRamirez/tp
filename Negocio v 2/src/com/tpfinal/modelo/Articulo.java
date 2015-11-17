package com.tpfinal.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Desi
 */
public class Articulo {

    int IDarticulo;
    String Nombre;
    String Marca;
    float Precio;
    int Stock;
    String Observaciones;
    String Descripcion;
    String Actividad;
    String DiaAlta;
    String MesAlta;
    String AñoAlta;

    public Articulo() {
    }

    public int getIDarticulo() {
        return IDarticulo;
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

    public String getDiaAlta() {
        return DiaAlta;
    }

    public String getMesAlta() {
        return MesAlta;
    }

    public String getAñoAlta() {
        return AñoAlta;
    }

    public void setIDarticulo(int IDarticulo) {
        this.IDarticulo = IDarticulo;
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

    public void setDiaAlta(String DiaAlta) {
        this.DiaAlta = DiaAlta;
    }

    public void setMesAlta(String MesAlta) {
        this.MesAlta = MesAlta;
    }

    public void setAñoAlta(String AñoAlta) {
        this.AñoAlta = AñoAlta;
    }

    public void Articulo(int IDarticulo, String Nombre, String Marca, float Precio, int Stock, String Observaciones, String Descripcion, String Actividad, String DiaAlta, String MesAlta, String AñoAlta) {
        this.IDarticulo = IDarticulo;
        this.Nombre = Nombre;
        this.Marca = Marca;
        this.Precio = Precio;
        this.Stock = Stock;
        this.Observaciones = Observaciones;
        this.Descripcion = Descripcion;
        this.Actividad = Actividad;
        this.DiaAlta = DiaAlta;
        this.MesAlta = MesAlta;
        this.AñoAlta = AñoAlta;
    }

}
