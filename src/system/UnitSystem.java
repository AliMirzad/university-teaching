package system;

import person.Unit;
import person.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UnitSystem {
    private static final Scanner scanner = new Scanner(System.in);
    public static final ArrayList<Unit> units = new ArrayList<>();

    public static void unitMenu(User user) {
        aa:
        while (true) {
            System.out.println("#1-show available units #2-show all my units #3-add new unit #4-remove unit #5-exit\n" +
                    "==========");
            String input = scanner.next();
            switch (input) {
                case "1" -> {
                    for (Unit unit : units) {
                        System.out.println(unit.toString());
                    }
                }
                case "2" -> {
                    if (user.getUnits() != null) {
                        for (Unit unit : user.getUnits()) {
                            System.out.println(unit.toString());
                        }
                    } else {
                        System.out.println("no unit added");
                    }
                }
                case "3" -> {
                    addUnit(user);
                }
                case "4" -> {
                    removeUnit(user);
                }
                case "5" -> {
                    break aa;
                }
                default -> System.out.println("wrong input");
            }
        }
    }

    private static void removeUnit(User user) {
        while (true) {
            System.out.println("your units\n" +
                    "==========");
            for (Unit unit : units) {
                System.out.println(unit.toString());
            }
            System.out.println("type exit for quit this page");
            System.out.println("enter unit name:");
            String input = scanner.next();
            if (input.equals("exit")) {
                break;
            }
            for (Unit unit : units) {
                if (unit.getName().equals(input)) {
                    user.getUnits().remove(unit);
                }
            }
        }
    }

    private static void addUnit(User user) {
        while (true) {
            System.out.println("available units\n" +
                    "==========");
            for (Unit unit : units) {
                System.out.println(unit.toString());
            }
            System.out.println("type exit for quit this page");
            System.out.println("enter unit name:");
            String input = scanner.next();
            if (input.equals("exit")) {
                break;
            }
            int unitCount = 0;
            for (Unit unit : user.getUnits()) {
                unitCount += unit.getCount();
            }
            for (Unit unit : units) {
                if (unit.getName().equals(input)) {
                    if (unitCount + unit.getCount() > 20)
                    System.out.println("unit can't added to your unit list");
                    else user.getUnits().add(unit);
                }
            }
        }
    }
}
