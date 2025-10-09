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
        System.out.println("a.Name: " + this.plantName);
        System.out.println("b.Description: " + this.description);
        System.out.println("c.Notes: " + this.careNotes);
        System.out.println("d.Preferred water: " + this.preferredWater);
        System.out.println("e.Watering schedule: " + this.wateringSchedule);
        System.out.println("f.Last watered: " + this.lastWatered);
        System.out.println("g.Fertilizing schedule: " + this.fertilizingSchedule);
        System.out.println("h.Last fertilized: " + this.lastFertilized);
        System.out.println("i.Repotted on: " + this.repotted);

    }
}
