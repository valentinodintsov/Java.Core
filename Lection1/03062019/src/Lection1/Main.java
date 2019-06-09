package Lection1;

public class Main {
    public static void main(String[] args) {

        Team team = new Team("", new String[]{});
        Course c = new Course(new String[]{});
        c.doIt(team);
        team.showResult();
    }
}
