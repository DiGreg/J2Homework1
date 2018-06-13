import animals.*;
import obstacles.*;

/*
@author Grishin Dmitriy
@version dated 22.12.17
@link null
*/

public class MainClass {

    public static void main(String[] args) {
        Course course = new Course();//Создаю полосу препятствий
        Team dreamTeam = new Team("Мечта");//Создаю команду
        dreamTeam.info();//участники

        course.doItCourse(dreamTeam);//команда проходит полосу
        dreamTeam.showResults(course);//результаты - кто прошёл
    }
}