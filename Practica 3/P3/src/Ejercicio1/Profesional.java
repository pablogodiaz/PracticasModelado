package Ejercicio1;

import java.util.LinkedList;
import java.util.List;

class Profesional {
    
    private List<Acceso> listaAccesos = new LinkedList<>();

    Profesional(List<Acceso> listaAccesos){
        assert !listaAccesos.equals(null);
        this.listaAccesos = listaAccesos;
    }

    Profesional(){

    }

    void addAcceso(Acceso a){
        assert !a.equals(null);
        listaAccesos.add(a);
    }

    List<Acceso> getListaAccesos(){
        return listaAccesos;
    }

    void setListaAccesos(List<Acceso> listaAccesos){
        assert !listaAccesos.equals(null);
        this.listaAccesos = listaAccesos;
    }

    void removeAcceso(Acceso a){
        assert !a.equals(null);
        listaAccesos.remove(a);
    }
}
