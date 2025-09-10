import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> plants = new ArrayList<>();

        try (Scanner filescanner = new Scanner(new File("test.txt"))) {
            while (filescanner.hasNextLine()) {
                String plant = filescanner.nextLine();
                plants.add(plant);
            }
            System.out.println("Plants loaded from file!");
        } catch (FileNotFoundException e) {
            System.out.println("No saved plants found!");
        }

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
                if (plants.isEmpty()) {
                    System.out.println("There are no plants on the list!");
                }else {
                    System.out.println("Your current Plants:");
                    for (String plant : plants) {
                        System.out.println("- " + plant);
                    }
                }

                System.out.println("Enter the name of the Plant you want to remove:");
                String plantToRemove = scanner.nextLine().toLowerCase();

                if (plants.remove(plantToRemove)) {
                    System.out.println("removed: " + plantToRemove);
                } else {
                    System.out.println("Plant '" + plantToRemove + "' not found!");
                }
            } else if (choice.equals("4")) {
                try (FileWriter writer = new FileWriter("test.txt")){
                    for (String plant : plants) {
                        writer.write(plant + "\n");
                    }
                    System.out.println("File has been written");
                }
                catch(IOException e){
                    System.out.println("Could not write file");
                }
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
