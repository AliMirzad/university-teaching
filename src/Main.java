import person.Unit;
import person.User;
import person.UserType;
import system.MainSystem;
import system.UnitSystem;
import system.UserSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User("aaa", "aaa", "123", "aaa", "aaa", "3a2", UserType.STUDENT);
        UserSystem.users.add(user);
        Unit unit1 = new Unit("a", 15);
        Unit unit2 = new Unit("b", 5);
        Unit unit3 = new Unit("c", 3);
        UnitSystem.units.add(unit1);
        UnitSystem.units.add(unit2);
        UnitSystem.units.add(unit3);
        MainSystem.mainSystem();
    }
}
