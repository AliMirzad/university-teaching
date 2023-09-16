package system;

import java.util.Scanner;

public class AdminSystem {
    private static final Scanner scanner = new Scanner(System.in);
    public static void adminPage() {
        aa:
        while (true) {
            System.out.println("admin page\n" +
                    "==========\n" +
                    "#1-user system #2-unit system #3-log out");
            String input = scanner.next();
            switch (input) {
                case "1" -> {
                    UserSystem.userSystem();
                }
                case "2" -> {
                    UnitSystem.adminUnitPage();
                }
                case "3" -> {
                    break aa;
                }
                default -> System.out.println("wrong input!");
            }
        }
    }
}
