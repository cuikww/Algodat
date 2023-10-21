package algodatb2023.myInteger;
public abstract class MyInteger {
    //atributes
    //private supaya hanya bisa diakses oleh class ini sendiri
    private int value = 0;
    protected int min = 0;
    protected int max = 0;
    //behaviour
    public void setValue(int a){
        this.value = a;
    }
    public int getValue(){
        return this.value;
    }
    public void setMin(int a){
        this.min = a;
    }
    public int getMin(){
        return this.min;
    }
    public void setMax(int a){
        this.max = a;
    }
    public int getMax(){
        return this.max;
    }
    public void tambah(MyInteger a){
        this.value = this.value+a.getValue();
    }
    public abstract void setMinMax(int a, int b);
}
