package system;

import entity.User;

import java.util.Scanner;

public class StudentSystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void studentPage(User user) {
        aa:
        while (true) {
            System.out.println("admin page\n" +
                    "==========\n" +
                    "#1-show my info #2-unit system #3-log out");
            String input = scanner.next();
            switch (input) {
                case "1" -> {
                    System.out.println(user.toString());
                }
                case "2" -> {
                    UnitSystem.studentUnitPage(user);
                }
                case "3" -> {
                    break aa;
                }
                default -> System.out.println("wrong input!");
            }
        }
    }
}
