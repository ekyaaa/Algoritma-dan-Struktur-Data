import java.util.Scanner;

public class menghitungIP {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        tampilan();
    }

    static void tampilan() {
        String pemisah = "=========================================================================================================================";
        
        System.out.println(pemisah);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - Program Menghitung IP - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println(pemisah);
        System.out.println();

        double [] input = inputanNilai();

        String [] konversi = konversiNilai(input);

        System.out.println();
        System.out.println(pemisah);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - Hasil Konversi Nilai - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println(pemisah);
        System.out.println();

        tampilanNilai(input, konversi);

        System.out.println("IP : " + konversi[17] + "  ||  " + konversi[8] );
    }

    static void tampilanNilai (double [] input, String [] data) {
        HorizontalGrid();
        System.out.printf("| %-3s| %-45s| %-20s| %-20s| %-20s|%n", "No", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        HorizontalGrid();
        System.out.printf("| %-3s| %-45s| %-20s| %-20s| %-20s|%n", "1.", "Pancasila", input[0], data[0], data[9]);
        HorizontalGrid();
        System.out.printf("| %-3s| %-45s| %-20s| %-20s| %-20s|%n", "2.", "Konsep Teknologi Informasi", input[1], data[1], data[10]);
        HorizontalGrid();
        System.out.printf("| %-3s| %-45s| %-20s| %-20s| %-20s|%n", "3.", "Cricital Thingking dan Problem Solving", input[2], data[2], data[11]);
        HorizontalGrid();
        System.out.printf("| %-3s| %-45s| %-20s| %-20s| %-20s|%n", "4.", "Matematika Dasar", input[3], data[3], data[12]);
        HorizontalGrid();
        System.out.printf("| %-3s| %-45s| %-20s| %-20s| %-20s|%n", "5.", "Bahasa Inggris", input[4], data[4],data[13]);
        HorizontalGrid();
        System.out.printf("| %-3s| %-45s| %-20s| %-20s| %-20s|%n", "6.", "Dasar Pemrograman", input[5], data[5], data[14]);
        HorizontalGrid();
        System.out.printf("| %-3s| %-45s| %-20s| %-20s| %-20s|%n", "7.", "Praktikum Dasar Pemrograman", input[6], data[6], data[15]);
        HorizontalGrid();
        System.out.printf("| %-3s| %-45s| %-20s| %-20s| %-20s|%n", "8.", "Keselamatan dan Kesehatan Kerja", input[7], data[7], data[16]);
        HorizontalGrid();
    }
    public static void HorizontalGrid () {
        System.out.printf("+%-4s+%-46s+%-21s+%-10s+%-21s+%n", "----", "----------------------------------------------", "---------------------", "---------------------", "---------------------");
    }

    static double [] inputanNilai() {
        double
            nilaiPancasila = 0,
            nilaiKTI = 0,
            nilaiCTPS = 0,
            nilaiMTK = 0,
            nilaiBIG = 0,
            nilaiDaspro = 0,
            nilaiPDaspro = 0,
            nilaiK3 = 0;
        boolean condition = true;

            while (condition) {
                System.out.print("Masukkan nilai angka untuk MK Pancasila : ");
                nilaiPancasila = scan.nextDouble();
                if (nilaiPancasila >= 0 && nilaiPancasila <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
            condition = true;

            while (condition) {
                System.out.print("Masukkan nilai angka untuk MK KTI : ");
                nilaiKTI = scan.nextDouble();
                if (nilaiKTI >= 0 && nilaiKTI <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
            condition = true;
        
            while (condition) {
                System.out.print("Masukkan nilai angka untuk MK CTPS : ");
                nilaiCTPS = scan.nextDouble();
                if (nilaiCTPS >= 0 && nilaiCTPS <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
            condition = true;
        
            while (condition) {
                System.out.print("Masukkan nilai angka untuk MK MTK : ");
                nilaiMTK = scan.nextDouble();
                if (nilaiMTK >= 0 && nilaiMTK <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
            condition = true;
        
            while (condition) {
                System.out.print("Masukkan nilai angka untuk MK BIG : ");
                nilaiBIG = scan.nextDouble();
                if (nilaiBIG >= 0 && nilaiBIG <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
            condition = true;
        
            while (condition) {
                System.out.print("Masukkan nilai angka untuk MK Daspro : ");
                nilaiDaspro = scan.nextDouble();
                if (nilaiDaspro >= 0 && nilaiDaspro <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
            condition = true;
        
            while (condition) {
                System.out.print("Masukkan nilai angka untuk MK Daspro : ");
                nilaiDaspro = scan.nextDouble();
                if (nilaiDaspro >= 0 && nilaiDaspro <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
            condition = true;
        
            while (condition) {
                System.out.print("Masukkan nilai angka untuk MK Praktek Daspro : ");
                nilaiPDaspro = scan.nextDouble();
                if (nilaiPDaspro >= 0 && nilaiPDaspro <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
            condition = true;
        
            while (condition) {
                System.out.print("Masukkan nilai angka untuk MK K3 : ");
                nilaiK3 = scan.nextDouble();
                if (nilaiK3 >= 0 && nilaiK3 <= 100) {
                    condition = false;
                } else {
                    System.out.println("Nilai tidak valid");
                }
            }
            condition = true;
        
        double [] dataNilai = {nilaiPancasila, nilaiKTI, nilaiCTPS, nilaiMTK, nilaiBIG, nilaiDaspro, nilaiPDaspro, nilaiK3};

        return dataNilai;
    }

    static String [] konversiNilai(double [] input) {

        // Konversi Untuk Nilai Huruf
        String [] dataNilaiHuruf = dataKonversiNilaiHuruf(input);

        // Konversi Untuk Bobot Nilai
        String [] dataBobotNilai = dataKonversiBobotNilai(input);

        // Rata-Rata Dari Nilai Konversi Masing-Masing Berada Pada Index 8
        String [] dataKonversiAll = {

            // Data untuk nilai huruf
            dataNilaiHuruf[0],
            dataNilaiHuruf[1],
            dataNilaiHuruf[2],
            dataNilaiHuruf[3],
            dataNilaiHuruf[4],
            dataNilaiHuruf[5],
            dataNilaiHuruf[6],
            dataNilaiHuruf[7],
            dataNilaiHuruf[8],

            // Data untuk bobot nilai
            dataBobotNilai[0],
            dataBobotNilai[1],
            dataBobotNilai[2],
            dataBobotNilai[3],
            dataBobotNilai[4],
            dataBobotNilai[5],
            dataBobotNilai[6],
            dataBobotNilai[7],
            dataBobotNilai[8]
        };

        return dataKonversiAll;
    }

    static String [] dataKonversiNilaiHuruf(double [] input) {
        String 
            nilaiHurufPancasila,
            nilaiHurufKTI,
            nilaiHurufCTPS,
            nilaiHurufMTK,
            nilaiHurufBIG,
            nilaiHurufDaspro,
            nilaiHurufPDaspro,
            nilaiHurufK3,
            nilaiHurufRataRata;

        // Konversi Untuk Nilai Huruf
        nilaiHurufPancasila = konversiNilaiHuruf(input[0]);
        nilaiHurufKTI = konversiNilaiHuruf(input[1]);
        nilaiHurufCTPS = konversiNilaiHuruf(input[2]);
        nilaiHurufMTK = konversiNilaiHuruf(input[3]);
        nilaiHurufBIG = konversiNilaiHuruf(input[4]);
        nilaiHurufDaspro = konversiNilaiHuruf(input[5]);
        nilaiHurufPDaspro = konversiNilaiHuruf(input[6]);
        nilaiHurufK3 = konversiNilaiHuruf(input[7]);
        nilaiHurufRataRata = konversiNilaiHuruf((input[0] + input[1] + input[2] + input[3] + input[4] + input[5] + input[6] + input[7]) / 8);
        
        String [] dataKonversiNilaiHuruf = {
            nilaiHurufPancasila,
            nilaiHurufKTI,
            nilaiHurufCTPS,
            nilaiHurufMTK,
            nilaiHurufBIG,
            nilaiHurufDaspro,
            nilaiHurufPDaspro,
            nilaiHurufK3,
            nilaiHurufRataRata
        };

        return dataKonversiNilaiHuruf;
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

    static String [] dataKonversiBobotNilai(double [] input) {
        String
            nilaiPancasila,
            nilaiKTI ,
            nilaiCTPS,
            nilaiMTK,
            nilaiBIG,
            nilaiDaspro,
            nilaiPDaspro,
            nilaiK3,
            rataRataBobotNilai;

        nilaiPancasila = pembulatanBobotNilai(input[0]/25);
        nilaiKTI = pembulatanBobotNilai(input[1]/25);
        nilaiCTPS = pembulatanBobotNilai(input[2]/25);
        nilaiMTK = pembulatanBobotNilai(input[3]/25);
        nilaiBIG = pembulatanBobotNilai(input[4]/25);
        nilaiDaspro = pembulatanBobotNilai(input[5]/25);
        nilaiPDaspro = pembulatanBobotNilai(input[6]/25);
        nilaiK3 = pembulatanBobotNilai(input[7]/25);
        rataRataBobotNilai = pembulatanBobotNilai(((input[0] + input[1] + input[2] + input[3] + input[4] + input[5] + input[6] + input[7]) / 8) / 25);

        String [] dataBobotNilai = {
            nilaiPancasila,
            nilaiKTI ,
            nilaiCTPS,
            nilaiMTK,
            nilaiBIG,
            nilaiDaspro,
            nilaiPDaspro,
            nilaiK3,
            rataRataBobotNilai
        };

        return dataBobotNilai;
    }

    static String pembulatanBobotNilai (double nilai) {
        String Hasil  = Double.toString(nilai);

        int indexTitik = Hasil.indexOf('.');   

        if (indexTitik != -1 && indexTitik + 3 < Hasil.length()) {
        Hasil = Hasil.substring(0, indexTitik + 3);
        }

        return Hasil;
    }
}
