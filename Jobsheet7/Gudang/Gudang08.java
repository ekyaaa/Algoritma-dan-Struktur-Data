
public class Gudang08 {
    Barang08 [] tumpukan;
    int size;
    int top;
    
    public Gudang08(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang08[size];
        top = -1;
    }

    boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang08 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama +" berhasil ditambahkan ke tumpukan");
        } else {
            System.out.println("Tumpukan penuh");
        }
    }

    public Barang08 ambilBarang() {
        if (!cekKosong()) {
            Barang08 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama +" berhasil diambil dari tumpukan");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang08 lihatBarangTeratas() {
        if(!cekKosong()) {
            Barang08 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang08 lihatBarangTerbawah() {
        if(!cekKosong()) {
            Barang08 barangTeratas = tumpukan[0];
            System.out.println("Barang teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public String cariBarang08(String cari, boolean isPakaiKode) {
        try {
            if (isPakaiKode == true) {
                for (int i = 0; i < tumpukan.length; i++) {
                    if (Integer.parseInt(cari) == tumpukan[i].kode) {
                        return "Barang bernama " + tumpukan[i].nama + " Ditemukan";
                    } 
                } 
                return "Barang Tidak Ditemukan";
            } else {
                for (int i = 0; i < tumpukan.length; i++) {
                    if (cari.equalsIgnoreCase(tumpukan[i].nama)) {
                        return "Barang Ditemukan";
                    }
                }
                return "Barang Tidak Ditemukan";
            }
        } catch (Exception e) {
            return "Input Tidak Valid atau Barang Tidak Ditemukan";
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang : ");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }
    }

    public String konversiDesimalKeBiner (int kode) {
        StackKonversi08 stack = new StackKonversi08();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}

