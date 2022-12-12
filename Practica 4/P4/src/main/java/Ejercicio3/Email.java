package Ejercicio3;

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
}
