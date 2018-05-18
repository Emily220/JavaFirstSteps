package com.github.epietras220.multiplication.table;

public class MultiplicationTable {

    public void multiplicationTable10(){ // zad. 1.1
        int count =0;
        for (int i = 1; i<=10;i++){
            for (int j=1; j<=10;j++){
                int result = i*j;
                count++;
                System.out.print(result + " ");
                if(count ==10){
                    System.out.println("");
                    count =0;
                }
            }
        }
    }

    public void multiplicationTable(int n){ // zad 1.2
        int count =0;
        for (int i = 1; i<=n;i++){
            for (int j=1; j<=n;j++){
                int result = i*j;
                count++;
                System.out.print(result + " ");
                if(count ==n){
                    System.out.println("");
                    count =0;
                }
            }
        }
    }
}
