package com.tpfinal.DAO;

import com.tpfinal.modelo.Cliente;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ClienteDAO {

    SessionFactory sesionFactory = HibernateUtil.getSessionFactory();

    public void guardaCliente(Cliente cliente) throws HibernateException {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            sesion.save(cliente);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        }  
    }

    public void actualizaCliente(Cliente cliente) throws HibernateException {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            sesion.update(cliente);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        }
    }

    public void eliminaCliente(Cliente cliente) throws HibernateException, IllegalStateException {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            sesion.delete(cliente);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        }
    }

    public Cliente obtenCliente(String NumCliente) throws HibernateException {
        Cliente cli = new Cliente();
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            cli = (Cliente) sesion.get(Cliente.class, NumCliente);
            sesion.close();
        }catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        }
        return cli;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Cliente> obtenListaCliente() throws HibernateException {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            listaCliente = (ArrayList<Cliente>) sesion.createQuery("from Cliente").list();
            sesion.close();
        }catch (HibernateException he){
            HibernateUtil.manejaExcepcion(he);
        }
        return listaCliente;
    }

    public void BorrarClienteByDNI(String dni) {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            Cliente cliente = (Cliente) sesion.createQuery("from Cliente where dni="+ dni).uniqueResult();
            sesion.delete(cliente);
            sesion.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Datos borrados correctamente");
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        }
    }

    public void ModificarCiente(String Nombre, String Apellido, String DNI, String Telefono, String Domicilio, Date fechaNacimiento, String Mail) {
        Cliente cli = new Cliente(Nombre, Apellido, DNI, Telefono, Domicilio, fechaNacimiento, Mail);
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            sesion.update(cli);
            sesion.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Datos Modificados correctamente");
        } catch (HibernateException he) {
            JOptionPane.showMessageDialog(null, he);
        }
    }
}
