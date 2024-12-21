package project;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Competition {
    private HashMap<String, AnhTai> allContestants; // Contestants stored in a HashMap
    private LinkedList<House> houses; // Houses stored in a LinkedList
    private int totalVoters = 350; // Number of voters (not fully used, but can be factored in)

    public Competition(LinkedList<House> houses, HashMap<String, AnhTai> allContestants) {
        this.houses = houses;
        this.allContestants = allContestants;
    }

    public void runCompetition() {
        // Start the competition with an announcement
        System.out.println("Welcome to the competition!");
        announceContestants();

        // Simulate each round (for simplicity, we'll just simulate 3 rounds here)
        for (int round = 1; round <= 3; round++) {
            Round currentRound = new Round(round, houses, allContestants);
            currentRound.conductRound();
        }

        // Final results
        System.out.println("\nCompetition Finished! Final Results:");
        displayFinalScores();
    }

    public void announceContestants() {
        System.out.println("Contestants: ");
        for (Map.Entry<String, AnhTai> entry : allContestants.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void displayFinalScores() {
        // Display the scores of each contestant
        for (House house : houses) {
            System.out.println(house.getName() + " has the following contestants:");
            for (AnhTai member : house.getMembers()) {
                System.out.println(member);
            }
        }
    }
}
