import java.util.Scanner;

public class praktikumFungsi {
    static Scanner scan = new Scanner(System.in);
    static int [][] royalGarden = {
        {10, 5, 15, 7}, //RoyalGarden1
        {6, 11, 9, 12}, //RoyalGarden2
        {2, 10, 10, 5}, //RoyalGarden3
        {5, 7, 12, 9}   //RoyalGarden4
    };
    static String pemisah = "===============================================================================================================";
    static int [][] dataBungaTerjual = {
        {0, 0, 0, 0}, //RoyalGarden1
        {0, 0, 0, 0}, //RoyalGarden2
        {0, 0, 0, 0}, //RoyalGarden3
        {0, 0, 0, 0}   //RoyalGarden4
    };
    static int [][] bungaMati = {
        {0, 0, 0, 0}, //RoyalGarden1
        {0, 0, 0, 0}, //RoyalGarden2
        {0, 0, 0, 0}, //RoyalGarden3
        {0, 0, 0, 0}   //RoyalGarden4
    };
    static long []  untung = {0, 0, 0, 0};

    public static void main(String[] args) {
        chooseMenu();
    }

    static void chooseMenu() {
        int choose;
        boolean condition = true;

        System.out.println(pemisah);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - W E L C O M E - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println(pemisah);
        System.out.println();

        System.out.println("How can i help you?");
        System.out.println("1. Check flower stock");
        System.out.println("2. Open Note");
        System.out.println("0. Exit");
        while (condition) {
            System.out.print("Select The Avaible Numbers : ");
            choose = scan.nextInt();
            
            switch (choose) {
                case 1:
                    tampilanStok();
                    chooseMenu();
                    break;
                case 2:
                    openNote();
                    break;
                case 3:
                    System.out.println("Are you sure? (y/n)");
                    System.out.print("Your answer : " );
                    String pilih = scan.nextLine();
    
                    if (pilih.equalsIgnoreCase("n")) {
                        chooseMenu();
                    } else {
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.print("Please ");
                    continue;
            }
        }
    }

    static void openNote () {
        boolean condition = true;

        System.out.println();
        System.out.println(pemisah);
        System.out.println();
        System.out.println("What Do You Want To Do?");
        System.out.println("1. Add Flower");
        System.out.println("2. Sell Flower");
        System.out.println("3. Note The Dead Flower");
        System.out.println("4. View Dead Flower Note");
        System.out.println("5. View Income");
        System.out.println("0. Back");
        System.out.print("Select The Avaible Number : ");
        while (condition) {
        int n = scan.nextInt();
        
            switch (n) {
                case 1:
                    System.out.println();
                    addFlower();
                    openNote();
                    break;
                case 2:
                    System.out.println();
                    sellFlower();
                    openNote();
                    break;
                case 3:
                    System.out.println();
                    addNoteDeadFlower();
                    openNote();
                    break;
                case 4:
                    System.out.println();
                    noteDeadFlower();
                    openNote();
                    break;
                case 5:
                    System.out.println();
                    viewIncome();
                    openNote();
                    break;
                case 0:
                    chooseMenu();
                    break;
            
                default:
                    System.out.print("Please Select The Avaible Number : ");
                    continue;
            }
        }
    }

    static void addFlower() {
        boolean 
            condition = true,
            condition2 = true;

        System.out.println(pemisah);
        System.out.println("Where do you want to add flower? ");
        System.out.println("1. Royal Garden I");
        System.out.println("2. Royal Garden II");
        System.out.println("3. Royal Garden III");
        System.out.println("4. Royal Garden IV");
        System.out.println("0. Back");
        System.out.print("Select The Avaible Number : ");
        while (condition) {
            int n = scan.nextInt();
            if (n < 0 || n > 4) {
                System.out.print("Please Select The Avaible Number : ");
            } else if (n == 0) {
                openNote();
            } else {
                System.out.println("What Flower Do You Want To Add?");
                System.out.println("1. Aglonema");
                System.out.println("2. Keladi");
                System.out.println("3. Alocasia");
                System.out.println("4. Mawar");
                System.out.println("0. Back");
                System.out.print("Select The Avaible Number : ");
                while (condition2) {
                    int p = scan.nextInt();
                    if (p < 0 || n > 4) {
                        System.out.println("Please Select The Avaible Number : ");
                    } else if (p == 0) {
                        break;
                    } else {
                        System.out.println("How Much You Want To Add? ");
                        System.out.print("Select Number : ");
                        while (condition2) {
                            int add = scan.nextInt();
                            if(add >= 0) {
                                royalGarden[n-1][p-1] += add;
                                openNote();
                            } else {
                                System.out.print("Select a positive number please : ");
                            }
                        }
                    }
                }
            }
        }
    }

    static void sellFlower(){
        boolean 
            condition = true,
            condition2 = true;

        System.out.println(pemisah);
        System.out.println("Where do you want to sell flower? ");
        System.out.println("1. Royal Garden I");
        System.out.println("2. Royal Garden II");
        System.out.println("3. Royal Garden III");
        System.out.println("4. Royal Garden IV");
        System.out.println("0. Back");
        System.out.print("Select The Avaible Number : ");
        while (condition) {
            int n = scan.nextInt();
            if (n < 0 || n > 4) {
                System.out.print("Please Select The Avaible Number : ");
            } else if (n == 0) {
                openNote();
            } else {
                System.out.println("What Flower Do You Want To Sell?");
                System.out.println("1. Aglonema");
                System.out.println("2. Keladi");
                System.out.println("3. Alocasia");
                System.out.println("4. Mawar");
                System.out.println("0. Back");
                System.out.print("Select The Avaible Number : ");
                while (condition2) {
                    int p = scan.nextInt();
                    if (p < 0 || n > 4) {
                        System.out.print("Please Select The Avaible Number : ");
                    } else if (p == 0) {
                        break;
                    } else {
                        long harga = harga(p);
                        System.out.println("How Much You Want To Add? ");
                        System.out.print("Select Number : ");
                        while (condition2) {
                            int sell = scan.nextInt();
                            if(sell >= 0) {
                                royalGarden[n-1][p-1] -= sell;
                                dataBungaTerjual[n-1][p-1] += sell;
                                untung [n-1] =+ harga*sell;
                                openNote();
                            } else {
                                System.out.print("Select a positive number please : ");
                            }
                        }
                    }
                }
            }
        }
    }

    static long harga(int index){
        switch (index) {
            case 1:
                return 75000;
            case 2:
                return 50000;
            case 3:
                return 60000;
            case 4:
                return 10000;
            default:
                return 0;
        }
    }

    static void addNoteDeadFlower(){
        boolean 
            condition = true,
            condition2 = true;

        System.out.println(pemisah);
        System.out.println("Where did flower die?");
        System.out.println("1. Royal Garden I");
        System.out.println("2. Royal Garden II");
        System.out.println("3. Royal Garden III");
        System.out.println("4. Royal Garden IV");
        System.out.println("0. Back");
        System.out.print("Select The Avaible Number : ");
        while (condition) {
            int n = scan.nextInt();
            if (n < 0 || n > 4) {
                System.out.print("Please Select The Avaible Number : ");
            } else if (n == 0) {
                openNote();
            } else {
                System.out.println("What Flower Died?");
                System.out.println("1. Aglonema");
                System.out.println("2. Keladi");
                System.out.println("3. Alocasia");
                System.out.println("4. Mawar");
                System.out.println("0. Back");
                System.out.print("Select The Avaible Number : ");
                while (condition2) {
                    int p = scan.nextInt();
                    if (p < 0 || n > 4) {
                        System.out.print("Please Select The Avaible Number : ");
                    } else if (p == 0) {
                        break;
                    } else {
                        System.out.println("How Manny Flower Died? ");
                        System.out.print("Select Number : ");
                        while (condition2) {
                            int deadFlower = scan.nextInt();
                            if(deadFlower >= 0) {
                                royalGarden[n-1][p-1] -= deadFlower;
                                bungaMati[n-1][p-1] += deadFlower;
                                openNote();
                            } else {
                                System.out.print("Select a positive number please : ");
                            }
                        }
                    }
                }
            }
        }
    }

    static void noteDeadFlower() {
        HorizontalGrid();
        System.out.println("| - - - - - - - - - - - - - - - - - - - - - - - D E A D  F L O W E R - - - - - - - - - - - - - - - - - - - - - |");
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", " ", "Aglonema", "Keladi", "Alocasia", "Mawar");
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", "Royal Garden I", bungaMati[0][0], bungaMati[0][1], bungaMati[0][2], bungaMati[0][3]);
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", "Royal Garden II", bungaMati[1][0], bungaMati[1][1], bungaMati[1][2], bungaMati[1][3]);
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", "Royal Garden III", bungaMati[2][0], bungaMati[2][1], bungaMati[2][2], bungaMati[2][3]);
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", "Royal Garden IV", bungaMati[3][0], bungaMati[3][1], bungaMati[3][2], bungaMati[3][3]);
        HorizontalGrid();
        openNote();
    }

    static void viewIncome() {
        HorizontalGrid();
        System.out.println("| - - - - - - - - - - - - - - - - - - - - - - - - I N C O M E - - - - - - - - - - - - - - - - - - - - - - - -|");
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", " ", "Aglonema", "Keladi", "Alocasia", "Mawar");
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", "Royal Garden I", dataBungaTerjual[0][0], dataBungaTerjual[0][1], dataBungaTerjual[0][2], dataBungaTerjual[0][3]);
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", "Royal Garden II", dataBungaTerjual[1][0], dataBungaTerjual[1][1], dataBungaTerjual[1][2], dataBungaTerjual[1][3]);
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", "Royal Garden III", dataBungaTerjual[2][0], dataBungaTerjual[2][1], dataBungaTerjual[2][2], dataBungaTerjual[2][3]);
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", "Royal Garden IV", dataBungaTerjual[3][0], dataBungaTerjual[3][1], dataBungaTerjual[3][2], dataBungaTerjual[3][3]);
        HorizontalGrid();
        System.out.println("Keuntungan Royal Garden I : " + untung[0]);
        System.out.println("Keuntungan Royal Garden II : " + untung[1]);
        System.out.println("Keuntungan Royal Garden III : " + untung[2]);
        System.out.println("Keuntungan Royal Garden IV : " + untung[3]);
        HorizontalGrid();
        openNote();
    }

    static void tampilanStok() {
        HorizontalGrid();
        System.out.println("| - - - - - - - - - - - - - - - - - - - - - F L O W E R  S T C O C K - - - - - - - - - - - - - - - - - - - - -|");
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", " ", "Aglonema", "Keladi", "Alocasia", "Mawar");
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", "Royal Garden I", royalGarden[0][0], royalGarden[0][1], royalGarden[0][2], royalGarden[0][3]);
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", "Royal Garden II", royalGarden[1][0], royalGarden[1][1], royalGarden[1][2], royalGarden[1][3]);
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", "Royal Garden III", royalGarden[2][0], royalGarden[2][1], royalGarden[2][2], royalGarden[2][3]);
        HorizontalGrid();
        System.out.printf("| %-20s| %-20s| %-20s| %-20s| %-20s|%n", "Royal Garden IV", royalGarden[3][0], royalGarden[3][1], royalGarden[3][2], royalGarden[3][3]);
        HorizontalGrid();
    }
    public static void HorizontalGrid () {
        System.out.printf("+%-20s+%-20s+%-20s+%-20s+%-20s+%n", "---------------------", "---------------------", "---------------------", "---------------------", "---------------------");
    }

}
