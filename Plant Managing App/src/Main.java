import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Plant> plants = new ArrayList<>();

        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add plants");
            System.out.println("2. View Plants");
            System.out.println("3. Remove Plants");
            System.out.println("4. Exit");
            System.out.println("Enter the number of your choice: ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Plant name: ");
                String pPlantName = scanner.nextLine();

                System.out.println("Proceed (YES or NO): ");
                String confirmation = scanner.nextLine().toLowerCase();

                if (confirmation.equals("yes")) {
                    System.out.println("Plant Description: ");
                    String description = scanner.nextLine();

                    System.out.println("Preferred Water: ");
                    String prefferedWater = scanner.nextLine();

                    System.out.println("Watering Schedule: ");
                    String wateringSchedule = scanner.nextLine();

                    System.out.println("Last Watered: ");
                    String lastWatered = scanner.nextLine();

                    System.out.println("Fertilizing Schedule: ");
                    String fertilizingSchedule = scanner.nextLine();

                    System.out.println("Last fertilized: ");
                    String lastFertilized = scanner.nextLine();

                    System.out.println("Last repotted: ");
                    String repotted = scanner.nextLine();

                    System.out.println("Notes: ");
                    String carenotes = scanner.nextLine();

                    Plant newPlant = new Plant(pPlantName,
                            description,
                            carenotes,
                            prefferedWater,
                            wateringSchedule,
                            LocalDate.parse(lastWatered),
                            fertilizingSchedule,
                            LocalDate.parse(lastFertilized),
                            LocalDate.parse(repotted));

                    plants.add(newPlant);

                } else if (confirmation.equals("no")) {
                    continue;
                }
            } else if (choice.equals("2")) {
                System.out.println("Your Plants");
                for (Plant plant : plants) {
                    System.out.println(plant.plantName);
                }
            } else if (choice.equals("3")) {
                if (plants.isEmpty()) {
                    System.out.println("There are no plants on the list");
                }else {
                    System.out.println("Your Current Plants");
                    for (Plant plant : plants)
                        System.out.println(plant.plantName);
                }
            }

            System.out.println("Enter the name of the plant you want to remove: ");
            String plantToRemove = scanner.nextLine(). toLowerCase();

            if (plants.remove(plantToRemove)) {
                    System.out.println("removed: " + plantToRemove);
                } else {
                    System.out.println("Plant '" + plantToRemove + "' not found!");
                }

        }
    }
}








//        try (Scanner filescanner = new Scanner(new File("save.json"))) {
//            while (filescanner.hasNextLine()) {
//                String plant = filescanner.nextLine();
//                plants.add(plant);
//            }
//            System.out.println("Plants loaded from file!");
//        } catch (FileNotFoundException e) {
//            System.out.println("No saved plants found!");
//        }
//
//        while (true) {
//
//            System.out.println("\nWhat would you like to do?");
//            System.out.println("1. Add plants");
//            System.out.println("2. View Plants");
//            System.out.println("3. Remove Plants");
//            System.out.println("4. Exit");
//            System.out.println("Enter the number of your choice: ");
//
//            String choice = scanner.nextLine();
//
//            if (choice.equals("1")) {
//                System.out.println("enter plant names (type 'done' to finish): ");
//                while(true) {
//                    String PlantName = scanner.nextLine().toLowerCase();
//                    if (PlantName.equals("done")) {
//                        break;
//                    }
//                    plants.add(PlantName);
//                }
//            } else if (choice.equals("2")) {
//                System.out.println("Your Plants");
//                for(String plant : plants) {
//                    System.out.println(" -" + plant);
//                }
//            } else if (choice.equals("3")) {
//                if (plants.isEmpty()) {
//                    System.out.println("There are no plants on the list!");
//                }else {
//                    System.out.println("Your current Plants:");
//                    for (String plant : plants) {
//                        System.out.println("- " + plant);
//                    }
//                }
//
//                System.out.println("Enter the name of the Plant you want to remove:");
//                String plantToRemove = scanner.nextLine().toLowerCase();
//
//                if (plants.remove(plantToRemove)) {
//                    System.out.println("removed: " + plantToRemove);
//                } else {
//                    System.out.println("Plant '" + plantToRemove + "' not found!");
//                }
//            } else if (choice.equals("4")) {
//                try (FileWriter writer = new FileWriter("save.json")){
//                    for (String plant : plants) {
//                        writer.write(plant + "\n");
//                    }
//                    System.out.println("File has been written");
//                }
//                catch(IOException e){
//                    System.out.println("Could not write file");
//                }
//                System.out.println("Goodbye!");
//                break;
//            } else {
//                System.out.println("Invalid choice! Please try again.");
//            }
//        }
//    }
//}
