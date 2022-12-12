package Ejercicio3;


public class OrderedByFrom implements Strategy {

    @Override
    public boolean before(Email m1, Email m2){
        return m1.getFrom().compareTo(m2.getFrom()) < 0;
    }
}