package algodatb2023.hewan;
public abstract class Hewan {
    String warna = "";
    String nama = "";
    public void setWarna(String w){
        warna = w;
    }
    public String getWarna(){
        return warna;
    }
    public void setNama(String n){
        nama = n;
    }
    public String getNama(){
        return nama;
    }
    public abstract void bergerak();
}
