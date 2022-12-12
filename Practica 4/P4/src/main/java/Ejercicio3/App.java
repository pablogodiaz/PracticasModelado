package Ejercicio3;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        Email e1 = new Email("victor", "Hola", new Date(122, 10, 20), Priority.HIGH, "Hola");
        Email e2 = new Email("pepe", "holaa", new Date(122,10,5), Priority.LOW, "Hola");
        Email e3 = new Email("juan", "holaaa", new Date(122,12,4), Priority.MEDIUM, "Hola");
        Email e4 = new Email("juan", "holaaa", new Date(121,10,8), Priority.HIGH, "Hola");

        ArrayList<Email> emails = new ArrayList<Email>();

        emails.add(e1);
        emails.add(e2);
        emails.add(e3);
        emails.add(e4);

        Mailbox mailbox = new Mailbox(emails);
        mailbox.setOrderedStrategy(new OrderedByFrom());
        mailbox.show();

        mailbox.setOrderedStrategy(new OrderedByPriority());
        mailbox.show();

        mailbox.setOrderedStrategy(new OrderedByDate());
        mailbox.show();
    }
}
