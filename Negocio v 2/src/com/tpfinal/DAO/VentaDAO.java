package com.tpfinal.DAO;

import com.tpfinal.modelo.Venta;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Desi
 */
public class VentaDAO {

    private Session sesion;
    private Transaction tx;

    public String guardaVenta(Venta venta) throws HibernateException {
        String NumVenta = "0";

        try {
            this.iniciaOperacion();
            NumVenta = (String) sesion.save(venta);
            tx.commit();

        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.flush();
            sesion.close();
        }

        return NumVenta;
    }

    public void actualizaVenta(Venta venta) throws HibernateException {
        try {
            iniciaOperacion();
            sesion.update(venta);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public void eliminaVenta(Venta venta) throws HibernateException, IllegalStateException {
        try {
            iniciaOperacion();
            sesion.delete(venta);
            tx.commit();
        } catch (HibernateException he) {
            manejaExcepcion(he);
            throw he;
        } finally {
            sesion.close();
        }
    }

    public Venta obtenVenta(String NumVenta) throws HibernateException {
        Venta venta = null;
        try {
            iniciaOperacion();

            venta = (Venta) sesion.get(Venta.class, NumVenta);
        } finally {
            sesion.close();
        }

        return venta;
    }

    public Venta datosVenta(String NumVenta) throws HibernateException {
        Venta venta = null;
        try {
            iniciaOperacion();

            venta = (Venta) sesion.get(Venta.class, NumVenta);
        } finally {
            sesion.close();
        }

        return venta;
    }

    @SuppressWarnings("unchecked")
    public List<Venta> obtenListaVenta() throws HibernateException {
        List<Venta> listaVenta = null;

        try {
            iniciaOperacion();
            listaVenta = sesion.createQuery("from Venta").list();

        } finally {
            sesion.close();
        }

        return listaVenta;
    }

    private void iniciaOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = (Transaction) sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException, IllegalStateException {
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
    }

}
