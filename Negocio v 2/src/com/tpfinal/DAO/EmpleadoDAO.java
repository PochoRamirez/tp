package com.tpfinal.DAO;

import com.tpfinal.modelo.Empleado;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmpleadoDAO {

    SessionFactory sesionFactory = HibernateUtil.getSessionFactory();

    public EmpleadoDAO() {

    }

    public void guardarEmpleado(Empleado empleado) throws HibernateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.save(empleado);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        } finally {
            sesionFactory.close();
        }
    }

    public void actualizaEmpleado(Empleado empleado) throws HibernateException {
        try {

            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.update(empleado);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        } finally {
            sesionFactory.close();
        }
    }

    public void eliminaEmpleado(Empleado empleado) throws HibernateException, IllegalStateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.delete(empleado);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        } finally {
            sesionFactory.close();
        }
    }

    public void eliminarEmpleadoById(String NumEmpleado) throws HibernateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            Empleado empleado = (Empleado) sesion.get(Empleado.class, NumEmpleado);
            sesion.delete(empleado);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        } finally {
            sesionFactory.close();
        }
    }
    
    public Empleado obtenEmpleado(String NumEmpleado) throws HibernateException {
        Empleado empleado = new Empleado();
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();

            empleado = (Empleado) sesion.get(Empleado.class, NumEmpleado);
        } finally {
            sesionFactory.close();
        }
        return empleado;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Empleado> obtenListaEmpleado() throws HibernateException {
        ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();

        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            listaEmpleado = (ArrayList<Empleado>) sesion.createQuery("from Empleado").list();

        } finally {
            sesionFactory.close();
        }

        return listaEmpleado;
    }
}