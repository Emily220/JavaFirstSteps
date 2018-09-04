package com.github.epietras220.todo.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date a = new Date(2000,01,01);
        Date b = new Date(2000,04,01);

        ArrayList<PropertiesTodoList> task = new ArrayList<>();
        PropertiesTodoList asa = new PropertiesTodoList("Tresc zadania", a, b, true );

        task.add(asa);

        Manager.saveFile("nazwa_pliku1.csv", task );
    }
}
