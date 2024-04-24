import java.util.Scanner;

public class tampilan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        mhs[] mhs = new mhs[3];
        
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama : ");
            String nama = scan.next();
            System.out.print("Masukkan NIM : ");
            int nim = scan.nextInt();
            System.out.print("Masukkan Jenis Kelamin (L/P) : ");
            char kelamin = scan.next().charAt(0);
            System.out.print("Masukkan IPK : ");
            double ipk = scan.nextDouble();

            mhs[i] = new mhs(nama, nim, kelamin, ipk);
        }  

        System.out.println("===========================================");

        for (int i = 0; i < mhs.length; i++) {
            mhs[i].tampilkan();
            System.out.println("===========================================");
        }
        double dataIpk [] = new double[mhs.length];
        for (int i = 0; i < dataIpk.length; i++) {
            dataIpk[i] = mhs[i].ipk;
        }
        double rataRataIpk = rataRata(dataIpk);
        System.out.println("Rata-rata IPK = " + rataRataIpk);

        double [] dataIpkTertingi =  ipkTertinggi(dataIpk);
        System.out.println("Mahasiswa yang mendapatkan IPK Tertinggi : " + mhs[(int) dataIpkTertingi[1]].nama);
        System.out.println("Dengan nilai : " + dataIpkTertingi[0]);

        System.out.println("===========================================");
    }

    static double rataRata(double[] dataIpk) {
        double totalIpk = 0;
        for (int i = 0; i < dataIpk.length; i++) {
            totalIpk += dataIpk[i];
        }
        return totalIpk/dataIpk.length;
    }

    static double [] ipkTertinggi(double[] dataIpk) {
        double ipkTinggi = dataIpk[0];
        int indexMhs = 0;

        for (int index = 0; index < dataIpk.length; index++) {
            if (dataIpk[index] > ipkTinggi) {
                ipkTinggi = dataIpk[index];
                indexMhs = index;
            }
        }
        double ipkTertinggi[] = {ipkTinggi, indexMhs};
        return ipkTertinggi;
    }
}
