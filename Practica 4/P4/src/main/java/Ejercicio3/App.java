package Ejercicio3;

import java.util.Date;

import ejercicio3.Mailbox;

public class App {
    public static void main(String[] args) {
        Email e1 = new Email("victor", "Hola", new Date(), Priority.HIGH, "Hola");
        Email e2 = new Email("pepe", "holaa", new Date(), Priority.LOW, "Hola");
        Email e3 = new Email("juan", "holaaa", new Date(), Priority.MEDIUM, "Hola");

        List<Email> emails = new LinkedList<Email>();

        emails.add(e1);
        emails.add(e2);
        emails.add(e3);

        Mailbox mailbox = new Mailbox(emails);
        mailbox.setOrderedStrategy(new OrderedByFrom());
        mailbox.show();

        mailbox.setOrderedStrategy(new OrderedByPriority());
        mailbox.show();
    }
}
