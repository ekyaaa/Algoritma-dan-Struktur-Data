package minggu5;
import java.util.Scanner;
public class mainPangkat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean kondisi = true;

        while (kondisi == true) {
            System.out.println("=========================================");
            System.out.print("Masukkan jumlah elemen yang dihitung : ");
            int elemen = sc.nextInt();
    
            pangkat[] png = new pangkat[elemen];
    
            for (int i = 0; i < elemen; i++) {
                System.out.println("=========================================");
                System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
                int nilai = sc.nextInt();
                System.out.print("Masukkan nilai pemangkat : ");
                int pangkat = sc.nextInt();
    
                png [i] = new pangkat(nilai, pangkat);
            }
            System.out.println("=========================================");
            System.out.println("Pilih metode yang ingin anda digunakan: ");
            System.out.println("1. Brute Force");
            System.out.println("2. Divide and Conquer");
            System.out.println("3. Masukkan ulang nilai");
            System.out.println("0. Exit");
            System.out.print("Pilihan anda : ");
            int p = sc.nextInt();
            switch (p) {
                case 1:
                    System.out.println("=========================================");
                    System.out.println("Hasil pangkat - Brute Force");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                    }
                    kondisi = false;
                    break;
                case 2:
                    System.out.println("=========================================");
                    System.out.println("Hasil pangkat - Divide and Conquer");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                    }
                    kondisi = false;
                    break;
                case 3:
                    
                    break;
                default:
                    kondisi = false;
                    break;
            }
        }
    }
}
