package com.github.epietras220.multiplication.table;

import java.util.Formatter;

public class MultiplicationTable {

    public void multiplicationTable10() { // zad. 1.1
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                count++;
                System.out.format("%4s|", result);
                if (count == 10) {
                    System.out.println("");
                    count = 0;
                }
            }
        }
    }

    public void multiplicationTable(int n) { // zad 1.2
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result = i * j;
                count++;
                System.out.format("%5s|", result);
                if (count == n) {
                    System.out.println("");
                    count = 0;
                }
            }
        }
    }

    public String[] multiplicationTableInTable(int n) { // zad 1.3 - NIE DZIAŁA
        Formatter formatter = new Formatter();

        String[] table = new String[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result = i * j;
                count++;
                formatter.format("%5s|", result);
                String formattedString = formatter.toString();
                table[i-1] = formattedString;
                if (count == n) {
                    System.out.println("");
                    count = 0;
                }
            }
        }
        return table;

    }
}
