package minggu5;
import java.util.Scanner;
public class showroomMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mobil dalam showroom anda : ");
        int n = sc.nextInt();

        showroom [] mobil = new showroom[n];

        for (int i = 0; i < mobil.length; i++) {
            mobil[i] = new showroom();

            System.out.println("==============================================");
            System.out.println("Masukkan data mobil showroom anda ke-" + (i+1));
            System.out.print("Merk : ");
            mobil[i].merk = sc.next();
            System.out.print("Tipe : ");
            mobil[i].tipe = sc.next();
            System.out.print("Tahun : ");
            mobil[i].tahun = sc.next();
            System.out.print("Top akselerasi : ");
            mobil[i].topAcc = sc.nextInt();
            System.out.print("Top Power : ");
            mobil[i].topPower = sc.nextInt();
            System.out.println("==============================================");
        }

        for (int i = 0; i < mobil.length; i++) {
            System.out.println("Data showroom anda : ");
            System.out.println("Merk : " + mobil[i].merk);
            System.out.println("Tipe : " + mobil[i].tipe);
            System.out.println("Tahun : " + mobil[i].tahun);
            System.out.println("Top akselerasi : " + mobil[i].topAcc);
            System.out.println("Top Power : " + mobil[i].topPower);
            System.out.println("==============================================");
        }

        System.out.println("Urutan akselerasi dari yang tertinggi ke terendah");
        
        showroom hasilDescendingBf []= mobil;
        showroom hasilDescendingDc []= mobil;
        
        hasilDescendingBf = showroom.BfDescending(mobil);
        hasilDescendingDc = showroom.DcDescending(mobil);
        
        System.out.println("==========================================================================================");
        System.out.println("Metode Brute Force : ");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println((i+1) + ". Mobil merk " + hasilDescendingBf[i].merk + " tipe " + hasilDescendingBf[i].tipe + " tahun " + hasilDescendingBf[i].tahun + " dengan top akselerasi " + hasilDescendingBf[i].topAcc);
        }
        System.out.println("==========================================================================================");
        System.out.println("Metode Divide and Conquer : ");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println((i+1) + ". Mobil merk " + hasilDescendingDc[i].merk + " tipe " + hasilDescendingDc[i].tipe + " tahun " + hasilDescendingDc[i].tahun + " dengan top akselerasi " + hasilDescendingDc[i].topAcc);
        }
        System.out.println("==========================================================================================");

        System.out.println();

        System.out.println("Urutan akselerasi dari yang terendah ke tertinggi : ");

        showroom hasilAscendingBf []= mobil;
        showroom hasilAscendingDc []= mobil;
        
        hasilAscendingBf = showroom.BfDescending(mobil);
        hasilAscendingDc = showroom.DcDescending(mobil);


        System.out.println("==========================================================================================");
        System.out.println("Metode Brute Force : ");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println((i+1) + ". Mobil merk " + hasilAscendingBf[i].merk + " tipe " + hasilAscendingBf[i].tipe + " tahun " + hasilAscendingBf[i].tahun + " dengan top akselerasi " + hasilAscendingBf[i].topAcc);
        }
        System.out.println("==========================================================================================");
        System.out.println("Metode Divide and Conquer : ");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println((i+1) + ". Mobil merk " + hasilAscendingDc[i].merk + " tipe " + hasilAscendingDc[i].tipe + " tahun " + hasilAscendingDc[i].tahun + " dengan top akselerasi " + hasilAscendingDc[i].topAcc);
        }
        System.out.println("==========================================================================================");


        System.out.println("Rata-rata top power : " + showroom.rataRataPower(mobil));
    }
}
