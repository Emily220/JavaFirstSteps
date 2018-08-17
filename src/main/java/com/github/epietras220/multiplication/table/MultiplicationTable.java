package com.github.epietras220.multiplication.table;

public class MultiplicationTable {

    private int[][] table;

    public void multiplicationTable10() { // zad. 1.1
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                count++;
                System.out.format("%4s|", result);
                if (count == 10) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }

    public static void multiplicationTable(int n) { // zad 1.2
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int result = i * j;
                count++;
                System.out.format("%" + (int) (Math.log10(n * n) + 1) + "s|", result);
                if (count == n) {
                    System.out.println("");
                    count = 0;
                }
            }
        }
    }

    public int[][] multiplicationTableInTable(int n) { //zad 1.3

         table = new int[n][n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }
        return table;
    }
    public void printTable(int [][] table){
        this.table = table;

        for (int i =0; i<table.length; i++){
            for(int j =0; j<table.length; j++){
                System.out.format("%" + (int) (Math.log10(table.length * table.length) + 1) + "s|", table[i][j]);
            }
            System.out.println();
        }
    }
    public int [][] returnTab(){
        return table;
    }
}
