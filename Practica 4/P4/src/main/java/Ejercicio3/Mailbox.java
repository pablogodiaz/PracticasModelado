package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Mailbox{

    private ArrayList<Email> emails;
    private Strategy orderedStrategy;

    Mailbox(ArrayList<Email> emails){
        this.emails = emails;
    }

    Mailbox(){
        this.emails = new ArrayList<Email>();
    }

    public void show(){
        sort();
        for(Email e: emails){
            System.out.println(e);
        }
    }

    private void sort(){

        for(int i=2; i<emails.size(); i++){
            for(int j=emails.size()-1; j>=i; j--){
                Email e1 = emails.get(j);
                Email e2 = emails.get(j-1);
                if(orderedStrategy.before(e1, e2)){
                    Email aux = e1;
                    emails.set(j,e2);
                    emails.set(j-1,aux);
                }
            }
        }
    }

    public void setOrderedStrategy(Strategy orderedStrategy){
        this.orderedStrategy = orderedStrategy;
    }

    
}