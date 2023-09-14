package system;

import person.User;

import java.util.Scanner;

public class StudentSystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void studentMenu(User user) {
        aa:
        while (true) {
            System.out.println("#1-showMyInfo 2#-change password #3-unit system #4-exit\n" +
                    "==========");
            String input = scanner.next();
            switch (input) {
                case "1" -> {
                    System.out.println(user.toString());
                }
                case "2" -> {
                    System.out.println("enter new password:");
                    String newPassword = scanner.next();
                    UserSystem.changePassword(user.getUsername(), user.getPassword(), newPassword);
                }
                case "3" -> {
                    UnitSystem.unitMenu(user);
                }
                case "4" -> {
                    System.out.println("student menu closed");
                    break aa;
                }
                default -> System.out.println("wrong input");
            }
        }
    }
}
