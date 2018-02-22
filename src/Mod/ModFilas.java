/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod;

import java.util.ArrayList;
import Con.ContFilas;
/**
 *
 * @author rosaura
 */
public class ModFilas {
    private ContFilas cont;
    private ArrayList<LinkQueue> filas = new ArrayList();
    private ArrayList<Cliente> listos = new ArrayList();
    public void crearFilas(int fil){
        for (int i = 0; i < fil; i++) {
            filas.add(new LinkQueue());
        }
    }

    public void setCont(ContFilas cont) {
        this.cont = cont;
    }
    
    public void meterCliente(int art, int f){
        Cliente c = new Cliente(art, f);
        c.setHoraLlegada(new Hora());
        filas.get(f).insert(c);
    }
    
    public void sacarCliente(int fila){
        Cliente c = filas.get(fila).remove();
        c.setHoraSalida(new Hora());
        listos.add(c); 
    }
    public String mostrarFilas(){
        String fil="";
        
        for (int i = 0; i <filas.size(); i++) {
            fil+= "Caja " + i + ":\t"+ filas.get(i).displayQueue()+"\n\n";
        }
        return fil;
    }
    public String mostrarListos(){
        String s="";
        for (int i = 0; i < listos.size(); i++) {
            s+=("Cliente{\n");
            s+=("Fila: "+listos.get(i).getFila()+"\n");
            s+=("Artículos: "+ listos.get(i).getArticulos()+"\n");
            s+=(String.format("Hora de llegada: %02d:%02d:%02d\n", listos.get(i).getHoraLlegada().getHora(),listos.get(i).getHoraLlegada().getMin(), listos.get(i).getHoraLlegada().getSeg()));
            s+=(String.format("Hora de llegada: %02d:%02d:%02d\n", listos.get(i).getHoraSalida().getHora(),listos.get(i).getHoraSalida().getMin(), listos.get(i).getHoraSalida().getSeg()));            
            s+=("Tiempo total: "+listos.get(i).getHoraTotal()+"s");
            s+="\n\n";
        }
        return s;
    }
    public void atender(int j){
        if(!filas.get(j).isEmpty()){
            DeLink k = filas.get(j).getList().getFirst();
            while(k!=null){
                k.dData.setHoraTotal(k.dData.getHoraTotal()+1);
                k=k.next;
            }
            Cliente c = filas.get(j).firstQueue();
            c.setLeft(c.getLeft()-1);
            if(c.getLeft()==0){
                sacarCliente(j);

            }else{
                filas.get(j).setFirst(c);
            }
            
        }
    }
}
