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
        this.task = split[2];
        this.completed = Boolean.parseBoolean(split[3]);
        this.deadline = LocalDateTime.parse(split[4], formatter);
    }

    public static DateTimeFormatter getFormatter() {
        return formatter;
    }

    public String getUuid() {
        return uuid;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getTask() {
        return task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getDeadline() {
        return deadline;
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
                .append(sep)
                .append(deadline.format(formatter))
                .toString();
    }

    public void complete() {
        completed = true;

        //todo - do sprawdzenia
    }

    public void extendDeadline(int days) {
        deadline = deadline.plusDays(days);

        //todo - do sprawdzenia
    }
}
