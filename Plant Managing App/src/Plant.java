import java.time.LocalDate;
import java.util.Scanner;

public class Plant {
    Scanner scanner = new Scanner(System.in);

    String plantName;
    String description;
    String careNotes;
    String prefferedWater;
    String wateringSchedule;
    LocalDate lastWatered;
    String fertilizingSchedule;
    LocalDate lastFertilized;
    LocalDate repotted;

    Plant  (String pPlantName ,String pDescription, String pCareNotes, String pPrefferedWater, String pWateringSchedule,
            LocalDate pLastWatered, String pFertilizingSchedule, LocalDate pLastFertilized,
            LocalDate pRepotted) {

        this.plantName = pPlantName;
        this.description = pDescription;
        this.careNotes = pCareNotes;
        this.prefferedWater = pPrefferedWater;
        this.wateringSchedule = pWateringSchedule;
        this.lastWatered = pLastWatered;
        this.fertilizingSchedule = pFertilizingSchedule;
        this.lastFertilized = pLastFertilized;
        this.repotted = pRepotted;


    }
}
