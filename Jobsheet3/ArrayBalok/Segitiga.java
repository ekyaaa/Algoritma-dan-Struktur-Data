public class Segitiga {
    public int alas;
    public int tinggi;

    Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));

    public double hitungkeliling() {
        return sisiMiring + alas + tinggi;
    }
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}