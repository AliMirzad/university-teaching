package system;

import entity.Person;
import entity.Role;
import entity.User;

import java.util.Scanner;

public class MainSystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void mainPage() {
        aa:
        while (true) {
            System.out.println("welcome\n" +
                    "==========\n" +
                    "#1-login #2-register #3-change password #4-exit");
            String input = scanner.next();
            switch (input) {
                case "1" -> {
                    User user = UserSystem.login();
                    if (user != null) {
                        if (user.getRole().equals(Role.ADMIN)) {
                            System.out.println("login successful");
                            AdminSystem.adminPage();
                        } else {
                            System.out.println("login successful");
                            StudentSystem.studentPage(user);
                        }
                    }
                }
                case "2" -> {
                    UserSystem.register();
                }
                case "3" -> {
                    UserSystem.changePassword();
                }
                case "4" -> {
                    break aa;
                }
                default -> System.out.println("wrong input!");
            }
        }
    }
}
