import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args){

        String [] snacks = {"Lays", "Red Doritos", "Blue Doritos", "Frito's", "Pretzels", "Popcorn", "Chocolate", "Reese's"};
        int [] price = {2, 2, 2, 2, 2, 3, 3, 3};

        System.out.println("Welcome!");
        for (int i = 0; i < snacks.length; i++) {
            System.out.println(snacks[i]);
        }
        Scanner snackScanner = new Scanner(System.in);
        System.out.println("Enter a snack:");
        String selectedSnack = snackScanner.nextLine();

        if (selectedSnack.equals("Lays")){
            System.out.println(price[0] + " dollars please.");
            int cost = price[0];
        }
        if (selectedSnack.equals("Red Doritos")){
            System.out.println(price[1] + " dollars please.");
            int cost = price[1];
        }
        if (selectedSnack.equals("Blue Doritos")){
            System.out.println(price[2] + " dollars please.");
            int cost = price[2];
        }
        if (selectedSnack.equals("Frito's")){
            System.out.println(price[3] + " dollars please.");
            int cost = price[3];
        }
        if (selectedSnack.equals("Pretzels")){
            System.out.println(price[4] + " dollars please.");
            int cost = price[4];
        }
        if (selectedSnack.equals("Popcorn")){
            System.out.println(price[5] + " dollars please.");
            int cost = price[5];
        }
        if (selectedSnack.equals("Chocalate")){
            System.out.println(price[6] + " dollars please.");
            int cost = price[6];
        }
        if (selectedSnack.equals("Reese's")){
            System.out.println(price[7] + " dollars please.");
            int cost = price[7];
        }
    }
}
