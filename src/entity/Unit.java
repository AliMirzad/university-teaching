package entity;

public class Unit {
    private String name;
    private int count;
    private int score;

    public Unit() {
    }

    public Unit(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public Unit(String name, int count, int score) {
        this.name = name;
        this.count = count;
        this.score = score;
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

    public void setUpdateInformation(String name, String count) {
        this.name = name;
        this.count = Integer.parseInt(count);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", score=" + score +
                '}';
    }
}
