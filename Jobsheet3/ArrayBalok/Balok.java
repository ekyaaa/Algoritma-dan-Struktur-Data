public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    public Balok(int sisi){
        panjang = sisi;
        lebar = sisi;
        tinggi = sisi;
    }
    public Balok() {
        
    }

    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}