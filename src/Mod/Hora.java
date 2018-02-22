/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author rosaura
 */
public class Hora {
    private Calendar calendario = new GregorianCalendar();
    private int hora = calendario.get(Calendar.HOUR_OF_DAY);
    private int min = calendario.get(Calendar.MINUTE);
    private int seg = calendario.get(Calendar.SECOND);

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }
    
}
