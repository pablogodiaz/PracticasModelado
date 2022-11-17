package Ejercicio1;

import java.util.LinkedList;
import java.util.List;

class Paciente {

    private List<Expediente> expedientes = new LinkedList<>();
    private Expediente expedienteAbierto;

    protected Paciente(List<Expediente> expedientes, Expediente expedienteAbierto){

        //Lista de expediente tiene que tener al menos un elemento
        assert expedientes.size() >= 1;
        
        //Ejercicio1.Expediente abierto puede ser null o perteneciente a la lista de expedientes
        assert expedienteAbierto.equals(null) || expedientes.contains(expedienteAbierto);

        this.expedientes = expedientes;
        this.expedienteAbierto = expedienteAbierto;
    }


    protected Paciente(Expediente expedienteAbierto){
        
        //Ejercicio1.Expediente abierto puede ser null
        assert expedienteAbierto.equals(null);

        this.addExpediente(expedienteAbierto);
        this.expedienteAbierto = expedienteAbierto;
    }

    
    protected Paciente(){

        // TODO: Mirar diferencia entre LinkedList y ArrayList
        addExpediente(new Expediente(this));

    }

    protected void addExpediente(Expediente e){
        assert !e.equals(null);
        expedientes.add(e);
    }

    protected void setExpedienteAbierto(Expediente e){
        assert e.getPaciente().equals(this);
        if(!expedientes.contains(e)){
            addExpediente(e);
        }
        expedienteAbierto = e;
    }
}
