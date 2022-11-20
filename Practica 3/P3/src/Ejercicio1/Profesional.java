package Ejercicio1;

import java.util.LinkedList;
import java.util.List;

class Profesional {
    
    private List<Acceso> listaAccesos = new LinkedList<>();

    protected Profesional(List<Acceso> listaAccesos){
        assert !listaAccesos.equals(null);
        this.listaAccesos = listaAccesos;
    }

    protected Profesional(){

    }

    protected void addAcceso(Acceso a){
        assert !a.equals(null);
        listaAccesos.add(a);
    }

    protected List<Acceso> getListaAccesos(){
        return listaAccesos;
    }

    protected void setListaAccesos(List<Acceso> listaAccesos){
        assert !listaAccesos.equals(null);
        this.listaAccesos = listaAccesos;
    }

    protected void removeAcceso(Acceso a){
        assert !a.equals(null);
        listaAccesos.remove(a);
    }
}
