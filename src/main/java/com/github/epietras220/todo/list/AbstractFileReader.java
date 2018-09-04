package com.github.epietras220.todo.list;


import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

abstract class AbstractFileReader implements FileReader {

    private static String PATH = "C:\\ToDoList\\storage";

    File getFile(String path) {
        if (path == null) {
            throw new IllegalArgumentException("May not be null");
        }
        path = PATH + "\\" + path;

        return Paths.get(path).toFile();
    }

    @Override
    public List<Entry> getToDoListEntries(String key, String path) throws IOException {
        List<Entry> result = new ArrayList<>();
        List<String> lines = read(path);

        for (String line : lines) {
            Entry passwordEntry = new Entry(line, ";");
            result.add(passwordEntry);
        }
        return result;
    }

    @Override
    public abstract List<String> read(String path) throws IOException;
}
