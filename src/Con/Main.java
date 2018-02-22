/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Con;
import Vista.*;
import Mod.*;
import javax.swing.JOptionPane;
/**
 *
 * @author rosaura
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame f = new Frame();
        ContFilas con = new ContFilas();
        VistaFilas vis = new VistaFilas();
        ModFilas mod = new ModFilas();
        con.setVista(vis);
        con.setMod(mod);
        vis.setCont(con);
        mod.setCont(con);
        con.setF(f);
        f.setCon(con);
        try{
            f.setVisible(true);
            Hora h = new Hora();
            while(true){
              Hora k = new Hora();
              if(k.getSeg()!=h.getSeg()){
                  h=k;
                  con.atenderAll();
                  con.imprimirFilas();
                  con.imprimirlistos();
                }
            }  
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ha ingresado un dato no numérico");
        }
    }
    
}
