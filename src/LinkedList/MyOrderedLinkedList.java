package LinkedList;
import algodatb2023.hewan.*;

public class MyOrderedLinkedList {
    private MyNode head = null;

    public void add(MyNode node) {
        if (head == null) {
            head = node;
            
        } else {
            MyNode current = head;
            MyNode prev = null;
            
            while (current != null && node.getIndex() > current.getIndex()) {
                prev = current;
                current = current.getNext();
            }

            if (prev == null) {
                node.setNext(head);
                head = node;
            } else {
                prev.setNext(node);
                node.setNext(current);
            }
        }
    }

    public void cetak() {
        MyNode current = head;
        System.out.println("===========");
        while (current != null) {
            Hewan x = current.getElemen();
            System.out.println("Index: " + current.getIndex() + ", Nama: " + x.getNama());
            current = current.getNext();
        }
        System.out.println("===========");
    }

    
}
