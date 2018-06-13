package animals;

//Курица не умеет плавать
public class Hen extends Animal implements Jumpable{
    private float jumpLimit;

    public Hen(String name){
        this.name = name;
        this.runLimit = 100;
        jumpLimit = 10f;
    }

    public String voice(){
        return "ko-ko-ko";
    }

    public boolean jump(float heigth){
        return jumpLimit >= heigth;
    }
}
