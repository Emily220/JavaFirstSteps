package com.github.epietras220.arithmetic;

public class Arithmetic {
    public double square(double a, double n) { //zad 4.2

        // System.out.println(Math.pow(2018,1.0/2018)); - a w ten sposób po prostu może być?

        double result = a;
        double tmp = Math.pow(result, (n - 1));
        double e = 0.000000001;

        while (Math.abs(a - tmp * result) >= e) {
            result = 1 / n * ((n - 1) * result + (a / tmp));
            tmp = Math.pow(result, n - 1);
        }
        return result;
    }

    public int inequality() { // zad 4.1
        double suma = 1;
        int i = 2;
        while (suma <= 10) {
            suma = suma + (1 / i);
            i++;
        }
        return i;
    }

    public void arabToRom(int k) { // zad. 4.3
        RomanNumerals[] arab = RomanNumerals.values();
        int i = 0;
        while (k > 0) {
            if (k >= arab[i].getValue()) {
                System.out.print(arab[i]);
                k = k - arab[i].getValue();
            } else {
                i++;
            }
        }
    }

    public void romToArab(String n) { // zad 4.3
        RomanNumerals[] rzym = RomanNumerals.values();

        int i = 0;
        int j = 0;
        int sum = 0;
        int length = n.length();

        while (length>0) {
            if (n.startsWith(rzym[i].name(), j)) {
                sum = sum + rzym[i].getValue();
                j++;
                length--;
            } else {
                i++;
                if (i == (rzym.length -1)) {
                    j++;
                    length--;
                    i=0;
                }
            }
        }
        System.out.println(sum);
    }
}
