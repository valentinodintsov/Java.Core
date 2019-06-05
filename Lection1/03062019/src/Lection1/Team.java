package Lection1;

public class Team implements Competitor{
    String name;
    String[] users;
    int maxCross = 1000; // Максимальная длина забега
    int maxShwim = 200; // Максимальная длина заплыва
    int maxRebus = 10; // Максимальное число ребусов
    int maxRest = 20; // Максимальное время отдыха :)
    boolean active;


    public Team(String name, String[] users){
        // Проверка наименования комманды
        if(!name.isEmpty()){
            this.name = name;
        }
        else{
            this.name = "\'Молодость\'";
        }

        // Проверка наличия участников комманды
        if (users.length != 0){
            this.users = users;
        }
        else{
            this.users = new String[] {"Иванов И.И.","Петров П.П.","Сидоров С.С.","Хряков Х.Х."};
        }


    }

    @Override
    public void teamInfo(){
        System.out.println("Участники комманды " + this.name + ":\n");

        for(int i=0; i < this.users.length; ++i){
            System.out.println(i+1 + ". " + this.users[i]);
        }
        System.out.println("\n");
    }

    @Override
    public void cross(int dist, String user){
        if(dist <= maxCross){
            System.out.println("Первая дистанция пройдена! " + user + " теперь может называться Кроссмэном!");
        }
        else {
            System.out.println("Кто бы мог ожидать, что " +  user + " не сможет преодолеть дистанцию в " + dist + " метов! Для него спортивный марафон закончен.");
            active = false;
        }
    }

    @Override
    public void shwim(int dist, String user){
        if(dist <= maxShwim){
            System.out.println(user + " прекрасно справился с плаванием и переходит к следующему этапу - ребусы!");
        }
        else {
            System.out.println("Жаль, но " +  user + " так и не смог преодолеть полосу препятсвий - плавание. Пришлось вызывать спасателей. Участник дисквалифицирован.");
            active = false;
        }
    }

    @Override
    public void rebus(int count, String user){
        if(count <= maxRebus){
            System.out.println("Все ребусы разгаданы! Не только сила, но и ум со смекалкой на высоте! Ave, " + user + "!");
        }
        else {
            System.out.println(user + " понимает буквально выражение \'Поработай головой\'. Печально, но с дистанции придется сойти.");
            active = false;
        }
    }

    @Override
    public void rest(int time, String user){
        if(time <= maxRest){
            System.out.println("Лежание на диване - это самое желанное испытание. " + user + " с блеском преодолел его!");
        }
        else {
            System.out.println("Это полный провал!");
            active = false;
        }
    }

    @Override
    public boolean isOnActive(){
        return active;
    }

    @Override
    public void showResult() {

        System.out.println("На старт! Внимание! Фарш!\n");

        for (int i = 0; i < this.users.length; ++i){
            cross(700, this.users[i]);
            shwim(150, this.users[i]);
            rebus(5, this.users[i]);
            rest(15, this.users[i]);
            System.out.println("\n");
        }
    }
}
