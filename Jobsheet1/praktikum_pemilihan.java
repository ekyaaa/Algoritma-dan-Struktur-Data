import java.util.Scanner;

public class praktikum_pemilihan {
    public static void main(String[] args) {
        tampilan();
    }

    static void tampilan() {
        Scanner scan = new Scanner(System.in);
        String pemisah = "===============================";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println(pemisah);
        
        double [] input = inputanNilai();

        System.out.println(pemisah);
        String hasil [] = konversiNilai(input[0], input[1], input[2], input[3]);

        System.out.println(pemisah);
        System.out.println("Nilai akhir : " + hasil[0]);
        System.out.println("Nilai angka : " + hasil[1]);
        System.out.println(pemisah);
        System.out.println(pemisah);

        if (Double.parseDouble(hasil[0]) > 50) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("SELAMAT ANDA GAGAL");
        }
    }

    static double[] inputanNilai() {
        Scanner scan = new Scanner(System.in);
        double
            nilaiTugas = 0,
            nilaiKuis = 0,
            nilaiUTS = 0,
            nilaiUAS = 0;
        boolean condition = true;

            while (condition) {
                System.out.print("Masukkan Nilai Tugas : ");
                nilaiTugas = scan.nextDouble();
                if (nilaiTugas >= 0 && nilaiTugas <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
            condition = true;
            while (condition) {
                System.out.print("Masukkan Nilai Kuis : ");
                nilaiKuis = scan.nextDouble();

                if (nilaiKuis >= 0 && nilaiKuis <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
            condition = true;
            while (condition) {
                System.out.print("Masukkan Nilai UTS : ");
                nilaiUTS = scan.nextDouble();

                if (nilaiUTS >= 0 && nilaiUTS <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
            condition = true;
            while (condition) {
                System.out.print("Masukkan Nilai UAS : ");
                nilaiUAS = scan.nextDouble();

                if (nilaiUAS >= 0 && nilaiUAS <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }

            double [] input = {nilaiTugas,nilaiKuis,nilaiUTS,nilaiUAS};
            return input;
        }

    static String [] konversiNilai(
        double nilaiTugas,
        double nilaiKuis,
        double nilaiUTS,
        double nilaiUAS
    ) {
        double
            hasilTugas,
            hasilKuis,
            hasilUTS,
            hasilUAS,
            hasilRataRata;
        String nilaiHuruf;

        hasilTugas = konversiKeRataRata(nilaiTugas, 0.2);
        hasilKuis = konversiKeRataRata(nilaiKuis, 0.2);
        hasilUTS = konversiKeRataRata(nilaiUTS, 0.3);
        hasilUAS = konversiKeRataRata(nilaiUAS, 0.3);

        hasilRataRata = hasilKuis + hasilTugas + hasilUAS + hasilUTS;

        nilaiHuruf = konversiNilaiHuruf(hasilRataRata);

        String hasil [] = {String.valueOf(hasilRataRata), nilaiHuruf};
        return hasil;
    }

    static double konversiKeRataRata (double nilai, double persen) {
        return nilai * persen;
    }

    static String konversiNilaiHuruf(double nilai) {
        if (nilai <= 39) {
            return "E";
        }
        else if (39 < nilai && nilai <= 50) {
            return "D";
        }
        else if (50 < nilai && nilai <= 60) {
            return "C";
        }
        else if (60 < nilai && nilai <= 65) {
            return "C+";
        }
        else if (65 < nilai && nilai <= 73) {
            return "B";
        }
        else if (73 < nilai && nilai <= 80) {
            return "B+";
        }
        else if (80 < nilai && nilai <= 100) {
            return "A";
        } else {
            return "impossible";
        }
    }
}