class OrderedByFrom implements Strategy {

    boolean before(Email m1, Email m2){
        return m1.getFrom().compareTo(m2.getFrom()) < 0;
    }
}