package animals;

public class Cat extends Animal implements Jumpable, Swimable{
    private int swimLimit;
    private float jumpLimit;

    public Cat(String name, int swimLimit){//дополнительный параметр для различия котов
        this.name = name;//поле из Суперкласса
        this.runLimit = 100;//поле из Суперкласса
        this.swimLimit = swimLimit;
        jumpLimit = 3.0f;
    }

//    @Override //здесь аннотация не нужна, т.к. идёт не переопределение, а реализация абстрактного метода из Суперкласса
    public String voice(){
        return "meow";
    }

    //проплыл ли?
    public boolean swim(int length){//здесь необходим идентификатор public (в интерфейсе он не указывается, но неявно является таковым)
        return swimLimit >= length;//true, если смог проплыть расстояние length
    }

    //перепрыгнул ли?
    public boolean jump(float height){
        return jumpLimit >= height; //true, если перепрыгнул препятствие высотой height
    }
}
