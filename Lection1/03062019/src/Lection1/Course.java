package Lection1;

public class Course implements Barrier{
    String[] barriers;

    public Course(String[] barriers) {
        if(barriers.length !=0){
            this.barriers = barriers;
        }
        else{
            this.barriers = new String[]{"Кросс по пересеченной местности", "Плавание в открытом водоеме",
                    "Отгадывание ребусов", "Лежание на диване"};
        }

    }

    @Override
    public void courseInfo(){
        System.out.println("Полоса препятсвий на сегодня:\n");

        for (int i = 0; i < this.barriers.length; ++i){
            System.out.println(this.barriers[i]);
        }

        System.out.println("\n");
    }

    @Override
    public void doIt(Team team){
        team.teamInfo();
    }

}
