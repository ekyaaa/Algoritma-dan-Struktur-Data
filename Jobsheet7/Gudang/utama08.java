import java.util.Scanner;

public class utama08 {
    public static void main(String[] args) {
        Gudang08 gudang = new Gudang08(7);
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan");
            System.out.println("4. Lihat Barang Teratas");
            System.out.println("5. Lihat Barang Terbawah");
            System.out.println("6. Cari Berdasarkan Kode");
            System.out.println("7. Cari Berdasarkan Nama Barang");
            System.out.println("8. Exit");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = input.nextInt();
                    System.out.print("Masukkan nama barang: ");
                    String nama = input.next();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = input.next();
                    Barang08 barangBaru = new Barang08(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.print("Masukkan kode barang: ");
                    String cari = input.next();
                    System.out.println(gudang.cariBarang08(cari, true));
                    break;
                case 7:
                    System.out.print("Masukkan nama barang: ");
                    String Cari = input.next();
                    System.out.println(gudang.cariBarang08(Cari, false));
                    System.exit(0);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
