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
public class DeLinkList {
    private DeLink first;
     private DeLink last;
    
    public DeLinkList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first==null);
    }
    
    public void insertFirst(Cliente dd) { 
        DeLink newLink = new DeLink(dd);
        if(isEmpty()){
            last = newLink;
        }
        newLink.next=first;
        first = newLink;
    }
    public Cliente deleteFirst() {
        DeLink temp=null; 
        if(!isEmpty()){
            temp = first;
            first = first.next;
        }
        return temp.dData; 
    }
    
    public void insertLast(Cliente dd) { 
        DeLink newLink = new DeLink(dd);
        if(isEmpty()){
            first = newLink;
        }else{
            DeLink current = first;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newLink;
        }
        last = newLink;
        
    }
    
    public DeLink deleteLast(){
        DeLink temp = null;
        DeLink current=first;
        if(!isEmpty()){
            while(current.next!=last){
                current=current.next;
            }
            current.next=null;
            temp= last;
            last=current; 
            return temp;
        }else{
            return null;
        }
        
    }
    
    public DeLink delete(Cliente key) {
        DeLink current = first;
        DeLink previous = first;
        while(current.dData != key) {
            if(current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
        
        if(current == first)
            first = first.next;
        else 
            previous.next = current.next;
        return current;
    }
    
    public DeLink find(Cliente key) { 
        DeLink current = first; 
        while(current.dData != key) {
            if(current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }
    
    public String displayList() {
        String List="";
        DeLink current = first;
        while(current != null) {
            List+=current.displayDeLink(); 
            current = current.next; 
        }
        return List;
    }
    public DeLink getFirst(){
        return first;
    }
    public DeLink getLast(){
        return last;
    }

    public void setFirst(Cliente first) {
        this.first.dData = first;
    }

    public void setLast(Cliente last) {
        this.last.dData = last;
    }
    
}
