package com.tpfinal.modelo;

import java.util.Date;

public class Cliente {

    private int idCliente;
    private String DNI;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Domicilio;
    private Date fechaNacimiento;
    private String Mail;
    private Date fechaAlta;

    public Cliente() {
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaAlta() {
        return fechaAlta;
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

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public Cliente(String Nombre, String Apellido, String DNI, String Telefono, String Domicilio, Date fechaNacimiento, String Mail) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Domicilio = Domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.Mail = Mail;
        this.fechaAlta = new Date();
    }
}