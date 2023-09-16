package system;

import entity.Unit;
import entity.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UnitSystem {
    private static final Scanner scanner = new Scanner(System.in);
    public static final ArrayList<Unit> units = new ArrayList<>();

    public static void adminUnitPage() {
        aa:
        while (true) {
            System.out.println("welcome\n" +
                    "==========\n" +
                    "#1-show available units #2-save unit #3-delete unit #4-update unit #5-back");
            String input = scanner.next();
            switch (input) {
                case "1" -> {
                    showAvailableUnits();
                }
                case "2" -> {
                    saveUnit();
                }
                case "3" -> {
                    deleteUnit();
                }
                case "4" -> {
                    updateUnit();
                }
                case "5" -> {
                    break aa;
                }
                default -> System.out.println("wrong input!");
            }
        }
    }


    public static void studentUnitPage(User user) {
        aa:
        while (true) {
            System.out.println("welcome\n" +
                    "==========\n" +
                    "#1-show available units #2-save unit #3-delete unit #4-update unit #5-back");
            String input = scanner.next();
            switch (input) {
                case "1" -> {
                    showAvailableUnits();
                }
                case "2" -> {
                    saveUnitToStudent(user);
                }
                case "3" -> {
                    deleteUnitStudent(user);
                }
                case "4" -> {
                    updateUnitStudent(user);
                }
                case "5" -> {
                    break aa;
                }
                default -> System.out.println("wrong input!");
            }
        }
    }

    private static void updateUnitStudent(User user) {
        while (true) {
            System.out.println("change unit\n" +
                    "==========\n" +
                    "old-unit-name,new-name-name");
            String input = scanner.next();
            String[] information = input.split(",");
            for (Unit unit : units) {
                if (unit.getName().equals(information[1])) {
                    for (Unit userUnit : user.getUnits()) {
                        if (unit.getName().equals(information[0])) {
                            user.getUnits().remove(userUnit);
                            user.getUnits().add(unit);
                            System.out.println("unit updated successful");
                        }
                    }
                    return;
                }
            }
            System.out.println("unit not-found!");
        }
    }

    private static void deleteUnitStudent(User user) {
        System.out.println("remove unit\n" +
                "==========\n" +
                "unit name");
        String input = scanner.next();
        for (Unit unit : user.getUnits()) {
            if (unit.getName().equals(input)) {
                user.getUnits().remove(unit);
                System.out.println("unit remove successful");
                return;
            }
        }
        System.out.println("unit not-found!");
    }

    private static void saveUnitToStudent(User user) {
        while (true) {
            for (Unit unit : units) {
                System.out.println(unit.toString());
            }
            System.out.println("==========");
            System.out.println("add new unit\n" +
                    "==========\n" +
                    "input data like example\n" +
                    "name");
            String input = scanner.next();
            for (Unit unit : units) {
                if (unit.getName().equals(input)) {
                    user.getUnits().add(unit);
                }
            }
            System.out.println("unit added successful");
        }
    }

    private static void saveUnit() {
        System.out.println("save new unit\n" +
                "==========\n" +
                "input data like example\n" +
                "name,count");
        String input = scanner.next();
        String[] information = input.split(",");
        Unit unit = new Unit(information[0], Integer.parseInt(information[1]));
        units.add(unit);
        System.out.println("unit saved successful");
    }

    private static void deleteUnit() {
        System.out.println("delete unit\n" +
                "==========\n" +
                "name");
        String input = scanner.next();
        for (Unit unit : units) {
            if (unit.getName().equals(input)) {
                units.remove(unit);
                System.out.println("unit deleted successful");
                return;
            }
        }
        System.out.println("unit not-found!");
    }

    private static void updateUnit() {
        System.out.println("update unit\n" +
                "==========\n" +
                "old-name,new-name,new-count");
        String input = scanner.next();
        String[] information = input.split(",");
        for (Unit unit : units) {
            if (unit.getName().equals(information[0])) {
                unit.setUpdateInformation(information[1], information[2]);
                System.out.println("unit updated successful");
                return;
            }
        }
        System.out.println("unit not-found!");
    }

    private static void showAvailableUnits() {
        System.out.println("system units\n" +
                "==========");
        for (Unit unit : units) {
            System.out.println(unit.toString());
        }
    }
}
