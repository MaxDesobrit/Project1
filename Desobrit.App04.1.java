gfdturdrty
import java.util.Scanner;

public class Breakfast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Would you like breakfast? (yes/no): ");
        String breakfastChoice = scanner.nextLine().toLowerCase();

        if (breakfastChoice.equals("yes")) {
            System.out.println("Great! Here are your drink options:");
            System.out.println("1. Mosquito Milk");
            System.out.println("2. Nectar of Sand");
            System.out.println("3. No Drink");

            System.out.print("Please choose a drink (1/2/3): ");
            int drinkChoice = scanner.nextInt();

            switch (drinkChoice) {
                case 1: System.out.println("You chose Mosquito Milk. Thank You and Enjoy!"); break;
                case 2: System.out.println("You chose Nectar of Sand. Thank you and Enjoy!"); break;
                case 3: System.out.println("No drink selected. Thank you andEnjoy your meal!"); break;
                default: System.out.println("Invalid choice. No drink selected.");
            }
        } else {
            System.out.println("Okay, no breakfast today. Have a great day!");
        }

        scanner.close();
    }
}
