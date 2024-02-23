import java.util.Scanner;

public class Dragon {
    static int
        x = 5,
        y = 5,
        width = 10,
        height = 10;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println();
        System.out.println("       - - - - - Game Started - - - - - ");
        System.out.println();
        System.out.println("You are a nearly hatched egg dragon...");
        System.out.println("You already get your legs out but your head");
        System.out.println("still inside the egg.");
        System.out.println("Explore the cave!");
        System.out.println();

        while (true) {
            System.out.println("Where do you want to go? (Choose the number)");
            System.out.println("1. Move up");
            System.out.println("2. Move down");
            System.out.println("3. Move left");
            System.out.println("4. Move right");
            System.out.print("Your answer : ");
            int n = scan.nextInt();

            switch (n) {
                case 1:
                    moveUp();
                    break;
                case 2:
                    moveDown();
                    break;
                case 3:
                    moveLeft();
                    break;
                case 4:
                    moveRight();
                    break;
                default:
                    System.out.print("Please select the avaible number : ");
                    break;
            }
            detectCollison(x, y);
        }
    }

    static void moveUp() {
        y -= 1;
    }
    static void moveDown() {
        y += 1;
    }
    static void moveLeft() {
        x -= 1;
    }
    static void moveRight() {
        x += 1;
    }

    static void detectCollison(int x, int y){
        if (width < x || x < 0 || height < y || y < 0) {
            System.out.println("Game Over! You fall into the lava :') ");
            System.exit(0);
        } else {
            System.out.println("You are okay... Keep going !");
        }
    }
}
