public class OrderedByDate implements Strategy {
    
    boolean before(Email m1, Email m2){
        return m1.getDate().compareTo(m2.getDate()) < 0;
    }
}
