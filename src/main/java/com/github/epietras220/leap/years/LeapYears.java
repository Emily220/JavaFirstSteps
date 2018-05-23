package com.github.epietras220.leap.years;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapYears {
    public boolean leapYear(int a) {  // zad 3.1
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
            return true;
        }
        return false;
    }

    public long daysBetween(Calendar startDate, Calendar endDate) {

        long diff = Math.abs(endDate.getTimeInMillis()) - Math.abs(startDate.getTimeInMillis()); // wartość bewzględna dla dat p.n.e.

        Calendar result = Calendar.getInstance();
        result.setTimeInMillis(diff);
        long liczbaMsWDobie = 1000 * 60 * 60 * 24;
        long liczbaDni = result.getTimeInMillis() / liczbaMsWDobie;

        return liczbaDni;
    }


}
