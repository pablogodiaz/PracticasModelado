package Ejercicio1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Profesional {
    
    private Set<Acceso> listaAccesos = new HashSet<>();

    Profesional(Set<Acceso> listaAccesos){
        assert !listaAccesos.equals(null);
        this.listaAccesos = listaAccesos;
    }

    Profesional(){

    }

    void addAcceso(Acceso a){
        assert !a.equals(null);
        listaAccesos.add(a);
    }

    Set<Acceso> getListaAccesos(){
        return listaAccesos;
    }

    void setListaAccesos(Set<Acceso> listaAccesos){
        assert !listaAccesos.equals(null);
        this.listaAccesos = listaAccesos;
    }

    void removeAcceso(Acceso a){
        assert !a.equals(null);
        listaAccesos.remove(a);
    }

}
