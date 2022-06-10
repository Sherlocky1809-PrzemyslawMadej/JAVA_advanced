package Enumy.task1;

import java.util.Collections;

public enum Weekday {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

    public void whichIsGreater (Weekday weekday) {
        if (this.ordinal() < weekday.ordinal()) {
            System.out.println("Before: " + weekday);
        } else if (this.ordinal() > weekday.ordinal()) {
            System.out.println("After: " + weekday);
        } else {
            System.out.println("Equal: " + weekday);
        }
    }

}
