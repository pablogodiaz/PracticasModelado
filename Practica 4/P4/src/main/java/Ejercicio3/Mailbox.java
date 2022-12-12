package ejercicio3;

public class Mailbox{

    private List<Email> emails;
    private Strategy orderedStrategy;

    Mailbox(List<Email> emails){
        this.emails = emails;
    }

    Mailbox(){
        this.emails = new LinkedList<Email>();
    }

    private void show(){
        System.out.println("Mailbox: " + this.emails);
    }

    private void sort(){
        for(int i=2; i<emails.size(); i++){
            for(int j=emails.size(); j>=i; j--){
                if(orderedStrategy.before(emails.get(j-1), emails.get(j))){
                    Email aux = emails.get(j-1);
                    emails.set(j-1, emails.get(j));
                    emails.set(j, aux);
                }
            }
        }
    }

    void setOrderedStrategy(Strategy orderedStrategy){
        this.orderedStrategy = orderedStrategy;
    }

    
}