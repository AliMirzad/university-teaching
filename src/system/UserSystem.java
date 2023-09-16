package system;

import entity.Role;
import entity.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserSystem {
    private static final Scanner scanner = new Scanner(System.in);
    public static final ArrayList<User> users = new ArrayList<>();

    public static void userSystem() {
        aa:
        while (true) {
            System.out.println("user management page\n" +
                    "==========\n" +
                    "#1-show users #2-delete user #3-update user #4-back");
            String input = scanner.next();
            switch (input) {
                case "1" -> {
                    showUsers();
                }
                case "2" -> {
                    deleteUser();
                }
                case "3" -> {
                    updateUser();
                }
                case "4" -> {
                    break aa;
                }
                default -> System.out.println("wrong input!");
            }
        }
    }

    public static void register() {
        System.out.println("register page\n" +
                "==========\n" +
                "input data like example\n" +
                "firstname,lastname,nationalCode,username,password,role");
        String input = scanner.next();
        String[] information = input.split(",");
        User user = new User(information[0], information[1],
                information[2], information[3],
                information[4], Role.valueOf(information[5].toUpperCase()));
        users.add(user);
    }

    public static User login() {
        System.out.println("login page\n" +
                "==========\n" +
                "input data like example\n" +
                "username,password");
        String input = scanner.next();
        String[] information = input.split(",");
        for (User user : users) {
            if (user.getUsername().equals(information[0]) && user.getPassword().equals(information[1])) {
                return user;
            }
        }
        System.out.println("no user found!");
        return null;
    }

    public static void changePassword() {
        System.out.println("login page\n" +
                "==========\n" +
                "input data like example\n" +
                "nationalCode,new password");
        String input = scanner.next();
        String[] information = input.split(",");
        for (User user : users) {
            if (user.getNationalCode().equals(information[0])) {
                user.setPassword(information[1]);
                System.out.println("password changed!");
                return;
            }
        }
        System.out.println("user not-found!");
    }

    private static void showUsers() {
        System.out.println("system users\n" +
                "==========");
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    private static void deleteUser() {
        System.out.println("delete user page\n" +
                "==========\n" +
                "enter nationalCode");
        String input = scanner.next();
        for (User user : users) {
            if (user.getNationalCode().equals(input)) {
                if (!user.getRole().equals(Role.ADMIN)) {
                    users.remove(user);
                    System.out.println("user removed!");
                    return;
                }
            }
        }
        System.out.println("user not-found!");
    }

    private static void updateUser() {
        System.out.println("register page\n" +
                "==========\n" +
                "input data like example\n" +
                "nationalCode,new-firstname,new-lastname,new-username,new-password");
        String input = scanner.next();
        String[] information = input.split(",");
        for (User user : users) {
            if (user.getNationalCode().equals(information[0])) {
                if (!user.getRole().equals(Role.ADMIN)) {
                    user.setUpdateInformation(information[1], information[2], information[3], information[4]);
                    System.out.println("update successful");
                    return;
                }
            }
        }
        System.out.println("user not-found!");
    }
}
