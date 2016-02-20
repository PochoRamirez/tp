package com.tpfinal.modelo;

import java.util.Date;

/**
 *
 * @author Desi
 */
public class Empleado {

    private int idEmpleado;
    private String Nombre;
    private String Apellido;
    private String Domicilio;
    private String Mail;
    private Date fechaNacimiento;
    private int Telefono;
    private boolean Actividad;
    private boolean Administrador;
    private String Contraseña;
    private int DNI;

    public Empleado() {

    }

    public boolean isAdministrador() {
        return Administrador;
    }

    public void setAdministrador(boolean Administrador) {
        this.Administrador = Administrador;
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
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public Empleado(boolean Actividad) {
        this.Actividad = Actividad;
        this.Administrador = false;
        this.Contraseña = "asd";

    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
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

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public boolean isActividad() {
        return Actividad;
    }

    public void setActividad(boolean Actividad) {
        this.Actividad = Actividad;
    }

    public void Empleado(String Nombre, String Apellido, String Domicilio, String Mail, int DNI, Date fechaNacimiento, int Telefono) {

        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Domicilio = Domicilio;
        this.DNI = DNI;
        this.Mail = Mail;
        this.fechaNacimiento = fechaNacimiento;
        this.Telefono = Telefono;
    }

}
