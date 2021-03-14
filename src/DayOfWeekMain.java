public class DayOfWeekMain {

    private static final int WORK_HOURS_IN_DAY = 8;

    public static void main(String[] args) {
        getWorkingHours(DayOfWeek.WEDNESDAY);
    }

     public static void getWorkingHours(DayOfWeek day){
        int numberdayofweek = day.ordinal();
         if (numberdayofweek < 5)  System.out.println("Working hours to end of week: " + ((5 - numberdayofweek) * WORK_HOURS_IN_DAY));
            else System.out.println("Today is a day off !!!");
    }
}
