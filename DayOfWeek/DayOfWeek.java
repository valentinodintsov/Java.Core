public enum DayOfWeek {
    MONDAY("Monday", "Понедельник", 1, 8),
    TUESDAY("Tuesday", "Вторник", 2, 8),
    WEDNESDAY("Wednesday", "Среда", 3, 8),
    THURSDAY("Thursday", "Четверг", 4, 8),
    FRIDAY("Friday", "Пятница", 5, 8),
    SATURDAY("Saturday", "Суббота", 6, 0),
    SUNDAY("Sunday", "Воскресенье", 7, 0);

    private String eng;
    private String rus;
    private int numWeek;
    private int hours;

    DayOfWeek(String eng, String rus, int numWeek, int hours) {
        this.eng = eng;
        this.rus = rus;
        this.numWeek = numWeek;
        this.hours = hours;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getRus() {
        return rus;
    }

    public void setRus(String rus) {
        this.rus = rus;
    }

    public int getNumWeek() {
        return numWeek;
    }

    public void setNumWeek(int numWeek) {
        this.numWeek = numWeek;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
