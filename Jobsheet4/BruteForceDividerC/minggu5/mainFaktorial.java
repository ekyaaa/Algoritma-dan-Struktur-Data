package minggu5;
import java.util.Scanner;

public class mainFaktorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================");
        System.out.print("Masukkan jumlah elemen : ");
        int iJml = sc.nextInt();

        faktorial[] fk = new faktorial[iJml];

        for (int i = 0; i < iJml; i++) {
            fk[i] = new faktorial();
            System.out.println("Masukkan elemen ke-" + (i + 1));
            System.out.print("Nilai : ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("Hasil - Brute Force");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("Hasil - Divide and Conquer");

        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }

    }
}
