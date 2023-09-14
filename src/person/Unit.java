package person;

public class Unit {
    private String name;
    private int count;
    private int score;

    public Unit() {
    }

    public Unit(String name, int count, int score) {
        this.name = name;
        this.count = count;
        this.score = score;
    }

    public Unit(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", count='" + count + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
