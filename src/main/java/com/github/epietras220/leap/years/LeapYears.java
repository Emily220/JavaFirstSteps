package com.github.epietras220.leap.years;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LeapYears {


    public boolean leapYear(int a) {  // zad 3.1
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) {
            return true;
        }
        return false;
    }

    public long daysBetween(Calendar startDate, Calendar endDate) { // 3.2 and 3.3

        long diff = endDate.getTimeInMillis() - startDate.getTimeInMillis();
        //long diff = Math.abs(endDate.getTimeInMillis()) - Math.abs(startDate.getTimeInMillis()); // wartość bewzględna dla dat p.n.e.

        Calendar result = Calendar.getInstance();
        result.setTimeInMillis(diff);
        long liczbaMsWDobie = 1000 * 60 * 60 * 24;
        long liczbaDni = result.getTimeInMillis() / liczbaMsWDobie;

        return liczbaDni;
    }

    public static long roznica(Date data1, Date data2) {
        long roznica = Math.abs(data1.getTime() - data2.getTime());
        return roznica / ((long)(1000*60*60*24));


    }
}
