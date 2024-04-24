import java.util.Scanner;

public class ArrayOfObjek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Bola[] bola = new Bola[2];
        Kerucut[] kerucut = new Kerucut[2];
        LimasS4[] limas = new LimasS4[2];

        for (int i = 0; i < 2; i++) {
            System.out.print("Input Jari-Jari Kerucut ke-" + (i+1) + " :");
            int r = scan.nextInt();
            System.out.print("Input Sisi Miring Kerucut ke-" + (i+1) + " :");
            int s = scan.nextInt();
            kerucut[i] = new Kerucut(r, s);
            System.out.println("==================================================================");
            
            System.out.print("Input Jari-Jari Bola ke-" + (i+1) + " :");
            int rr = scan.nextInt();
            
            bola[i] = new Bola(rr);
            System.out.println("==================================================================");

            System.out.print("Input Sisi Miring Limas Segi Empat ke-" + (i+1) + " :");
            int a = scan.nextInt();
            System.out.print("Input Sisi Alas Limas ke-" + (i+1) + " :");
            int t = scan.nextInt();
            limas[i] = new LimasS4(a, t);
            System.out.println("==================================================================");
        }

        for (int i = 0; i < limas.length; i++) {
            System.out.println("Luas permukaan Kerucut ke-" + (i+1) + " :" + kerucut[i].hitungLuas());
            System.out.println("Volume Kerucut ke-" + (i+1) + " :" + kerucut[i].hitungVolume());

            System.out.println("Luas permukaan Bola ke-" + (i+1) + " :" + bola[i].hitungLuas());
            System.out.println("Volume Bola ke-" + (i+1) + " :" + bola[i].hitungVolume());

            System.out.println("Luas permukaan Limas ke-" + (i+1) + " :" + limas[i].hitungLuas());
            System.out.println("Volume Limas ke-" + (i+1) + " :" + limas[i].hitungVolume());
            System.out.println("==================================================================");
        }
    }
}