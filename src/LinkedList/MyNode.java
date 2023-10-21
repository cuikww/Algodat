package LinkedList;
import algodatb2023.hewan.Hewan;

public class MyNode {
    private Hewan elemen;
    private int index;
    private MyNode next;
    private MyNode prev;
    
    
    public MyNode(Hewan h){
        this.elemen = h;
        this.next = null;
        this.prev = null;
    }
    
    public MyNode(Hewan h, int idx){
        this.elemen = h;
        this.index = idx;
        this.next = null;
        this.prev = null;
    }
    
    public void setNext(MyNode n){
        this.next = n;
    }
    
    public void setPrev(MyNode n){
        this.prev = n;
    }
    
    public MyNode getNext(){
        return this.next;
    }
    
    public MyNode getPrev(){
        return this.prev;
    }
    
    public Hewan getElemen(){
        return this.elemen;
    }
    public int getIndex(){
        return this.index;
    }
}
 