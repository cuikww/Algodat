package algodatb2023.myInteger;
public class Test {
    public static void main(String[] args){
        SkalaSpeed a = new SkalaSpeed();
        a.setValue(8);
        System.out.println(a.getValue());
        SkalaSpeed b = new SkalaSpeed();
        b.setValue(7);
        System.out.println(b.getValue());
        a.tambah(b);
        System.out.println(a.getValue());
        SkalaTermo x = new SkalaTermo();
        x.setValue(9);
        a.tambah(x);
        System.out.println(a.getValue());
    }
}
