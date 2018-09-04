package com.github.epietras220.todo.list;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    private String uuid;
    private LocalDateTime createdAt;
    private String task;
    private boolean completed;
    private LocalDateTime deadline;

    public Entry() {
    }

    public Entry(String csvString, String sep) {
        String[] split = csvString.split(sep);
        this.uuid = split[0];
        this.createdAt = LocalDateTime.parse(split[1], formatter);
        //TODO - reszta pól

    }


    public String toCsvString(String sep) {
        return new StringBuilder()
                .append(uuid)
                .append(sep)
                .append(createdAt.format(formatter))
                .append(sep)
                .append(task)
                .append(sep)
                .append(completed)
                .append(deadline.format(formatter))
                .toString();
    }

    public void complete() {
        //todo
    }

    public void extendDeadline(int days) {
        //todo
    }

    //TODO gettery


}
