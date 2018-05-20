package com.github.epietras220.change;

public class Change {
    public void change(int n) { // zad. 2.1
        Denomination[] d = Denomination.values();
        int[] denomination = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = d.length-1;
        while (n > 0) {

            if (d[i].getValue() <= n) {
                System.out.println(d[i]);
                n = n - d[i].getValue();
            } else{
                i--;
            }
        }
    }


    public enum Denomination { //zad 2.2 - NIEDOKOŃCZONE
        ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50),
        HUNDRED(100), TWO_HUNDRED(200), FIVE_HUNDRED(500);

        private int value;

        private Denomination(int v) { // konstruktor
            this.value = v;
        }

        public int getValue() {
            return value;
        }
    }
}
