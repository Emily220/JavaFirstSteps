package com.github.epietras220.todo.list;

import java.util.Date;

public class PropertiesTodoList {
    private String contentsTask;
    private Date createDate;
    private Date deadline;
    private boolean checkbox;

    public PropertiesTodoList(String contentsTask, Date createDate, Date deadline, boolean checkbox){
        this.contentsTask = contentsTask;
        this.createDate = createDate;
        this. deadline = deadline;
        this.checkbox = checkbox;
    }

    public String getContentsTask() {
        return contentsTask;
    }

    public void setContentsTask(String contentsTask) {
        this.contentsTask = contentsTask;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isCheckbox() {
        return checkbox;
    }

    public void setCheckbox(boolean checkbox) {
        this.checkbox = checkbox;
    }
}
