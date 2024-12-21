package project;

import java.util.List;
import java.util.ArrayList;

public class House {
    private String name;
    private List<AnhTai> members; // List to store members of the house
    private int totalFirepower; // Total firepower of the house

    public House(String name) {
        this.name = name;
        this.members = new ArrayList<>();
        this.totalFirepower = 0;
    }

    // Add a contestant to the house
    public void addMember(AnhTai contestant) {
        members.add(contestant);
    }

    // Add firepower to the house (total firepower from all members)
    public void addFirepower(int firepower) {
        this.totalFirepower += firepower;
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<AnhTai> getMembers() {
        return members;
    }

    public int getTotalFirepower() {
        return totalFirepower;
    }

    public void resetFirepower() {
        this.totalFirepower = 0; // Reset for next round
    }

    @Override
    public String toString() {
        return name + " (Members: " + members.size() + ")";
    }
}
