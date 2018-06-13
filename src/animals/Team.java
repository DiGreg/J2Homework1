package animals;

import obstacles.*;

public class Team {
    private String teamName;
    public Animal[] crew;//команда - массив животных

    public Team(String teamName){
        this.teamName = teamName;
        crew = new Animal[]{new Cat("Мурзик", 100), new Cat("Барсик", 80), new Hen("Лоретта"), new Hippo("Лимбо")};
    }

    //Информация об участниках
    public void info(){
        System.out.println("Команда: " + teamName + ". Участники:");
        for (Animal member: crew){
            System.out.println(member + " say " + member.voice());
        }
    }

    //метод информации о прошедших дистанцию
    public void showResults(Course course){
        System.out.println("\nПрошли дистанцию: ");
        for (int i = 0; i < crew.length; i++) {
            System.out.print(crew[i] + ": ");
            for (int j = 0; j < course.stage.length; j++) {
                if (course.result[i][j]){
                    System.out.print(course.stage[j].getName() + " ");
                }
            }
            System.out.println();
        }

    }
}
