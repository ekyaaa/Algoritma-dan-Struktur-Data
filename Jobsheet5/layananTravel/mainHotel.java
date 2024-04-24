package layananTravel;
import java.util.Scanner;

/**
 * mainHotel
 */
public class mainHotel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        hotelService list = new hotelService();

        hotel h1 = new hotel("Hotel Borobudur", "Medan", 300000, (byte) 5);
        hotel h2 = new hotel("Hotel Kanumbungan", "Malang", 250000, (byte) 4);
        hotel h3 = new hotel("Hotel Babayangan", "Bondowoso", 450000, (byte) 5);
        hotel h4 = new hotel("Hotel Hasyim", "Jember", 384999, (byte) 4);
        hotel h5 = new hotel("Hotel Papabaya", "Probolinggo", 438291, (byte) 5);
        hotel h6 = new hotel("Hotel Bambangan", "Pasuruan", 378000, (byte) 4);
        hotel h7 = new hotel("Hotel Liakwati", "Jombang", 888222, (byte) 5);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);
        list.tambah(h6);
        list.tambah(h7);
        
        System.out.println("Pilih sorting yang diinginkan : ");
        System.out.println("1. Harga dimulai dari harga terumurah ke harga tertinggi");
        System.out.println("2. Rating bintang penginapan dari bintang tertinggi ke terendah");
        System.out.print("Pilihan anda : ");
        int pil = scan.nextInt();
        System.out.println("======================================");
        
        switch (pil) {
            case 1:
                hotelService.bubbleSort();
                hotelService.tampil();
                break;
            case 2:
                hotelService.selectionSort();
                hotelService.tampil();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }

    }
}