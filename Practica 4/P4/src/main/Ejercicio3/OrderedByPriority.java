package Ejercicio3;

class OrderedByPriority implements Strategy {
    
    @Override
    boolean before(Email m1, Email m2){
        return m1.getPriority().compareTo(m2.getPriority()) < 0;
    }
}
