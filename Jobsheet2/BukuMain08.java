public class BukuMain08 {
    public static void main(String[] args) {
        Buku08 bk1 = new Buku08();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denandra Prawiti";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi(); 
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku08 bk2 = new Buku08("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(30);
        bk2.tampilInformasi();

        Buku08 ekya = new Buku08("Cara Hidup Tenang Seperti Ekya", "Ekya Muhammad", 5, 100, 3000);
        ekya.terjual(11);
        ekya.tampilInformasi();
    }
}