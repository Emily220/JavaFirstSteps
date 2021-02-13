package com.github.epietras220.todo.list;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LineWriter extends AbstractFileWriter {

    private static String PATH = "C:\\ToDoList";



    @Override
    public void write(List<Entry> entries, String path) throws IOException {
        ArrayList<String> lines = new ArrayList<>();

        for (Entry entry: entries){
            String line = entry.toString();
            lines.add(line);
        }
        try{
            Files.write(Paths.get(path), lines);
        } catch (IOException ex){
            System.out.println("nie moge zapisac pliku!");
        }

    }
    File getFile(String path) {
        if (path == null) {
            throw new IllegalArgumentException("May not be null");
        }
        path = PATH + "\\" + path;

        return Paths.get(path).toFile();
    }
}
