package entity;

import java.util.ArrayList;

public class User extends Person /*is-a*/ {
    private String username;
    private String password;
    private Role role; /*has-a*/
    private ArrayList<Unit> units = new ArrayList<>();

    public User() {
    }

    public User(String firstname, String lastname, String nationalCode, String username, String password, Role role) {
        super(firstname, lastname, nationalCode);
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User(String firstname, String lastname, String nationalCode, String username, String password, Role role, ArrayList<Unit> units) {
        super(firstname, lastname, nationalCode);
        this.username = username;
        this.password = password;
        this.role = role;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<Unit> units) {
        this.units = units;
    }

    public void setUpdateInformation(String firstname, String lastname, String username, String password) {
        super.setFirstname(firstname);
        super.setLastname(lastname);
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", units=" + units +
                "} " + super.toString();
    }
}
