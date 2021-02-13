package com.github.epietras220.todo.list;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

abstract class AbstractFileWriter {
    private static String PATH = "C:\\ToDoList";

    File getFile(String path){
        if(path == null){
            throw  new IllegalArgumentException("May not be ull");
        }
       path = PATH + "\\" + path;

        return Paths.get(path).toFile();
    }

    public abstract void write(List<Entry> entries, String path) throws IOException;


}
