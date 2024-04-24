public class ArrayBalok {
    public static void main(String[] args) {
        Balok[] blArray = new Balok [4];

        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);
        blArray[3] = new Balok();

        blArray[3].lebar = 40;
        blArray[3].panjang = 40;
        blArray[3].tinggi = 40;

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }

        Segitiga[] sgArray = new Segitiga[4];

        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Keliling Segitiga ke " + i + ": " + sgArray[i].hitungkeliling());
        }
        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Luas Segitiga ke " + i + ": " + sgArray[i].hitungLuas());
        }
    }
}