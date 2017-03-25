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
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            sesion.save(empleado);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        }
    }

    public void actualizaEmpleado(Empleado empleado) throws HibernateException {
        try {

            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            sesion.update(empleado);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        }
    }

    public void eliminaEmpleado(Empleado empleado) throws HibernateException, IllegalStateException {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            sesion.delete(empleado);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        }
    }

    public void eliminarEmpleadoById(String idEmpleado) throws HibernateException {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            Empleado empleado = (Empleado) sesion.get(Empleado.class, Integer.parseInt(idEmpleado));
            sesion.delete(empleado);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        }
    }
    
    public Empleado obtenEmpleado(String idEmpleado) throws HibernateException {
        Empleado empleado = new Empleado();
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            empleado = (Empleado) sesion.get(Empleado.class, Integer.parseInt(idEmpleado));
            sesion.close();
        } catch (HibernateException he){
            HibernateUtil.manejaExcepcion(he);
        }
        return empleado;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Empleado> obtenListaEmpleado() throws HibernateException {
        ArrayList<Empleado> listaEmpleado = new ArrayList<Empleado>();

        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            listaEmpleado = (ArrayList<Empleado>) sesion.createQuery("from Empleado").list();
            sesion.close();
        } catch (HibernateException he){
            HibernateUtil.manejaExcepcion(he);
        }
        return listaEmpleado;
    }
}