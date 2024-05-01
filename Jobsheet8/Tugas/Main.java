package Tugas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();

        Queue antri = new Queue(jumlah);

        int pilih;
        do {
            Menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor HP : ");
                    int noHp = sc.nextInt();
                    sc.nextLine();

                    antri.Enqueue(new Pembeli(nama, noHp));
                    break;
                case 2:
                    Pembeli data = antri.Dequeue();
                    if (!"".equals(data.nama) && data.noHp != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHp);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama : ");
                    String cari = sc.nextLine();
                    antri.peekPosition(cari);
                    System.out.println();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }

    public static void Menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Terbelakang");
        System.out.println("6. Cek Antrian Dengan Nama");
        System.out.println("------------------------------------");
    }
}
