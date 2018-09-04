package com.github.epietras220.todo.list;

import java.time.LocalDateTime;

public class Entry {

    private String uuid;
    private LocalDateTime createdAt;
    private String task;
    private boolean completed;
    private LocalDateTime deadLine;


    public String toCsvString(){
        return null;
    }
}
