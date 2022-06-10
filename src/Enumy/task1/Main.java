package Enumy.task1;

public class Main {

    public static void main(String[] args) {

        Weekday monday = Weekday.MONDAY;
        Weekday saturday = Weekday.SATURDAY;

       Weekday.MONDAY.whichIsGreater(Weekday.TUESDAY);

        System.out.println("Saturday is holiday: " + Weekday.SATURDAY.isHoliday());
        System.out.println("Friday is holiday: " + Weekday.FRIDAY.isWeekDay());

        int ordinal = Weekday.TUESDAY.ordinal();
        System.out.println("Ordinal: " + ordinal);
    }
}
