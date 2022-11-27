package Ejercicio1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Paciente {

    private Set<Expediente> expedientes = new HashSet<>();
    private Expediente expedienteAbierto;

    Paciente(Set<Expediente> expedientes, Expediente expedienteAbierto){

        //Lista de expedientes tiene que tener al menos un elemento
        assert expedientes.size() >= 1;
        
        //expedienteAbierto puede ser null, si no es null deberá estar en la lista de expedientes
        assert expedienteAbierto.equals(null) || (!expedienteAbierto.equals(null) && expedientes.contains(expedienteAbierto));

        this.expedientes = expedientes;
        this.expedienteAbierto = expedienteAbierto;
    }


    Paciente(Expediente expedienteAbierto){
        
        //Expediente abierto puede ser null

        this.addExpediente(expedienteAbierto);
        this.expedienteAbierto = expedienteAbierto;
    }

    
    //Un paciente tiene que tener por lo menos un expediente en su lista de expedientes.
    //Para mantener la consistencia se crea un expediente nuevo y se añade a la lista de expedientes del paciente
    Paciente(){
        addExpediente(new Expediente(this));
    }

    void addExpediente(Expediente e){
        assert !e.equals(null);
        expedientes.add(e);
    }

    //Se abre un expediente al paciente de su lista de expedintes, o, en el caso de que ese expediente no
    //esté en la lista de expedientes del paciente, se añade
    void setExpedienteAbierto(Expediente e){
        assert e.getPaciente().equals(this);
        if(!expedientes.contains(e)){
            addExpediente(e);
        }
        expedienteAbierto = e;
    }

    Expediente getExpedienteAbierto(){
        return expedienteAbierto;
    }

    Set<Expediente> getExpedientes(){
        return expedientes;
    }

    void setExpedientes(Set<Expediente> expedientes){
        assert expedientes.size() >= 1;
        this.expedientes = expedientes;
    }

    void removeExpediente(Expediente e){
        assert !e.equals(null);
        expedientes.remove(e);
    }
    
}
