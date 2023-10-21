package LinkedList;
import algodatb2023.hewan.*;
public class MyLinkedList1 {
    private MyNode head = null;
    private MyNode tail = null;
    private MyNode current = null; 

    public void add(MyNode node){
        if (head == null){
            head = node;
            tail = node;
            current = node; 
        } else {
            tail.setNext(node);
            tail = node;
            node.setNext(null);
        }
    }

    public void first() {
        current = head;
    }

    public void zeroth() {
        current = null;
    }

    public void advance() {
        if (current != null) {
            current = current.getNext();
        }
    }

    public boolean isLast() {
        return current != null && current == tail;
    }

    public boolean isInList() {
        MyNode p = head;
        while (p != null) {
            if (p == current) {
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    public MyNode retrieve() {
        return current;
    }

    public void insertNext(MyNode obj) {
        if (current != null) {
            obj.setNext(current.getNext());
            current.setNext(obj);
            if (current == tail) {
                tail = obj;
            }
        }
    }

    
    public void deleteNext() {
        if (current != null && current.getNext() != null) {
            MyNode toDelete = current.getNext();
            current.setNext(toDelete.getNext());
            if (toDelete == tail) {
                tail = current;
            }
        }
    }

    public MyNode getHead(){
        return this.head;
    }

}