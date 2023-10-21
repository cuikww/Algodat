package LinkedList;
import algodatb2023.hewan.Hewan;

public class MyNode1 {
    private Object elemen;
    private int index;
    private MyNode1 next;
    private MyNode1 prev;
    
    
    public MyNode1(Object h){
        this.elemen = h;
        this.next = null;
        this.prev = null;
    }
    
    public MyNode1(Object h, int idx){
        this.elemen = h;
        this.index = idx;
        this.next = null;
    }
    
    public void setNext(MyNode1 n){
        this.next = n;
    }
    
    public void setPrev(MyNode1 n){
        this.prev = n;
    }
    
    public MyNode1 getNext(){
        return this.next;
    }
    
    public MyNode1 getPrev(){
        return this.prev;
    }
    public void setElemen(Object obj){
        this.elemen = obj;
    }
    
    public Object getElemen(){
        return this.elemen;
    }
}
 