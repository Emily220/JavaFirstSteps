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
        // System.out.println(data.isLeapYear(1500)); - ZWRACA TRUE - DLACZEGO?, JAK SPRAWDZIĆ JAK TA METODA WYGLĄDA
    }
    public long daysBetween(Calendar startDate, Calendar endDate){
        long diff = endDate.getTimeInMillis() - startDate.getTimeInMillis();

        return (diff/(1000*60*60*24));
    }

    GregorianCalendar data = new GregorianCalendar();
    LocalDate data2 = LocalDate.of(1,1,1);
    LocalDate dataNow = LocalDate.now();

}
