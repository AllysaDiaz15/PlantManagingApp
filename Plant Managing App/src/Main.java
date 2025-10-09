import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        List<Plant> plants = new ArrayList<>();
        Gson gson = new Gson();

        JsonReader reader = new JsonReader(new FileReader("save.json"));
        Plant[] plantsFromFile = gson.fromJson(reader, Plant[].class);

        plants = Arrays.stream(plantsFromFile).collect(Collectors.toList());

        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add plants");
            System.out.println("2. View Plants");
            System.out.println("3. save");

            System.out.print("Enter the number of your choice: ");
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
                            lastWatered,
                            fertilizingSchedule,
                            lastFertilized,
                            repotted);

                    plants.add(newPlant);

                } else if (confirmation.equals("no")) {
                    continue;
                }
            } else if (choice.equals("2")) {
                System.out.println("Your Plants");
                for (Plant plant : plants) {
                    System.out.println(plant.plantName);
                }

                    System.out.println("Would you do some changes on your plants? (type return if none)");
                    System.out.println("1. Edit Plants");
                    System.out.println("2. Remove Plants");
                    System.out.println("3. exit");
                    System.out.print("Enter the number of your choice: ");
                    String changes = scanner.nextLine().toLowerCase();

                   if (changes.equals("1")) {
                        System.out.print("Which plant would you want to edit?");
                        System.out.println("Current Plants");
                        for (Plant plantInList : plants) {
                            System.out.println(plantInList.plantName);
                        }
                        System.out.print("Enter the name of the Plant to edit (type return if none): ");
                        String plantName = scanner.nextLine().toLowerCase();
                        if (plantName.equals("return")) {
                           continue;
                         }
                        boolean isReal = false;
                        for (Plant plantInList : plants) {
                            if (plantInList.plantName.equals(plantName)) {
                                plantInList.displayPlantDetails();
                                isReal = true;
                                System.out.println("Enter the letter of the property you would like to change (type return if none):");
                                String properties = scanner.nextLine().toLowerCase().toLowerCase();
                                if (properties.equals("a")) {
                                    System.out.println("New Name: ");
                                    plantInList.plantName = scanner.nextLine().toLowerCase();
                                }if (properties.equals("b")){
                                    System.out.println("Edit Description: ");
                                    plantInList.description = scanner.nextLine().toLowerCase();
                                }if (properties.equals("c")) {
                                    System.out.println("Add notes: ");
                                    plantInList.careNotes = scanner.nextLine().toLowerCase();
                                }if (properties.equals("d")) {
                                    System.out.println("Change prefferedWater: ");
                                    plantInList.preferredWater = scanner.nextLine().toLowerCase();
                                }if (properties.equals("e")) {
                                    System.out.println("Change watering schedule: ");
                                    plantInList.wateringSchedule = scanner.nextLine().toLowerCase();
                                }if (properties.equals("f")) {
                                    System.out.println("Last watered: ");
                                    plantInList.lastWatered = scanner.nextLine().toLowerCase();
                                }if (properties.equals("g")) {
                                    System.out.println("Change fertilizing schedule: ");
                                    plantInList.fertilizingSchedule = scanner.nextLine().toLowerCase();
                                }if (properties.equals("h")) {
                                    System.out.println("Last fertilized: ");
                                    plantInList.lastFertilized = scanner.nextLine().toLowerCase();
                                }if (properties.equals("i")) {
                                    System.out.println("Last repotted");
                                    plantInList.repotted = scanner.nextLine().toLowerCase();
                                }if (properties.equals("return")){
                                    break;
                                }
                            }
                        }
                        if(!isReal) {
                            System.out.println("Plant doesnt exist!!!");
                        }
                    }if (changes.equals("2")) {
                       if (plants.isEmpty()) {
                           System.out.println("There are no plants on the List");
                       } else {
                           System.out.println("Your current plants");
                           for (Plant plant : plants)
                               System.out.println(plant.plantName);
                           System.out.println("Enter the name of the plant you want to remove: ");
                           String plantToRemove = scanner.nextLine().toLowerCase();

                           /*
                           We can't directly remove an object from the list of plants while looping through the list, that's why we need to
                           remove it AFTER THE LOOP using the correct index (the position in a list) of the plant that the user wants to remove.
                           We:
                           1. find the plant in the list "plants" using the plant name the user entered
                           2. If found we save the index (position) it was found at
                           3. After ending the loop (break), we remove the item in the list at the index we saved (which is the plant we want to remove)
                            */

                           int plantToRemoveFoundAt = -1; // Setting this to -1 as initial value, if the plant to remove gets found we set it to the index it was found at
                           int index = 0; // For keeping track of where we are while looping through the list plants
                           for (Plant plantInList : plants) {
                               if (plantInList.plantName.equals(plantToRemove)) { // If the name of the current plant matches the name of the plant that the user wants to remove, we found the correct plant in the list.
                                   plantToRemoveFoundAt = index; // Set this to the current index because we just found the plant that the user wants to remove.
                                   break; // If we already found the plant that the user wants to remove we can stop looping through the list of plants and continue after the loop.
                               }
                               index++; // Adds 1 to the index each time one loop finished
                           }
                           // AFTER THE LOOP
                           if (plantToRemoveFoundAt == -1) { // If this is still -1 it means that the plant that the user wants to remove is not in the list of plants
                               System.out.println("Plant " + plantToRemove + " not found.");
                           } else { // If it's something other than -1 it means that the plant to remove was found
                               plants.remove(plantToRemoveFoundAt); // Now we can remove the correct plant from the list using the index we found it at.
                           }
                       }
                }
             } else if (choice.equals("4")) {

                String plantlist = gson.toJson(plants);
                System.out.println("Plant list" + plantlist);
                try (FileWriter writer = new FileWriter("save.json")){
                    writer.write(plantlist);
                    System.out.println("File has been written");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("goodbye");
                return;
            }
        }
    }
}