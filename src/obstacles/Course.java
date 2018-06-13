package obstacles;

import animals.Team;

public class Course {
    public Obstacle[] stage;
    public boolean[][] result;
    public Course(){
        stage = new Obstacle[]{new Track(80), new Wall(2.5f), new Water(90)};//Полоса препятствий
    }

    public void doItCourse(Team team){
        result = new boolean[team.crew.length][stage.length];//размер массива результатов зависит от числа участников и числа препятствий
        for (int i = 0; i < team.crew.length; i++) {//цикл для перебора участников
            for (int j = 0; j < stage.length; j++) {//цикл для перебора этапов полосы препятствий
                if (stage[j] instanceof Track) //имеет ли объект тип Track?
                    result[i][j] = ((Track)stage[j]).doIt(team.crew[i]);//Кастомизация (приведение типа Course в тип Track)
                else if (stage[j] instanceof Wall) //имеет ли объект тип Wall?
                    result[i][j] = ((Wall)stage[j]).doIt(team.crew[i]);//Кастомизация
                else
                    result[i][j] = ((Water)stage[j]).doIt(team.crew[i]);//Кастомизация
            }
        }
    }
}
