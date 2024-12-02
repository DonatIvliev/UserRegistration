package Screens.MainScreen;

import java.util.Date;

public class Task {
    String name;
    String text;
    int id;
    Date eventDate;
    boolean completed;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; 
    }

    public Task(Date eventDate, String name, String text, int id){
        this(eventDate, name, text);
        this.id = id;
    }
    public Task(Date eventDate, String name, String text) {
        this.completed = false;
        this.eventDate = eventDate;
        this.name = name;
        this.text = text;
        this.id = 0;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
