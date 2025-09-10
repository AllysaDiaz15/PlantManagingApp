import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> plants = new ArrayList<>();

        while (true) {

            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add plants");
            System.out.println("2. View Plants");
            System.out.println("3. Remove Plants");
            System.out.println("4. Exit");
            System.out.println("Enter the number of your choice: ");
            
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("enter plant names (type 'done' to finish): ");
                while(true) {
                    String PlantName = scanner.nextLine().toLowerCase();
                    if (PlantName.equals("done")) {
                        break;
                    }
                    plants.add(PlantName);
                }
            } else if (choice.equals("2")) {
                System.out.println("Your Plants");
                for(String plant : plants) {
                    System.out.println(" -" + plant);
                }
            } else if (choice.equals("3")) {
                System.out.println("coming out soon");
            } else if (choice.equals("4")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
                scanner.close();
        }
    }
}
