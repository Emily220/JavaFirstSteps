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

    public void romToArab(String a) {
        RomToArab[] rom = RomToArab.values();
    }

    public enum RomToArab {
        THOUSAND("M"), NINE_HUNDRED("CM"), FIVE_HUNDRED("D"), FOUR_HUNDRED("CD"), ONE_HUNDRED("C"),
        NINETY("XC"), FIVETY("L"), FOURTY("XL"), TEN("X"), NINE("IX"), FIVE("V"), FOUR("IV"), ONE("I");

        private String a;

        RomToArab(String a) {
            this.a = a;
        }

        public String getValue() {
            return a;
        }
    }

    public void arabToRom(int k) {
        ArabToRom[] arab = ArabToRom.values();

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

    public enum ArabToRom {
        M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);

        private int k;

        public int getValue() {
            return k;
        }

        ArabToRom(int k) {
            this.k = k;
        }
    }
}