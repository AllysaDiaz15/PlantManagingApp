public class Plant {
    public String plantName;
    public String description;
    public String careNotes;
    public String preferredWater;
    public String wateringSchedule;
    public String lastWatered;
    public String fertilizingSchedule;
    public String lastFertilized;
    public String repotted;

    Plant  (String pPlantName, String pDescription, String pCareNotes, String pPreferredWater, String pWateringSchedule,
            String pLastWatered, String pFertilizingSchedule, String pLastFertilized,
            String pRepotted) {

        this.plantName = pPlantName;
        this.description = pDescription;
        this.careNotes = pCareNotes;
        this.preferredWater = pPreferredWater;
        this.wateringSchedule = pWateringSchedule;
        this.lastWatered = pLastWatered;
        this.fertilizingSchedule = pFertilizingSchedule;
        this.lastFertilized = pLastFertilized;
        this.repotted = pRepotted;
    }

    public void displayPlantDetails() {
        System.out.println("Name: " + this.plantName);
        System.out.println("Description: " + this.description);
        System.out.println("Notes: " + this.careNotes);
        System.out.println("Preferred water: " + this.preferredWater);
        System.out.println("Watering schedule: " + this.wateringSchedule);
        System.out.println("Last watered: " + this.lastWatered);
        System.out.println("Fertilizing schedule: " + this.fertilizingSchedule);
        System.out.println("Last fertilized: " + this.lastFertilized);
        System.out.println("Repotted on: " + this.repotted);

    }
}
