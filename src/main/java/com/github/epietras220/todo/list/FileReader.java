package com.github.epietras220.todo.list;

import java.io.IOException;
import java.util.List;

interface FileReader {
    List<String> read(String path) throws IOException;
    List<Entry> getToDoListEntries(String key, String path) throws IOException;
}
