package person;

import java.util.ArrayList;

public class User extends Person {
    private String username;
    private String password;

    private String Code;

    private UserType type;

    private ArrayList<Unit> units = new ArrayList<>();

    public User() {
    }

    public User(String firstname, String lastname, String nationalCode, String username, String password, String code, UserType type) {
        super(firstname, lastname, nationalCode);
        this.username = username;
        this.password = password;
        Code = code;
        this.type = type;
    }

    public User(String firstname, String lastname, String nationalCode, String username, String password, String code, UserType type, ArrayList<Unit> units) {
        super(firstname, lastname, nationalCode);
        this.username = username;
        this.password = password;
        Code = code;
        this.type = type;
        this.units = units;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<Unit> units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Code='" + Code + '\'' +
                ", type=" + type +
                ", units=" + units +
                "} " + super.toString();
    }
}
