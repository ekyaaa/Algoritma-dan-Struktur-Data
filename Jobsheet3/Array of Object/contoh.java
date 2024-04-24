public class contoh {
    public static void main(String[] args) {

        Mahasiswa[][] daftarMahasiswa = new Mahasiswa[2][2];

        daftarMahasiswa[0][0] = new Mahasiswa("Mahmud", 20);
        daftarMahasiswa[0][1] = new Mahasiswa("Abdul", 22);
        daftarMahasiswa[1][0] = new Mahasiswa("Jekichan", 21);
        daftarMahasiswa[1][1] = new Mahasiswa("Papa Zola", 23);

        System.out.println("Daftar Mahasiswa:");
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("Kelas : " + (i+1));
            for (int j = 0; j < daftarMahasiswa[i].length; j++) {
                daftarMahasiswa[i][j].tampil();
            }
        }
    }
}

class Mahasiswa {
    String nama;
    int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampil() {
        System.out.println("Nama: " + nama + ", Umur: " + umur);
    }
}