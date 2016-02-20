package com.tpfinal.DAO;

import com.tpfinal.modelo.Empleado;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Desi
 */
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
            manejaExcepcion(he);
            throw he;
        } finally {
            sesionFactory.close();
        }
    }

    public void actualizaCurso(Empleado empleado) throws HibernateException {
        try {

            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.update(empleado);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
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
            manejaExcepcion(he);
            throw he;
        } finally {
            sesionFactory.close();
        }
    }

    public Empleado obtenEmpleado(String NumEmpleado) throws HibernateException {
        Empleado empleado = null;
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();

            empleado = (Empleado) sesion.get(Empleado.class, NumEmpleado);
        } finally {
            sesionFactory.close();
        }

        return empleado;
    }

    public Empleado datosEmpleado(String NumEmpleado) throws HibernateException {
        Empleado empleado = null;
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
    public List<Empleado> obtenListaEmpleado() throws HibernateException {
        List<Empleado> listaEmpleado = null;

        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            listaEmpleado = sesion.createQuery("from Empleado").list();

        } finally {
            sesionFactory.close();
        }

        return listaEmpleado;
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException, IllegalStateException {
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

//            JOptionPane.showMessageDialog(null, "Datos borrados correctamente");
//
//        } catch (ClassNotFoundException e) {
//            JOptionPane.showMessageDialog(null, e);
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
    }


