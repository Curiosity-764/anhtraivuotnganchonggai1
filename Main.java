package project;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create 33 contestants with unique names and jobs
        List<AnhTai> contestants = new ArrayList<>();
        contestants.add(new AnhTai("Bằng Kiều", "Vocalist"));
        contestants.add(new AnhTai("Tự Long", "Vocalist"));
        contestants.add(new AnhTai("Đinh Tiến Đạt", "Vocalist"));
        contestants.add(new AnhTai("Tiến Luật", "Vocalist"));
        contestants.add(new AnhTai("Đỗ Hoàng Hiệp", "Vocalist"));
        contestants.add(new AnhTai("Thanh Duy", "Vocalist"));
        contestants.add(new AnhTai("Quốc Thiên", "Vocalist"));
        contestants.add(new AnhTai("Binz", "Rapper"));
        contestants.add(new AnhTai("Cường Seven", "Rapper"));
        contestants.add(new AnhTai("Jun Phạm", "Vocalist"));
        contestants.add(new AnhTai("BB Trần", "Comedian"));
        contestants.add(new AnhTai("S.T Sơn Thạch", "Vocalist"));
        contestants.add(new AnhTai("Rhymastic", "Rapper"));
        contestants.add(new AnhTai("Trọng Hiếu", "Rapper"));
        contestants.add(new AnhTai("Soobin", "Vocalist"));
        contestants.add(new AnhTai("Kay Trần", "Rapper"));
        contestants.add(new AnhTai("Bùi Công Nam", "Vocalist"));
        contestants.add(new AnhTai("Hà Lê", "Vocalist"));
        contestants.add(new AnhTai("Kiên Ứng", "Rapper"));
        contestants.add(new AnhTai("LUNAS", "Vocalist"));
        contestants.add(new AnhTai("Noo Phước Thịnh", "Vocalist"));
        contestants.add(new AnhTai("Mỹ Mỹ", "Vocalist"));
        contestants.add(new AnhTai("Ngọc Mai", "Dancer"));
        contestants.add(new AnhTai("Thanh Lam", "Vocalist"));
        contestants.add(new AnhTai("Quang Dũng", "Vocalist"));
        contestants.add(new AnhTai("Hương Tràm", "Vocalist"));
        contestants.add(new AnhTai("Phan Mạnh Quỳnh", "Vocalist"));
        contestants.add(new AnhTai("Thảo Trang", "Dancer"));
        contestants.add(new AnhTai("Mai Tiến Dũng", "Vocalist"));
        contestants.add(new AnhTai("Hải Yến", "Vocalist"));
        contestants.add(new AnhTai("Văn Mai Hương", "Vocalist"));

        // Create houses for top 17 and top 6
        House giaTocToanNang = new House("Gia Tộc Toàn Năng");
        House top23 = new House("Top 23");

        // Add members to houses
        for (int i = 0; i < 17; i++) {
            giaTocToanNang.addMember(contestants.get(i));
        }
        for (int i = 17; i < 23; i++) {
            top23.addMember(contestants.get(i));
        }

        // List of houses
        List<House> houses = new ArrayList<>();
        houses.add(giaTocToanNang);
        houses.add(top23);

        // Print all contestants
        System.out.println("All Contestants:");
        for (AnhTai contestant : contestants) {
            System.out.println(contestant);
        }

        // Start the competition
        Competition competition = new Competition(houses);
        competition.runCompetition();
    }
}
