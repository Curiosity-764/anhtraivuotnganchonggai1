package project;

public class AnhTai {
    private String name;
    private String job; // e.g., Vocalist, Dancer, Rapper, etc.
    private int firepower;  // Track firepower gained from votes
    private int votingScore; // Track voting score (accumulated from each round)

    public AnhTai(String name, String job) {
        this.name = name;
        this.job = job;
        this.firepower = 0;
        this.votingScore = 0;
    }

    // Add firepower based on votes
    public void addFirepower(int votes) {
        this.firepower += votes * 10;  // Each vote is worth 10 firepower points
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getFirepower() {
        return firepower;
    }

    public int getVotingScore() {
        return votingScore;
    }

    public void addVotingScore(int score) {
        this.votingScore += score;
    }

    @Override
    public String toString() {
        return name + " (" + job + ") - Firepower: " + firepower + " | Voting Score: " + votingScore;
    }
}
