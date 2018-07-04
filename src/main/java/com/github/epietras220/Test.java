package com.github.epietras220;

import com.github.epietras220.arithmetic.Arithmetic;
import com.github.epietras220.arithmetic.RomanNumerals;
import com.github.epietras220.change.Change;
import com.github.epietras220.leap.years.LeapYears;
import com.github.epietras220.multiplication.table.MultiplicationTable;
import com.github.epietras220.prime.number.Prime;
import com.github.epietras220.prime.number.SieveOfEratosthenes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Test {

    public static int rozmiarListy(ArrayList<? super Integer> lista){
        Object x = lista.get(0);
        return lista.size();
    }
    public static void main(String[] args) throws IOException {
       // Arithmetic arithmetic = new Arithmetic();
        //System.out.println(arithmetic.square());

        //Prime prime = new Prime(0);
        //SieveOfEratosthenes sieve = new SieveOfEratosthenes(100);
        //sieve.sieve();

        List kolekcjaNiegeneryczna = new ArrayList();
        kolekcjaNiegeneryczna.add(5);
        kolekcjaNiegeneryczna.add("kuba");
        kolekcjaNiegeneryczna.add("ewa");


//        for (Object x : kolekcjaNiegeneryczna){
//            System.out.println(x);
//        }

        ArrayList<Float> lista = new ArrayList<>();
        lista.add(5f);
        lista.add(1f);





       // System.out.println(Math.pow(2,4.0/3.0));

       // arithmetic.romToArab("MCLIV");
//
//        MultiplicationTable multiplicationTable = new MultiplicationTable();
//        multiplicationTable.multiplicationTableInTable(5);
//        multiplicationTable.printTable(multiplicationTable.returnTab());

//        Change change = new Change();
//        change.change(90);
//
//        Calendar c1 = Calendar.getInstance();
//        Calendar c2 = Calendar.getInstance();
//        System.out.println(c1==c2);
//
//       c1.set(-200, 5, 1);
//        c2.set(2018, 1, 22);
////
//      LeapYears leapYears = new LeapYears();
//       System.out.println(leapYears.daysBetween(c1, c2)+" days");
    }
}



