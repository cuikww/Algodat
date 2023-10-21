package LinkedList;
import algodatb2023.hewan.*;

public class MyCircularLL {
    private MyNode head = null;
    private MyNode tail = null;
    private MyNode current = null; 

        public void add(MyNode node){
            if (head == null){
                head = node;
                tail = node;
                tail.setNext(head);
                current = tail;
            } else {
                tail.setNext(node);
                tail = node;
                tail.setNext(head); 
                current = node;
                
        }
    }

    public void first() {
        current = head;
    }

    public void isLast() {
        if( current != null && current.getNext() == head){
            System.out.println("Current node adalah node terakhir.");
        }else{
            System.out.println("Current node BUKAN node terakhir.");
        }
            
    }

    public void advance() {
        if (current != null) {
            current = current.getNext();
        }
    }
    
    public MyNode retrieve() {
        return current;
    }
    
    public void cetak(){
        if (head == null) {
            return; 
        }
        current = head;
        System.out.println("===========");
        do {
            Hewan x = current.getElemen();
            System.out.println(x.getNama());
            current = current.getNext();

        } while (current != head);
        System.out.println("===========");
        current = tail;
    }
}
