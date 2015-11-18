/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Empleado {
    int IDempleado;
    String Nombre;
    String Apellido;
    String Domicilio;
    String Mail;
    String DiaNacimiento;
    String MesNacimiento;
    String AñoNacimiento;
    String Telefono;
    boolean Actividad;
    boolean Administrador;
    String Contraseña;
    String DNI;

    public Empleado() {
    }

    public boolean isAdministrador() {
        return Administrador;
    }

    public void setAdministrador(boolean Administrador) {
        this.Administrador = Administrador;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public Empleado(boolean Actividad) {
        this.Actividad = Actividad;
        this.Administrador = false;
        this.Contraseña = "";
    
    }
    
    public int getIDempleado() {
        return IDempleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    
    public String getApellido() {
        return Apellido;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public String getMail() {
        return Mail;
    }

    public String getDiaNacimiento() {
        return DiaNacimiento;
    }

    public String getMesNacimiento() {
        return MesNacimiento;
    }

    public String getAñoNacimiento() {
        return AñoNacimiento;
    }

    public void setIDempleado(int IDempleado) {
        this.IDempleado = IDempleado;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public void setDiaNacimiento(String DiaNacimiento) {
        this.DiaNacimiento = DiaNacimiento;
    }

    public void setMesNacimiento(String MesNacimiento) {
        this.MesNacimiento = MesNacimiento;
    }

    public void setAñoNacimiento(String AñoNacimiento) {
        this.AñoNacimiento = AñoNacimiento;
    }

    public boolean isActividad() {
        return Actividad;
    }

    public void setActividad(boolean Actividad) {
        this.Actividad = Actividad;
    }

    public void Empleado(String Nombre, String Apellido, String Domicilio, String Mail, String DNI, String DiaNacimiento, String MesNacimiento, String AñoNacimiento, String Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Domicilio = Domicilio;
        this.DNI = DNI;
        this.Mail = Mail;
        this.DiaNacimiento = DiaNacimiento;
        this.MesNacimiento = MesNacimiento;
        this.AñoNacimiento = AñoNacimiento;
        this.Telefono = Telefono;
        }  
}
