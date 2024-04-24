package LatihanPraktikum;
import java.util.Scanner;

public class PraktikumMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianBukuPraktikum data = new PencarianBukuPraktikum();
        int jumBuku = 5;
        
        System.out.println("======================");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("======================");
            System.out.print("Masukkan kode buku \t : ");
            String kode = s.next();
            System.out.print("Masukkan judul buku \t : ");
            String judul = s1.next();
            System.out.print("Masukkan tahun terbit \t : ");
            int thnTerbit = s.nextInt();
            System.out.print("Masukkan pengarang \t : ");
            String pengarang = s1.next();
            System.out.print("Masukkan stock \t : ");
            int stock = s.nextInt();
            
            BukuPraktikum m = new BukuPraktikum(kode, judul, thnTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("======================");
        System.out.println("Data keseluruhan Buku setelah diurutkan: ");
        data.SortingBF();
        data.tampil();
        System.out.println("======================");
        System.out.println("Masukkan kode buku yang ingin dicari");
        System.out.print("Kode buku : ");
        String cari = s.next();

        int indexFind = data.FindBinarySearch(Integer.parseInt(cari), 0, jumBuku - 1);

        if (indexFind == -1) {
            System.out.println("data " + cari + " tidak ditemukan");
        } else {
            System.out.println("======================");
            System.out.println("Menggunakan sequential search");
            data.TampilData(Integer.parseInt(data.listBk[indexFind].kodeBuku), data.FindSeqSearch(indexFind) + 1);
    
            System.out.println("======================");
            System.out.println("Menggunakan binary search");
            data.TampilData(Integer.parseInt(data.listBk[indexFind].kodeBuku), data.FindBinarySearch(Integer.parseInt(cari), 0, jumBuku - 1));
        }

        System.out.println("======================");
        System.out.println("Masukkan judul buku yang ingin dicari ");
        System.out.print("Judul buku : ");
        String cariJudul = s1.next();
        
        System.out.println("======================");
        System.out.println("Menggunakan sequential search");
        System.out.println("======================");
        data.TampilData(Integer.parseInt(data.FindJudulBukuSeq(cariJudul).kodeBuku), Integer.parseInt(data.FindJudulBukuSeq(cariJudul).kodeBuku) - 1);
        

        System.out.println("======================");
        System.out.println("Menggunakan binary search");
        System.out.println("======================");
        data.TampilData(Integer.parseInt(data.FindJudulBukuBinary(cariJudul).kodeBuku), Integer.parseInt(data.FindJudulBukuBinary(cariJudul).kodeBuku));

        System.out.println("======================");

        if (data.isGanda == true) {
            System.out.println("--- T E R D A P A T   D A T A   G A N D A ---");
        }
    }
}