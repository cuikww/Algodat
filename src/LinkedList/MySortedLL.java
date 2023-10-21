package LinkedList;
import algodatb2023.hewan.Hewan;

public class MySortedLL {
    private MyNode head = null;

    public void add(MyNode newNode) {
        if (head == null || compare(newNode.getElemen().getNama(), head.getElemen().getNama()) < 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            MyNode current = head;
            while (current.getNext() != null && compare(newNode.getElemen().getNama(), current.getNext().getElemen().getNama()) > 0) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
    }

    private int compare(String str1, String str2) {
        
        int minLength = 0;
        if(str1.length() <= str2.length()){
            minLength =str1.length();
        }
        else{
            minLength = str2.length();
        }

        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);
            
            if(str1.charAt(i)>90){
                char1 = str1.charAt(i) ;
                char1 -= 32;
                
            } 
            if(str2.charAt(i)>90){
                char2 = str2.charAt(i);
                char2 -= 32;
            }

            
            if (char1 < char2) {
                return -1;
            } else if (char1 > char2) {
                return 1;
            }
        }
        return 0;
    }
    
    public void cetak() {
        MyNode current = head;
        System.out.println("===========");
        while (current != null) {
            Hewan h = current.getElemen();
            System.out.println(h.getNama());
            current = current.getNext();
        }
        System.out.println("===========");
    }
   
}
