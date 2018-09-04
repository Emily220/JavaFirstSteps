package com.github.epietras220.todo.list;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;


public class Manager {

    public static void saveFile(String name, ArrayList<PropertiesTodoList> dane) {
        Path path = Paths.get(name);
        ArrayList<String> odczyt = new ArrayList<>();

        for (PropertiesTodoList seria : dane) {
            String s = Arrays.toString(new PropertiesTodoList[]{seria});

            s = s.replace("[", "");
            s = s.replace("]", "");

           odczyt.add(s);
        }
        try {
            Files.write(path, odczyt);
        } catch (IOException ex) {
            System.out.println("Nie moge zapisac pliku");
        }

    }
}
