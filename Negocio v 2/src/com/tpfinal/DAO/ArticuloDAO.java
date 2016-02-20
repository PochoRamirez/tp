package com.tpfinal.DAO;

import com.tpfinal.modelo.Articulo;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Desi
 */
public class ArticuloDAO {

    SessionFactory sesionFactory = HibernateUtil.getSessionFactory();

    public void guardaArticulo(Articulo articulo) throws HibernateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();

            sesion.save(articulo);
            sesion.getTransaction().commit();

        } catch (HibernateException he) {
            
            throw he;
        } finally {
            sesionFactory.close();
        }
    }

    public void actualizaArticulo(Articulo articulo) throws HibernateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.update(articulo);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            
            throw he;
        } finally {
            sesionFactory.close();
        }
    }

    public void eliminaArticulo(Articulo articulo) throws HibernateException, IllegalStateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.delete(articulo);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            
            throw he;
        } finally {
            sesionFactory.close();
        }
    }

    public Articulo obtenArticulo(String NumArticulo) throws HibernateException {
        Articulo articulo = null;
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();

            articulo = (Articulo) sesion.get(Articulo.class, NumArticulo);
        } finally {
            sesionFactory.close();
        }

        return articulo;
    }

    public Articulo datosArticulo(String NumArticulo) throws HibernateException {
        Articulo articulo = null;
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();

            articulo = (Articulo) sesion.get(Articulo.class, NumArticulo);
        } finally {
            sesionFactory.close();
        }

        return articulo;
    }

    @SuppressWarnings("unchecked")
    public List<Articulo> obtenListaArticulo() throws HibernateException {
        List<Articulo> listaCurso = null;

        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            listaCurso = sesion.createQuery("from Articulo").list();

        } finally {
            sesionFactory.close();
        }

        return listaCurso;
    }
}
