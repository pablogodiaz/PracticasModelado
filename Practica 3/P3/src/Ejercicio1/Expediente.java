package Ejercicio1;

import java.util.List;
import java.util.LinkedList;

class Expediente {
    
    private Paciente paciente;
    private List<Acceso> listaAccesos = new LinkedList<>();

    Expediente(Paciente paciente, List<Acceso> listaAccesos){
        //Expediente tiene que tener si o si un paciente
        assert !paciente.equals(null);

        //Expediente tiene una lista de accesos que puede ser vacia
        assert !listaAccesos.equals(null);

        this.paciente = paciente;
        this.listaAccesos = listaAccesos;
    }

    Expediente(Paciente paciente){
        //Expediente tiene que tener si o si un paciente
        assert !paciente.equals(null);

        this.paciente = paciente;
    }

    //Si se creara un expediente antes de tener un paciente, se creará un paciente nuevo para mantener la consistencia
    Expediente(){
        paciente = new Paciente(this);
    }

    void addAcceso(Acceso a){
        assert !a.equals(null);
        listaAccesos.add(a);
    }

    void setPaciente(Paciente p){
        assert !p.equals(null);
        this.paciente = p;
    }

    Paciente getPaciente(){
        return paciente;
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
