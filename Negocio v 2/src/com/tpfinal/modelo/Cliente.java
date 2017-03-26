package com.tpfinal.modelo;

import java.util.Date;

public class Cliente {

    private int idCliente;
    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String domicilio;
    private Date fechaNacimiento;
    private String mail;
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
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public Cliente(String nombre, String apellido, String DNI, String telefono, String domicilio, Date fechaNacimiento, String mail) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
        this.mail = mail;
        this.fechaAlta = new Date();
    }
}