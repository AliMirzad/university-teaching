package system;

import person.User;
import person.UserType;

import java.util.ArrayList;
import java.util.Scanner;

public class UserSystem {
    private static final Scanner scanner = new Scanner(System.in);
    public static final ArrayList<User> users = new ArrayList<>();

    public static void register() {
        System.out.println("register page\n" +
                "==========\n" +
                "firstname/lastname/nationalCode/username/password/code/type");
        String information = scanner.next();
        String[] informationSplit = information.split("/");
        User user = new User(informationSplit[0], informationSplit[1],
                informationSplit[2], informationSplit[3],
                informationSplit[4], informationSplit[5], UserType.valueOf(informationSplit[6].toUpperCase()));
        users.add(user);
        System.out.println("register successful");
    }

    public static User login() {
        System.out.println("login page\n" +
                "==========\n" +
                "username/password");
        String information = scanner.next();
        String[] informationSplit = information.split("/");
        for (User user : users) {
            if (user.getUsername().equals(informationSplit[0])
            || user.getPassword().equals(informationSplit[1])) {
                System.out.println("login successful");
                return user;
            }
        }
        return null;
    }

    public static User showUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public static User changePassword(String username, String password,String newPassword) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                user.setPassword(newPassword);
            }
        }
        return null;
    }
}
