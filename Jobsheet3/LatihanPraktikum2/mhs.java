public class mhs {
    String nama;
    int nim;
    char kelamin;
    double ipk;

    mhs(String nama, int nim, char kelamin, double ipk) {
    this.nama = nama;
    this.nim = nim;
    this.kelamin = kelamin;
    this.ipk = ipk;        
    }

    void tampilkan() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Nilai IPK : " + ipk);
    }
}
