package animals;

public abstract class Animal {
    protected String name;
    protected int runLimit;//предельная дальность, которую животное способно пробежать

    public abstract String voice();

    //метод проверки пробежал(а) ли?
    public boolean run(int length) {
        return runLimit >= length;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + name;
    }
}
