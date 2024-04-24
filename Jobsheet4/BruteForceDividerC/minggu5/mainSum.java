package minggu5;
import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Program menghitung keuntungan total (satuan juta, misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan yang ingin dihitung: ");
        int jumPer = sc.nextInt();
        System.out.println("==============================================");

        sum [] sm = new sum[jumPer];

        for (int i = 0; i < sm.length; i++) {
            System.out.print("Masukkan jumlah bulan yang ingin di hitung pada perusahaan ke-"+ (i+1) + " : ");
            int elm = sc.nextInt();
            sm[i] = new sum(elm);

            System.out.println("==============================================");
        }
        
        for (int i = 0; i < sm.length; i++) {
            System.out.println("Perusahaan ke-" + (i+1));
            for (int j = 0; j < sm[i].elemen; j++) {
                System.out.print("Masukkan bulan ke-" + (j+1) + " = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
            System.out.println("==============================================");
        }

        for (int i = 0; i < sm.length; i++) {
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan ke-" + (i+1) + " selama " + sm[i].elemen + " bulan adalah " + sm[i].totalBF(sm[i].keuntungan));
            System.out.println();
            System.out.println("Algoritma Divide and Conquer");
            System.out.println("Total keuntungan perusahaan ke-" + (i+1) +" selama " + sm[i].elemen + " bulan adalah " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
            System.out.println("==============================================");
        }

        double total = 0;

        for (int i = 0; i < sm.length; i++) {
            total = total + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1);
            System.out.println("Total keuntungan semua perusahaan adalah " + total);
        }

    }
}
