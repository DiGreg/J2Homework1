package obstacles;

import animals.*; //импортируем пакет animals, т.к. нужен класс Animal и интерфейс Jumpable

public class Wall extends Obstacle{
   private float height;

   public Wall(float height){
       this.name = "Прыжок";
       this.height = height;
   }

    public boolean doIt(Animal animal){
       if(animal instanceof Jumpable)
           return ((Jumpable) animal).jump(height);
       else return false;
   }
}
