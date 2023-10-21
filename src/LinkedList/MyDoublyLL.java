package LinkedList;
import algodatb2023.hewan.*;

public class MyDoublyLL {
    private MyNode head, tail = null;
    
    public void add(MyNode node){
        if (head == null){
            head = node;
            tail = node;
        }
        else{
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
    }
    
    public MyNode getHead(){
        return this.head;
    }

    public void cetakDariDepan(){
        MyNode p = this.head;
        
        System.out.println("===== cetakDariDepan =====");
        
        while (p.getNext()!=null){
            Hewan x = p.getElemen();
            System.out.println(x.getNama());
            p = p.getNext();
        }
        Hewan x = p.getElemen();
        System.out.println(x.getNama() + "\n===========");
    }
    
    public void cetakDariBelakang(){
        MyNode p = this.tail;
        System.out.println("===== cetakDariBelakang =====");

        while (p.getPrev()!=null){
            Hewan x = p.getElemen();
            System.out.println(x.getNama());
            p = p.getPrev();
        }
        Hewan x = p.getElemen();
        System.out.println(x.getNama() + "\n===========");
    }
}
