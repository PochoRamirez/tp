package com.tpfinal.DAO;

import com.tpfinal.modelo.Articulo;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
            articulo = (Articulo) sesion.get(Articulo.class, articulo.getIdArticulo());
            sesion.delete(articulo);
            sesion.getTransaction().commit();
        } catch (HibernateException he) { 
            throw he;
        } finally {
            sesionFactory.close();
        }
    }
    
    public void eliminarArticuloById(String id) throws HibernateException, IllegalStateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            Articulo articulo = (Articulo) sesion.get(Articulo.class, id);
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

    @SuppressWarnings("unchecked")
    public ArrayList<Articulo> obtenListaArticulo() throws HibernateException {
         ArrayList<Articulo> listaArticulo = new  ArrayList<Articulo>();
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            listaArticulo = (ArrayList<Articulo>)sesion.createQuery("from Articulo");
        } finally {
            sesionFactory.close();
        }
        return listaArticulo;
    }
}
