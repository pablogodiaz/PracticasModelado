package Ejercicio3;

import java.util.Date;

public class Email {
    private String from;
    private String subject;
    private Date date;
    private Priority priority;
    private String text;

    Email(String from, String subject, Date date, Priority priority, String text) {
        this.from = from;
        this.subject = subject;
        this.date = date;
        this.priority = priority;
        this.text = text;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public Date getDate() {
        return date;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getText() {
        return text;
    }

    public String toString() {
        return "From: " + from + " Subject: " + subject + " Date: " + date + " Priority: " + priority + " Text: " + text;
    }
}
