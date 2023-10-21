package algodatb2023.hewan;
public class AlgodatB2023 {
    public static void main(String[] args) {
        Ikan emas1 = new Ikan();
        emas1.setNama("Ikan mas");
        emas1.setWarna("Emas");
        System.out.println("Nama Ikan: "+emas1.getNama());
        System.out.println("Warna Ikan: "+emas1.getWarna());
        emas1.bergerak();
        Gajah g1 = new Gajah();
        g1.setNama("Gajah 1");
        g1.setWarna("Hitam");
        System.out.println("Nama Gajah: "+g1.getNama());
        System.out.println("Warna Gajah: "+g1.getWarna());
        g1.bergerak();
        Penjual p = new Penjual();
        p.menjual(g1);
        p.menjual(emas1);
    }
}
