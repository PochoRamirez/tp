package com.tpfinal.modelo;

import java.util.Date;

public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String domicilio;
    private String mail;
    private Date fechaNacimiento;
    private int telefono;
    private boolean actividad;
    private boolean administrador;
    private String contraseña;
    private int DNI;

    public Empleado() {

    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getDNI() {
        return DNI;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Empleado(boolean actividad) {
        this.actividad = actividad;
        this.administrador = false;
        this.contraseña = "asd";
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDomicilio(String Domicilio) {
        this.domicilio = Domicilio;
    }

    public void setMail(String Mail) {
        this.mail = Mail;
    }

    public boolean isActividad() {
        return actividad;
    }

    public void setActividad(boolean Actividad) {
        this.actividad = Actividad;
    }

    public void setEmpleado(String Nombre, String Apellido, String Domicilio, String Mail, int DNI, Date fechaNacimiento, int Telefono) {
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.domicilio = Domicilio;
        this.DNI = DNI;
        this.mail = Mail;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = Telefono;
    }
}