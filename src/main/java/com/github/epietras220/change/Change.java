package com.github.epietras220.change;

public class Change {
    public void change(int n) { // zad. 2.1
        int[] denomination = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int i : denomination) {
            // for (int i = 0; i < denomination.length; i++) {
            if (denomination[i] <= n) {
                System.out.println(denomination[i]);
                n = n - denomination[i];
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
    }
}
