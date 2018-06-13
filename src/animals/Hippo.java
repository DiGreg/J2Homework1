package animals;

//Гиппопотам не может прыгать
public class Hippo extends Animal implements Swimable{
    private int swimLimit;

    public Hippo(String name){
        this.name = name;
        this.runLimit = 50;
        swimLimit = 200;
    }

    public String voice(){
        return "uf-uf-uf";
    }

    public boolean swim(int length){
        return swimLimit >= length;
    }
}
