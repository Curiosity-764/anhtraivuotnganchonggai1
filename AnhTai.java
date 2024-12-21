package project;

public class AnhTai {
    private String name;
    private String job;
    private int firepower;
    private int votingScore;

    public AnhTai(String name, String job) {
        this.name = name;
        this.job = job;
        this.firepower = 0; // Initial firepower
        this.votingScore = 0; // Initial voting score
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getFirepower() {
        return firepower;
    }

    public void addFirepower(int amount) {
        this.firepower += amount;
    }

    public int getVotingScore() {
        return votingScore;
    }

    public void addVotingScore(int amount) {
        this.votingScore += amount;
    }

    @Override
    public String toString() {
        return name + " (" + job + ") - Firepower: " + firepower + " | Voting Score: " + votingScore;
    }
}
