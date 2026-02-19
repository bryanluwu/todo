package dev.bryan.todo;

public class Task {
    public String id = "1";
    public String desc = null;
    public String date = null;

    public Task (String id, String desc, String date) {
        this.id = id;
        this.desc = desc;
        this.date = date;
    }
}