package Ejercicio3;


class OrderedBySubject implements Strategy{

    @Override
    boolean before(Email m1, Email m2){
        return m1.getSubject().compareTo(m2.getSubject()) < 0;
    }
}