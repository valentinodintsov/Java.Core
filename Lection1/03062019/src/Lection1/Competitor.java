package Lection1;

public interface Competitor {
    void teamInfo();
    void cross(int dist, String user);
    void shwim(int dist, String user);
    void rebus(int count, String user);
    void rest(int time, String user);
    boolean isOnActive();
    void showResult();
}
