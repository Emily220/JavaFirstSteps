package com.github.epietras220.prime.number;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes extends Prime {

    private int number;
    private List<Integer> list = new ArrayList<>(number); // warto dodać początkowy rozmiar?

    public SieveOfEratosthenes(int k) {
        super(k);
        number = k;
    }

    private void load() {
        for (int i = 2; i <= number; i++) {
            list.add(i - 2, i);
        }
    }

    public void sieve() {
        load();

        for (int i = 0; i <= (int) Math.floor(Math.sqrt(list.size())); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) % list.get(i) == 0) {
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }
}
