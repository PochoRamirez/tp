package com.tpfinal.DAO;

import com.tpfinal.modelo.Venta;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Desi
 */
public class VentaDAO {

    SessionFactory sesionFactory = HibernateUtil.getSessionFactory();

    public String guardaVenta(Venta venta) throws HibernateException {
        String NumVenta = "0";

        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            NumVenta = (String) sesion.save(venta);
            sesion.getTransaction().commit();

        } catch (HibernateException he) {
                        throw he;
        } finally {
            
            sesionFactory.close();
        }

        return NumVenta;
    }

    public void actualizaVenta(Venta venta) throws HibernateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.update(venta);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            
            throw he;
        } finally {
            sesionFactory.close();
        }
    }

    public void eliminaVenta(Venta venta) throws HibernateException, IllegalStateException {
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            sesion.delete(venta);
            sesion.getTransaction().commit();
        } catch (HibernateException he) {
            
            throw he;
        } finally {
            sesionFactory.close();
        }
    }

    public Venta obtenVenta(String NumVenta) throws HibernateException {
        Venta venta = null;
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();

            venta = (Venta) sesion.get(Venta.class, NumVenta);
        } finally {
            sesionFactory.close();
        }

        return venta;
    }

    public Venta datosVenta(String NumVenta) throws HibernateException {
        Venta venta = null;
        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();

            venta = (Venta) sesion.get(Venta.class, NumVenta);
        } finally {
            sesionFactory.close();
        }

        return venta;
    }

    @SuppressWarnings("unchecked")
    public List<Venta> obtenListaVenta() throws HibernateException {
        List<Venta> listaVenta = null;

        try {
            Session sesion = sesionFactory.openSession();
            sesion.beginTransaction();
            listaVenta = sesion.createQuery("from Venta").list();

        } finally {
            sesionFactory.close();
        }

        return listaVenta;
    }


}
