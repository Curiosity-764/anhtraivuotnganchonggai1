package project;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Round {
    private int roundNumber;
    private List<House> houses;
    private Map<String, AnhTai> allContestants;

    public Round(int roundNumber, List<House> houses, Map<String, AnhTai> allContestants) {
        this.roundNumber = roundNumber;
        this.houses = houses;
        this.allContestants = allContestants;
    }

    // Simulate the voting and scoring in a round
    public void conductRound() {
        System.out.println("\n-- Round " + roundNumber + " begins --");

        // Voting and scoring for each house
        for (House house : houses) {
            System.out.println("\nHouse " + house.getName() + " is voting...");

            for (AnhTai contestant : house.getMembers()) {
                int voteScore = generateVoteScore();
                contestant.addVotingScore(voteScore);
                contestant.addFirepower(voteScore * 10); // 10 firepower per vote score
                System.out.println(contestant.getName() + " gets " + voteScore + " votes and " + (voteScore * 10) + " firepower.");
            }

            // Eliminate the lowest scorer from the house
            AnhTai eliminated = eliminateLowScorer(house);
            if (eliminated != null) {
                System.out.println(eliminated.getName() + " has been eliminated from " + house.getName());
            }
        }
    }

    // Generate a random vote score (for simplicity)
    private int generateVoteScore() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Generates a vote score between 1 and 100
    }

    // Eliminate the lowest scorer in the house
    private AnhTai eliminateLowScorer(House house) {
        AnhTai lowestScorer = null;
        for (AnhTai contestant : house.getMembers()) {
            if (lowestScorer == null || contestant.getVotingScore() < lowestScorer.getVotingScore()) {
                lowestScorer = contestant;
            }
        }
        house.eliminateMember(lowestScorer);  // Eliminate this contestant
        return lowestScorer;
    }
}
