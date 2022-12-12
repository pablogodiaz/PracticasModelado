package Ejercicio3;


public class OrderedByDate implements Strategy {
    
    @Override
    public boolean before(Email m1, Email m2){
        return m1.getDate().compareTo(m2.getDate()) < 0;
    }
}
