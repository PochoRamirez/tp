package com.tpfinal.DAO;

import com.tpfinal.modelo.Cliente;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Desi
 */
public class ClienteDAO {

    SessionFactory sesionFactory = HibernateUtil.getSessionFactory();

    public void guardaCliente(Cliente cliente) throws HibernateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.save(cliente);
            sesion.getTransaction().commit();

        } catch (HibernateException he) {
            throw he;
        } finally {
            sesionFactory.close();
        }

        //return NumCliente;
    }

    public void actualizaCliente(Cliente cliente) throws HibernateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.update(cliente);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            throw he;
        } finally {
            sesionFactory.close();
        }
    }

    public void eliminaCliente(Cliente cliente) throws HibernateException, IllegalStateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.delete(cliente);

        } catch (HibernateException he) {
            System.err.print(he);
            throw he;
        } finally {
            sesionFactory.close();
        }
    }

    public Cliente obtenCliente(String NumCliente) throws HibernateException {
        Cliente cli = new Cliente();
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();

            cli = (Cliente) sesion.get(Cliente.class, NumCliente);
        } finally {
            sesionFactory.close();
        }

        return cli;
    }

    public Cliente datosCliente(String NumCliente) throws HibernateException {
        Cliente cliente = null;
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();

            cliente = (Cliente) sesion.get(Cliente.class, NumCliente);
        } finally {
            sesionFactory.close();
        }

        return cliente;
    }

    @SuppressWarnings("unchecked")
    public List<Cliente> obtenListaCliente() throws HibernateException {
        List<Cliente> listaCliente = null;

        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            listaCliente = sesion.createQuery("from Cliente").list();

        } finally {
            sesionFactory.close();
        }

        return listaCliente;
    }

    public void BorrarCliente(String dni) {
        Cliente cliente = new Cliente();
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();

            cliente = (Cliente) sesion.get(Cliente.class, dni);
            sesion.delete(cliente);
            JOptionPane.showMessageDialog(null, "Datos borrados correctamente");
        } catch (HibernateException he) {
            throw he;

        }
    }

    public void ModificarCiente(String Nombre, String Apellido, String DNI, String Telefono, String Domicilio, Date fechaNacimiento, String Mail) {
        Cliente cli = new Cliente(Nombre, Apellido, DNI, Telefono, Domicilio, fechaNacimiento, Mail);
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.update(cli);
            sesion.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Datos Modificados correctamente");

        } catch (HibernateException he) {
            JOptionPane.showMessageDialog(null, he);
        }

    }
}
