package obstacles;

import animals.*; //импортируем пакет animals, т.к. нужен класс Animal и интерфейс Swimable

public class Water extends Obstacle{
    private int length;

    public Water(int length){
        this.name = "Заплыв";
        this.length = length;
    }

    public boolean doIt(Animal animal){
        if(animal instanceof Swimable)
            return ((Swimable) animal).swim(length);
        else return false;
    }
}
