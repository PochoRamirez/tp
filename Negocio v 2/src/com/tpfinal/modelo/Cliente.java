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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Desi
 */
public class Cliente {
    
    int IdCliente;
    String DNI;
    String Nombre;
    String Apellido;
    String Telefono;
    String Domicilio;
    String DiaNacimiento;
    String MesNacimiento;
    String AñoNacimiento;
    String Mail;
    Date fechaAlta;

    public Cliente() {
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getDomicilio() {
        return Domicilio;
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

    public String getMail() {
        return Mail;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
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

    public void setMail(String Mail) {
        this.Mail = Mail;
    }
    
    public void cliente(String Nombre, String Apellido, String DNI, String Telefono, String Domicilio, String DiaNacimiento, String MesNacimiento, String AñoNacimiento, String Mail) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Domicilio = Domicilio;
        this.DiaNacimiento = DiaNacimiento;
        this.MesNacimiento = MesNacimiento;
        this.AñoNacimiento = AñoNacimiento;
        this.Mail = Mail;
        Date d = new Date();
        this.fechaAlta = d;
        
    }

    
}
