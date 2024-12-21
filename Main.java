package project;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create 33 contestants with unique names and jobs
        HashMap<String, AnhTai> allContestants = new HashMap<>();
        allContestants.put("Bằng Kiều", new AnhTai("Bằng Kiều", "Vocalist"));
        allContestants.put("Tự Long", new AnhTai("Tự Long", "Vocalist"));
        allContestants.put("Đinh Tiến Đạt", new AnhTai("Đinh Tiến Đạt", "Vocalist"));
        allContestants.put("Tiến Luật", new AnhTai("Tiến Luật", "Vocalist"));
        allContestants.put("Đỗ Hoàng Hiệp", new AnhTai("Đỗ Hoàng Hiệp", "Vocalist"));
        allContestants.put("Thanh Duy", new AnhTai("Thanh Duy", "Vocalist"));
        allContestants.put("Quốc Thiên", new AnhTai("Quốc Thiên", "Vocalist"));
        allContestants.put("Binz", new AnhTai("Binz", "Rapper"));
        allContestants.put("Cường Seven", new AnhTai("Cường Seven", "Rapper"));
        allContestants.put("Jun Phạm", new AnhTai("Jun Phạm", "Vocalist"));
        allContestants.put("BB Trần", new AnhTai("BB Trần", "Comedian"));
        allContestants.put("S.T Sơn Thạch", new AnhTai("S.T Sơn Thạch", "Vocalist"));
        allContestants.put("Rhymastic", new AnhTai("Rhymastic", "Rapper"));
        allContestants.put("Trọng Hiếu", new AnhTai("Trọng Hiếu", "Rapper"));
        allContestants.put("Soobin", new AnhTai("Soobin", "Vocalist"));
        allContestants.put("Kay Trần", new AnhTai("Kay Trần", "Rapper"));
        allContestants.put("Bùi Công Nam", new AnhTai("Bùi Công Nam", "Vocalist"));
        allContestants.put("Hà Lê", new AnhTai("Hà Lê", "Vocalist"));
        allContestants.put("Kiên Ứng", new AnhTai("Kiên Ứng", "Rapper"));
        allContestants.put("LUNAS", new AnhTai("LUNAS", "Vocalist"));
        allContestants.put("Noo Phước Thịnh", new AnhTai("Noo Phước Thịnh", "Vocalist"));
        allContestants.put("Mỹ Mỹ", new AnhTai("Mỹ Mỹ", "Vocalist"));
        allContestants.put("Ngọc Mai", new AnhTai("Ngọc Mai", "Dancer"));
        allContestants.put("Thanh Lam", new AnhTai("Thanh Lam", "Vocalist"));
        allContestants.put("Quang Dũng", new AnhTai("Quang Dũng", "Vocalist"));
        allContestants.put("Hương Tràm", new AnhTai("Hương Tràm", "Vocalist"));
        allContestants.put("Phan Mạnh Quỳnh", new AnhTai("Phan Mạnh Quỳnh", "Vocalist"));
        allContestants.put("Thảo Trang", new AnhTai("Thảo Trang", "Dancer"));
        allContestants.put("Mai Tiến Dũng", new AnhTai("Mai Tiến Dũng", "Vocalist"));
        allContestants.put("Hải Yến", new AnhTai("Hải Yến", "Vocalist"));
        allContestants.put("Văn Mai Hương", new AnhTai("Văn Mai Hương", "Vocalist"));

        // Create houses for top 17 and top 6
        LinkedList<House> houses = new LinkedList<>();
        House giaTocToanNang = new House("Gia Tộc Toàn Năng");
        House top23 = new House("Top 23");

        // Add members to houses
        for (int i = 0; i < 17; i++) {
            giaTocToanNang.addMember(allContestants.get(allContestants.keySet().toArray()[i]));
        }
        for (int i = 17; i < 23; i++) {
            top23.addMember(allContestants.get(allContestants.keySet().toArray()[i]));
        }

        houses.add(giaTocToanNang);
        houses.add(top23);

        // Run the competition
        Competition competition = new Competition(houses, allContestants);
        competition.runCompetition();
    }
}
