package com.github.epietras220;

import com.github.epietras220.arithmetic.Arithmetic;
import com.github.epietras220.change.Change;
import com.github.epietras220.leap.years.LeapYears;
import com.github.epietras220.multiplication.table.MultiplicationTable;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumMap;

public class Test {

    public static void main(String[] args) {

//        MultiplicationTable multiplicationTable = new MultiplicationTable();
//        multiplicationTable.multiplicationTableInTable(5);

//         Change change = new Change();
//         change.change(12547);
//
//        Calendar c1 = Calendar.getInstance();
//        Calendar c2 = Calendar.getInstance();
//        c1.set(1,1,1);
//        c2.set(2018,5,22);
//        LeapYears leapYears = new LeapYears();
//        System.out.println(leapYears.daysBetween(c1, c2));

        Arithmetic arithmetic = new Arithmetic();
        arithmetic.arabToRom(2945);


        // int suma = 0;

//        String liczbaRzymska = "MCCIX";
//        char[] lista = liczbaRzymska.toCharArray();
//
//        while (liczbaRzymska.length() > 0) {
//
//        }


//        for (int i = 0; i < lista.length; i++) {
//            while (lista[i] == 'M') {
//                suma = suma + 1000;
//            }
//            while (lista[i] == 'D') {
//                suma = suma + 500;
//            }
//            while (lista[i] == 'C') {
//                if (lista[i + 1] == 'D') {
//                    suma = suma + 400;
//                }
//                suma = suma + 100;
//            }
//            while (lista[i] == 'L') {
//                suma = suma + 50;
//            }
//            while (lista[i] == 'X') {
//                if (lista[i + 1] == 'C') {
//                    suma = suma + 90;
//                } else if (lista[i + 1] == 'L') {
//                    suma = suma + 40;
//                }
//                suma = suma + 10;
//            }
//            while (lista[i] == 'V') {
//                suma = suma + 5;
//            }
//            while (lista[i] == 'I') {
//                if (lista[i + 1] == 'V') {
//                    suma = suma + 4;
//                } else if (lista[i + 1] == 'X') {
//                    suma = suma + 9;
//                }
//                suma = suma + 1;
//            }

    }
}




