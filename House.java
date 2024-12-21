package project;

import java.util.LinkedList;

public class House {
    private String name;
    private LinkedList<AnhTai> members;

    public House(String name) {
        this.name = name;
        this.members = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<AnhTai> getMembers() {
        return members;
    }

    public void addMember(AnhTai member) {
        members.add(member);
    }

    public void eliminateMember(AnhTai member) {
        members.remove(member);
    }

    @Override
    public String toString() {
        return "House: " + name + " - Members: " + members.size();
    }
}
