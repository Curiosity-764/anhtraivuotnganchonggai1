package project;

import java.util.List;

public class Competition {
    private List<House> houses;
    private int roundCount;

    public Competition(List<House> houses) {
        this.houses = houses;
        this.roundCount = 1;
    }

    // Run the competition
    public void runCompetition() {
        while (houses.size() > 1) {
            System.out.println("\nRound " + roundCount);
            Round round = new Round(houses);
            round.startRound();
            round.showResults();
            roundCount++;
            eliminate();
        }
        System.out.println("\nCompetition has ended!");
    }

    // Eliminate the lowest-performing contestant from each house (based on firepower)
    private void eliminate() {
        for (House house : houses) {
            AnhTai lowestPerforming = null;
            for (AnhTai contestant : house.getMembers()) {
                if (lowestPerforming == null || contestant.getFirepower() < lowestPerforming.getFirepower()) {
                    lowestPerforming = contestant;
                }
            }

            // Remove the lowest-performing contestant
            house.getMembers().remove(lowestPerforming);
            System.out.println("Eliminated: " + lowestPerforming.getName() + " from House " + house.getName());
        }

        // Remove houses that no longer have contestants
        houses.removeIf(house -> house.getMembers().isEmpty());
    }
}
