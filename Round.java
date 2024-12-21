package project;

import java.util.List;

public class Round {
    private List<House> houses;
    private static final int TOTAL_VOTERS = 350;  // Total voters in the audience

    public Round(List<House> houses) {
        this.houses = houses;
    }

    // Each contestant receives votes from 350 voters
    public void startRound() {
        System.out.println("Starting the round...\n");

        // Simulate voting for each contestant in each house
        for (House house : houses) {
            System.out.println("Voting for contestants in House: " + house.getName());

            for (AnhTai contestant : house.getMembers()) {
                int votes = (int) (Math.random() * TOTAL_VOTERS); // Random votes between 0 and 350
                contestant.addFirepower(votes);
                System.out.println(contestant.getName() + " received " + votes + " votes, adding " + (votes * 10) + " firepower.");
            }
        }

        // Sort houses by total firepower (descending order)
        houses.sort((a, b) -> b.getTotalFirepower() - a.getTotalFirepower());
    }

    // Show the results of the round
    public void showResults() {
        System.out.println("\nRound Results:");

        for (House house : houses) {
            System.out.println("House: " + house.getName());
            for (AnhTai contestant : house.getMembers()) {
                System.out.println(contestant);
            }
        }
    }
}
