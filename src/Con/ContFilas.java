/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Con;

import Mod.Cliente;
import Mod.Hora;
import Mod.ModFilas;
import Vista.Frame;
import Vista.VistaFilas;
import javax.swing.JFrame;
/**
 *
 * @author rosaura
 */
public class ContFilas{
    private int filas;
    private ModFilas mod;
    private VistaFilas vista;
    private Frame f;

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public void setMod(ModFilas mod) {
        this.mod = mod;
    }

    public void setVista(VistaFilas vista) {
        this.vista = vista;
    }

    public void setF(Frame f) {
        this.f = f;
    }
    
    public void imprimirFilas(){
        String str ="";
        Hora h = new Hora();
        str += (String.format("\t\t%02d:%02d:%02d\n\n", h.getHora(),h.getMin(),h.getSeg()));
        str += mod.mostrarFilas();
        vista.getTafilas().setText(str);
    }
    public void imprimirlistos(){
        vista.getTalistos().setText(mod.mostrarListos());
    }
    public void nuevoC(int f, int ar){
        Cliente c = new Cliente(ar, f);
        c.setHoraLlegada(new Hora());
        mod.meterCliente(ar, f);
    }
    public void atenderAll(){
        for (int i = 0; i < filas; i++) {
            mod.atender(i);
        }
    }
    
    public int btnpressed(){
       filas = (int) Double.parseDouble(f.getTffilas().getText());
       f.dispose();
       vista.setVisible(true);
       mod.crearFilas(filas);
       return filas;
    }
}
