import java.util.Scanner;

public class pengulangan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long nim = 0;
        int n = 0;

        System.out.print("Masukkan NIM : ");
        nim = scan.nextLong();

        nim %= 100;
        n = (int) nim;

        System.out.println("============================");
        System.out.println("n: " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 == 1) {
                System.out.print("*");
            }

            if (i % 2 == 0)
            System.out.print(i);
        }
    }
}
