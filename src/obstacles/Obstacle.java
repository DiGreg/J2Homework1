package obstacles;

public class Obstacle {
    String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + name;
    }
}
