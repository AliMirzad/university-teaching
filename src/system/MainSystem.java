package system;

import person.User;
import person.UserType;

import java.util.Scanner;

public class MainSystem {
    private static final Scanner scanner = new Scanner(System.in);
    public static void mainSystem() {
        aa:
        while (true) {
            System.out.println("==========\n" +
                    "#1-login #2-register 3#-exit");
            String input = scanner.next();
            switch (input) {
                case "1" -> {
                    User user = UserSystem.login();
                    if (user != null && user.getType().equals(UserType.ADMIN)) {
                        AdminSystem.adminMenu();
                    } else if (user != null && user.getType().equals(UserType.STUDENT)) {
                        StudentSystem.studentMenu(user);
                    } else {
                        System.out.println("username or password is wrong");
                    }
                }
                case "2" -> {
                    UserSystem.register();
                }
                case "3" -> {
                    break aa;
                }
                default -> System.out.println("wrong input");
            }

        }
    }
}
