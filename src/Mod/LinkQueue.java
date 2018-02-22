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
public class LinkQueue {
    private DeLinkList list;

    public LinkQueue() {
        list = new DeLinkList();
    }
    public void insert(Cliente i){
        list.insertLast(i);
    }
    public Cliente remove(){
        
        return list.deleteFirst();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public String displayQueue(){
        return list.displayList();
    }
    public Cliente firstQueue(){
        return list.getFirst().dData;
    }
    public Cliente lastQueue(){
        return list.getLast().dData;
    }
    public void setFirst(Cliente c){
        list.setFirst(c);
    }
    public void setLast(Cliente c){
        list.setLast(c);
    }

    public DeLinkList getList() {
        return list;
    }
    
}
