enum Position {
    GK, DF, MF, FW;
}

public class Player {
    private String name;
    Position position;
    private int num;

    public Player(int num, String name, Position position) {
        this.num = num;
        this.name = name;
        this.position = position;

    }

    public Player() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String toString() {
        return "Player: " + getNum() + "\tFullname: " + getName() + "\tPosition: " + getPosition() + "\n";
    }
}
