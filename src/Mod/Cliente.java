/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod;

/**
 *
 * @author rosaura
 */
public class Cliente {
    private int articulos;
    private Hora horaLlegada;
    private int horaTotal;
    private Hora horaSalida;
    private int left;
    private int fila;
    
    public Cliente(int articulos, int f) {
        this.articulos = articulos;
        setHoraLlegada(null);
        setHoraTotal(0);
        setHoraSalida(null);
        setLeft(articulos);
        setFila(f);
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getFila() {
        return fila;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getLeft() {
        return left;
    }
    
    public Hora getHoraLlegada() {
        return horaLlegada;
    }

    public int getHoraTotal() {
        return horaTotal;
    }

    public Hora getHoraSalida() {
        return horaSalida;
    }

    public void setHoraLlegada(Hora horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public void setHoraTotal(int horaTotal) {
        this.horaTotal = horaTotal;
    }

    public void setHoraSalida(Hora horaSalida) {
        this.horaSalida = horaSalida;
    }
    


    public int getArticulos() {
        return articulos;
    }

    public void setArticulos(int articulos) {
        this.articulos = articulos;
    }
    
}
