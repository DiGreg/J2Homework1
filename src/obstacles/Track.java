package obstacles;

import animals.Animal;//импортируем нужный класс Animal из пакета animals.
//import animals.*; //импортируем пакет animals, т.к. нужен класс Animal. Здесь импортируется всё, что есть в классе

public class Track extends Obstacle{
    private int length;

    public Track(int length){//конструктор устанавливает длину беговой дорожки (трека)
        this.name = "Забег";
        this.length = length;
    }

    //метод проверки, пробежит ли животное трек длиной length
    public boolean doIt(Animal animal){
        return animal.run(length);//применяем метод run из Суперкласса
    }
}
