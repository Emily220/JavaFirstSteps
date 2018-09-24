package com.github.epietras220.leap.years;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LeapYears {


    public boolean leapYear(int a) {  // zad 3.1
        return (a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0);
    }

    public long daysBetween(Calendar startDate, Calendar endDate) { // 3.2 and 3.3

        long diff = endDate.getTimeInMillis() - startDate.getTimeInMillis();

        long liczbaMsWDobie = 1000 * 60 * 60 * 24;

        return diff / liczbaMsWDobie;
    }
}
