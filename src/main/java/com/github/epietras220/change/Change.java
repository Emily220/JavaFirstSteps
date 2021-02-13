package com.github.epietras220.change;

import java.util.EnumMap;

public class Change {

    public EnumMap<Denomination, Integer> change(int n) { // zad. 2
        EnumMap<Denomination, Integer> map = new EnumMap<Denomination, Integer>(Denomination.class);
        Denomination[] d = Denomination.values();

        int i = d.length - 1;
        int ilosc = 0;
        while (n > 0) {
            if (d[i].getValue() <= n) {
                ilosc++;
                map.put(d[i], ilosc);
                System.out.println(d[i]);
                n = n - d[i].getValue();
            } else {
                i--;
                ilosc = 0;
            }
        }
        System.out.println(map);
        return map;
    }

}
