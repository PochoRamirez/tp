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
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            sesion.save(articulo);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        } 
    }

    public void actualizaArticulo(Articulo articulo) throws HibernateException {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            sesion.update(articulo);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            HibernateUtil.manejaExcepcion(he);
        }
    }

    public void eliminaArticulo(Articulo articulo) throws HibernateException, IllegalStateException {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            articulo = (Articulo) sesion.get(Articulo.class, articulo.getIdArticulo());
            sesion.delete(articulo);
            sesion.getTransaction().commit();
        } catch (HibernateException he) { 
             HibernateUtil.manejaExcepcion(he);
        }
    }
    
    public void eliminarArticuloById(String id) throws HibernateException, IllegalStateException {
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            Articulo articulo = (Articulo) sesion.get(Articulo.class, id);
            sesion.delete(articulo);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
             HibernateUtil.manejaExcepcion(he);
        }
    }

    public Articulo obtenArticulo(String NumArticulo) throws HibernateException {
        Articulo articulo = null;
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            articulo = (Articulo) sesion.get(Articulo.class, NumArticulo);
            sesion.close();
        } catch (HibernateException he){
            HibernateUtil.manejaExcepcion(he);
        }
        return articulo;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Articulo> obtenListaArticulo() throws HibernateException {
         ArrayList<Articulo> listaArticulo = new  ArrayList<Articulo>();
        try {
            Session sesion = sesionFactory.getCurrentSession();
            sesion.beginTransaction();
            listaArticulo = (ArrayList<Articulo>)sesion.createQuery("from Articulo");
            sesion.close();
        } catch (HibernateException he){
            HibernateUtil.manejaExcepcion(he);
        }
        return listaArticulo;
    }
}
