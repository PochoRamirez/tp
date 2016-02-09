package com.tpfinal.modelo;

import com.tpfinal.DAO.HibernateUtil;
import java.io.Serializable;
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Desi
 */
public class Empleado implements Serializable {

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
        this.Contraseña = "";

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

    public void BorrarEmpleado(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ModificarEmpleado(String text, String text0, String text1, String text2, String text3, String text4, String text5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void CargarEmpleado(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void guardarEmpleado(Empleado empleado) throws HibernateException {
        SessionFactory sesionFactory = HibernateUtil.getSessionFactory();
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.save(empleado);

        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesionFactory.close();
        }
    }
     private void manejaExcepcion(HibernateException he) throws HibernateException, IllegalStateException {
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }
}
