import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        List<String> plants = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String PlantName;

        System.out.println("enter plant names (type 'done' to finish): ");
        while(true) {
            PlantName = scanner.nextLine().toLowerCase();
            if (PlantName.equals("done")) {
                break;
            }
            plants.add(PlantName);

        }

        System.out.println("Your Plants");
        for (String plant: plants)
            System.out.println(" -" + plant);


        scanner.close();

    }
}