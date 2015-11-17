package com.tpfinal.modelo;

import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 *
 * @author Desi
 */
public class Fecha {

    String aa;
    String mm;
    String dd;

    public Fecha() {
    }

    public String getAa() {
        return aa;
    }

    public String getMm() {
        return mm;
    }

    public String getDd() {
        return dd;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public void FechaMovimiento() {

        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);

        aa = Integer.toString(año);
        mm = Integer.toString(mes + 1);
        dd = Integer.toString(dia);
    }

}
