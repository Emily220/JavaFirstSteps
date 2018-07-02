package com.github.epietras220.prime.number;

public class Prime {

    private int primeNumber;

    public Prime(int k) {
        if (k <= 1) {
            System.out.println("Number must be more than 1. Enter correct number.");
        } else {
            primeNumber = k;
            //checkPrime();
            checkPrime2();
        }
    }

    public void checkPrime() {

        int sum = 0;
        for (int i = 2; i <= primeNumber; i++) {
            if (primeNumber % i == 0) {
                sum++;
            }
        }
        if (sum == 1) {
            System.out.println("This is prime number");
        } else {
            System.out.println("This is composite number");
        }
    }

    private void checkPrime2() {
        boolean isPrime = true;

        for (int i = primeNumber - 1; i > 1; i--) {
            if (primeNumber % i == 0) {
                System.out.println("This is composite number");
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("This is prime number");
        }
    }

}
