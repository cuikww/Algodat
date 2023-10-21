package LinkedList;
import algodatb2023.hewan.*;

public class Test {
    public static void main(String[] args){
        
        System.out.println("=========== Singly ==========");
        MyLinkedList myList = new MyLinkedList();
        Ikan ikanMas = new Ikan();
        ikanMas.setNama("Ikan mas");
        MyNode node1 = new MyNode(ikanMas);
        myList.add(node1);

        Ikan ikanLele = new Ikan();
        ikanLele.setNama("Ikan Lele");
        MyNode node2 = new MyNode(ikanLele);
        myList.add(node2);

        Gajah gajah1 = new Gajah();
        gajah1.setNama("Gajah Sumatra");
        MyNode node3 = new MyNode(gajah1);
        myList.add(node3);

        myList.cetak();
        
        Ikan ikanGurami = new Ikan();
        ikanGurami.setNama("Ikan Gurami");
        System.out.println("======Search, isLast, getHead=====");
        if (myList.search(ikanGurami)) {
            System.out.println(ikanGurami.getNama() + " ada dalam daftar.");
        } else {
            System.out.println(ikanGurami.getNama() + " tidak ada dalam daftar.");
        }

        if (myList.isLast()) {
            System.out.println("Current node adalah node terakhir.");
        } else {
            System.out.println("Current node bukan node terakhir.");
        }

        MyNode headNode = myList.getHead();
        if (headNode != null) {
            Hewan headHewan = headNode.getElemen();
            System.out.println("Head dari linked list: " + headHewan.getNama());
        } else {
            System.out.println("Linked list kosong.");
        }

        // Pindah ke node pertama lalu maju ke node selanjutnya
        myList.first();
        myList.advance();

        Ikan ikanBaru = new Ikan();
        ikanBaru.setNama("Ikan Piranha");
        MyNode newNode = new MyNode(ikanBaru);
        myList.insertNext(newNode);

        System.out.println("===== Setelah Penyisipan ======");
        myList.cetak();
        
        System.out.println("===== Retrive ======"); 
        MyNode currentNode = myList.retrieve(); 
        Hewan x = currentNode.getElemen();
        Ikan i = (Ikan) x;
        i.bergerak();
        
        System.out.println("====== DeleteNext =====");
        currentNode = myList.retrieve();
        x = currentNode.getElemen();
        Hewan h = (Hewan) x;
        System.out.println("Current Node: " + h.getNama());
        myList.deleteNext(); 
        
        myList.cetak();
  
        System.out.println("=========== Doubly ==========");
        MyDoublyLL myDoubly = new MyDoublyLL();
        Ikan koi = new Ikan();
        koi.setNama("Ikan Koi");
        MyNode node1d = new MyNode(koi);
        myDoubly.add(node1d);
        
        Ikan nemo = new Ikan();
        nemo.setNama("Ikan Nemo");
        MyNode node2d = new MyNode(nemo);
        myDoubly.add(node2d);
        
        Gajah india = new Gajah();
        india.setNama("Gajah India");
        MyNode node3d = new MyNode(india);
        myDoubly.add(node3d);
        
        myDoubly.cetakDariDepan();
        myDoubly.cetakDariBelakang();
        
        System.out.println("=========== Circular ==========");
        MyCircularLL myCircular = new MyCircularLL();
        Kucing anggora = new Kucing();
        anggora.setNama("Kucing Anggora");
        MyNode node1c = new MyNode(anggora);
        myCircular.add(node1c);
        
        Ikan pari = new Ikan();
        pari.setNama("Ikan Pari");
        MyNode node2c = new MyNode(pari);
        myCircular.add(node2c);
        
        Gajah thailand = new Gajah();
        thailand.setNama("Gajah Thailand");
        MyNode node3c = new MyNode(thailand);
        myCircular.add(node3c);
        
        myCircular.cetak();
        myCircular.isLast();
        myCircular.first();
        myCircular.advance();
        myCircular.isLast();
        MyNode currentNodec = myCircular.retrieve(); 
        Hewan y = currentNodec.getElemen();
        Ikan j = (Ikan) y;
        j.bergerak();
     
        System.out.println("========== Ordered ==========");
        MyOrderedLinkedList MyOrdLL = new MyOrderedLinkedList();

        Ikan hiu = new Ikan();
        hiu.setNama("Hiu");
        MyNode node1o = new MyNode(hiu, 1);
        MyOrdLL.add(node1o);

        Ikan paus = new Ikan();
        paus.setNama("Paus");
        MyNode node2o = new MyNode(paus, 2);
        MyOrdLL.add(node2o);

        Kucing persia = new Kucing();
        persia.setNama("Kucing Persia");
        MyNode node3o = new MyNode(persia, 3);
        MyOrdLL.add(node3o);
        MyOrdLL.cetak();         
        
System.out.println("========== Sorted ==========");
MySortedLL mySort = new MySortedLL();

Ikan mujair = new Ikan();
mujair.setNama("Ikan Mujair");
MyNode node1s = new MyNode(mujair);
mySort.add(node1s);

Gajah gajah1s = new Gajah();
gajah1s.setNama("Gajah Rusia");
MyNode node3s = new MyNode(gajah1s);
mySort.add(node3s);

Ikan baronang = new Ikan();
baronang.setNama("Ikan Baronang");
MyNode node2s = new MyNode(baronang);
mySort.add(node2s);

mySort.cetak();         
}
}