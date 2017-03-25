package com.tpfinal.DAO;

import com.tpfinal.modelo.Venta;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class VentaDAO {

    SessionFactory sesionFactory = HibernateUtil.getSessionFactory();

    public String guardaVenta(Venta venta) throws HibernateException {
        String NumVenta = "0";

        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            NumVenta = (String) sesion.save(venta);
            sesion.getTransaction().commit();

        }  catch (HibernateException he){
            HibernateUtil.manejaExcepcion(he);
        }

        return NumVenta;
    }

    public void actualizaVenta(Venta venta) throws HibernateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.update(venta);
            sesion.getTransaction().commit();
        }  catch (HibernateException he){
            HibernateUtil.manejaExcepcion(he);
        }
    }

    public void eliminaVenta(Venta venta) throws HibernateException, IllegalStateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.delete(venta);
            sesion.getTransaction().commit();
        } catch (HibernateException he){
            HibernateUtil.manejaExcepcion(he);
        }
    }

    public Venta obtenVenta(String NumVenta) throws HibernateException {
        Venta venta = null;
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();

            venta = (Venta) sesion.get(Venta.class, NumVenta);
        } catch (HibernateException he){
            HibernateUtil.manejaExcepcion(he);
        }

        return venta;
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Venta> obtenListaVenta() throws HibernateException {
        ArrayList<Venta> listaVenta = new ArrayList<Venta>();
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            listaVenta = (ArrayList<Venta>) sesion.createQuery("from Venta").list();
        } catch (HibernateException he){
            HibernateUtil.manejaExcepcion(he);
        }
        return listaVenta;
    }
}
