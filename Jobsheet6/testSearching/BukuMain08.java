package testSearching;
import java.util.Scanner;

public class BukuMain08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianBuku08 data = new PencarianBuku08();
        int jumBuku = 5;
        
        System.out.println("======================");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("======================");
            System.out.print("Masukkan kode buku \t : ");
            int kode = s.nextInt();
            System.out.print("Masukkan judul buku \t : ");
            String judul = s1.nextLine();
            System.out.print("Masukkan tahun terbit \t : ");
            int thnTerbit = s.nextInt();
            System.out.print("Masukkan pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Masukkan stock \t : ");
            int stock = s.nextInt();
            
            Buku m = new Buku(kode, judul, thnTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("======================");
        System.out.println("Data keseluruhan mahasiswa : ");
        System.out.println("======================");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();
        System.out.println("======================");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan kode buku yang ingin dicari : ");
        System.out.print("Kode buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
        
        Buku dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();

        System.out.println("======================");
        System.out.println("Menggunakan binary search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
