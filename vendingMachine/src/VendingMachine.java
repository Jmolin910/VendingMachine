import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args){

        String [] snacks = {"Lays", "Red Doritos", "Blue Doritos", "Frito's", "Pretzels", "Popcorn", "Chocolate", "Reese's"};
        int [] price = {2, 2, 2, 2, 2, 3, 3, 3};

        Scanner snackScanner = new Scanner(System.in);

        String selectedSnack = "";
        String outputMessage = "";

        int cost;
        int amountEntered = -1;

        System.out.println("Welcome!");
        for (int i = 0; i < snacks.length; i++) {
            System.out.println(snacks[i]);
        }
        System.out.println("Enter a snack:");
        selectedSnack = snackScanner.nextLine();

        if (selectedSnack.equals("Lays")){
            System.out.println(price[0] + " dollars please.");
            cost = price[0];
            outputMessage += "Here are your Lays. Enjoy your boring snack.";
        }
        if (selectedSnack.equals("Red Doritos")){
            System.out.println(price[1] + " dollars please.");
            cost = price[1];
            outputMessage += "Here are your Red Doritos. The classic triangular snack.";
        }
        if (selectedSnack.equals("Blue Doritos")){
            System.out.println(price[2] + " dollars please.");
            cost = price[2];
            outputMessage += "Here are your Blue Doritos. The classic triangular snack but blue.";
        }
        if (selectedSnack.equals("Frito's")){
            System.out.println(price[3] + " dollars please.");
            cost = price[3];
            outputMessage += "Here are your Frito's. They might be stale because no one gets these.";
        }
        if (selectedSnack.equals("Pretzels")){
            System.out.println(price[4] + " dollars please.");
            cost = price[4];
            outputMessage += "Here are your Pretzels. Too bad they aren't chocolate covered.";
        }
        if (selectedSnack.equals("Popcorn")){
            System.out.println(price[5] + " dollars please.");
            cost = price[5];
            outputMessage += "Here is your Popcorn. Enjoy your movie.";
        }
        if (selectedSnack.equals("Chocolate")){
            System.out.println(price[6] + " dollars please.");
            cost = price[6];
            outputMessage += "Here is your Chocolate. Too bad it's not covering pretzels.";
        }
        if (selectedSnack.equals("Reese's")){
            System.out.println(price[7] + " dollars please.");
            cost = price[7];
            outputMessage += "Here are your Reese's. Reesepectful choice.";
        }

        while(amountEntered <= 1){
            try{
                amountEntered = snackScanner.nextInt();
                if(amountEntered < 0){ System.out.println("What do you think that means I'd pay you? Try again.");}
                else if(amountEntered == 0){System.out.println("This a vending machine which means I need money. Try again.");}
            }
            catch(Exception e){
                System.out.println("I'm allergic to money that isn't in 1 dollar increments. Try again.");
                snackScanner.next();
            }
        }

        System.out.println(outputMessage);
    }
}
