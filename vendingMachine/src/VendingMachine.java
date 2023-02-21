import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args){

        // instance variables
        String [] snacks = {"Lays", "Red Doritos", "Blue Doritos", "Frito's", "Pretzels", "Popcorn", "Chocolate", "Reese's"};
        int [] price = {2, 2, 2, 2, 2, 3, 3, 3};

        Scanner snackScanner = new Scanner(System.in);

        String selectedSnack = "";
        String outputMessage = "";
        String proceed = "";

        int cost = 0;
        int amountEntered = 0;
        int totalEntered = 0;
        int isAvailable = 0;

        // intro
        System.out.println("Welcome! I have these snacks:");
        for (int i = 0; i < snacks.length; i++) {
            System.out.println(snacks[i]);
        }
        System.out.println("Enter desired snack:");
        selectedSnack = snackScanner.nextLine();

        for (int snack = 0; snack < snacks.length; snack++) {
            if (snacks[snack].equals(selectedSnack)) {
                isAvailable++;
                break;
            }
        }
        
        // checks if snack entered is in list
        if (isAvailable == 0){
            System.out.println("Please enter something I offered.");
            return;
        }

        // cases for each snack -- sets the cost and output message to associated snack
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

        System.out.println("Enter money:");

        // loop for money insertion
        while(totalEntered < cost){
            try{
                amountEntered = snackScanner.nextInt();
                if(amountEntered < 0){ System.out.println("What do you think that means I'd pay you? Try again.");} // if negative entered
                else if(amountEntered == 0){System.out.println("This a vending machine which means I need money. Try again.");} // if zero entered
                else if(amountEntered + totalEntered < cost){  // if not enough entered
                    System.out.println("Please enter enough money if you want " + selectedSnack + ".");
                    totalEntered += amountEntered;
                }
                else if(amountEntered + totalEntered >= cost){totalEntered += amountEntered;} // if at least enough entered
            }
            catch(Exception e){ // if anything else besides a positive integer is entered
                System.out.println("I'm allergic to anything that isn't money in 1 dollar increments. Try again.");
                snackScanner.next();
            }
        }

        // confirms purchase
        System.out.println("Continue purchase?");
        while(!proceed.equalsIgnoreCase("Yes") && !proceed.equalsIgnoreCase("No")){
            proceed = snackScanner.nextLine();
            if(proceed.equalsIgnoreCase("No")){System.out.println("Here are your " + totalEntered + " dollars back.");} // if want to cancel
            else if(proceed.equalsIgnoreCase("Yes")){ // if want to proceed
                if(totalEntered > cost){ // if change needed
                    if(totalEntered - cost == 1){System.out.println("Here's your dollar of change.");}
                    else{System.out.println("Here's your " + (totalEntered - cost) + " dollars of change.");}
                }
                System.out.println(outputMessage); // dispenses snack

            } 
            else{System.out.println("Enter yes or no:");} // if insufficient answer
        }
    }
}
