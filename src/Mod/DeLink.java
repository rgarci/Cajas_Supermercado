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
public class DeLink {
    public Cliente dData;
    public DeLink next; 

    public DeLink(Cliente dd) {
        dData = dd;
    }

    public String displayDeLink() {
        return ("{Cliente. Artículos: " + dData.getArticulos() + "}");
    }
}
