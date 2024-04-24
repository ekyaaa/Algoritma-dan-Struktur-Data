package layananTravel;

public class hotelService {
    static hotel rooms [] = new hotel[7];
    static int index = 0;

    void tambah (hotel m) {
        if (index < rooms.length) {
            rooms [index] = m;
            index++;
        }else {
            System.out.println("Data sudah penuh!!");
        }
    }


    static void tampil () {
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Hotel ke-" + (i + 1));
            System.out.println("Nama : " + rooms[i].nama);
            System.out.println("Kota : " + rooms[i].kota);
            System.out.println("Harga : " + rooms[i].harga);
            System.out.println("Bintang : " + rooms[i].bintang);
            System.out.println("================================");
        }
    }

    static void bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    hotel tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;
                }
            }
        }
    }


    static void selectionSort () {
        for (int i = 0; i < rooms.length - 1; i++) {
            int bmin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[bmin].bintang) {
                    bmin = j;
                }
            }
            hotel tmp = rooms[bmin];
            rooms[bmin] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
