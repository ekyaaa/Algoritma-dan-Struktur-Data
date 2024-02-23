public class Buku08 {
    String
        judul,
        pengarang;
    int 
        halaman,
        stok,
        harga,
        hargaTotal;
    double
        hargaAkhir,
        diskon;

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah Halaman : " + halaman);
        System.out.println("Sisa Stok : " + stok);
        System.out.println("Harga : Rp. " + harga);
        System.out.println("Untung : " + hargaAkhir);
        System.out.println("Diskon : " + diskon);
    }

    void terjual (int jml) {
        if (stok>=jml) {
            stok -= jml;
        } else {
            System.out.println("Stok habis...");
        }
        hitungHargaTotal(jml);
    }

    void restock (int jml) {
        stok += jml;
    }

    void gantiHarga (int hrg) {
        harga = hrg;
    }

    public Buku08 (String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    public Buku08() {
        
    }

    void hitungHargaTotal(int terjual) {
        hargaTotal = harga*terjual;
        diskon(hargaTotal);
    }

    void diskon(int hargaTotal) {
        if (hargaTotal > 150000) {
            diskon = hargaTotal * 0.12;
            hargaTotal -= diskon;
        } else if (hargaTotal > 75000 && hargaTotal <= 150000) {
            diskon = hargaTotal * 0.05;
            hargaTotal -= diskon;
        }
        hargaAkhir = hargaTotal;
    }
}


