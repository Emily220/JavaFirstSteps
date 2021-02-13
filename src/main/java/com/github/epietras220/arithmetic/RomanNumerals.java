package com.github.epietras220.arithmetic;

public enum RomanNumerals {
    M(1000), CM(900), D(500), CD(400), C(100), XC(90),  L(50), XL(40),  X(10), IX(9), V(5), IV(4), I(1);

    private int k;

    RomanNumerals(int k) {
        this.k = k;
    }

    public int getValue() {
        return k;
    }

}

