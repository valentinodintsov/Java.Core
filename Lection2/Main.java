public class Main {

    public static void main(final String[] args) {
//        System.out.println(getWorkingHours(DayOfWeek.FRIDAY));

        int num = getWorkingHours(DayOfWeek.MONDAY);

        switch (num){
            case 0: System.out.println("Рабочая неделя еще не началась.");break;
            default: System.out.println(String.format("До конца рабочей недели осталось отработать %d часов.", num)); break;
        }
    }

    public static int getWorkingHours(DayOfWeek dayOfWeek) {
        int sum = 0;
        for(int i = dayOfWeek.ordinal(); i < dayOfWeek.values().length; ++i )
            sum += dayOfWeek.values()[i].getHours();
        return sum;
    }
}
