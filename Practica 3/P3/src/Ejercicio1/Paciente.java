package Ejercicio1;

import java.util.LinkedList;
import java.util.List;

class Paciente {

    private List<Expediente> expedientes = new LinkedList<>();
    private Expediente expedienteAbierto;

    protected Paciente(List<Expediente> expedientes, Expediente expedienteAbierto){

        //Lista de expedientes tiene que tener al menos un elemento
        assert expedientes.size() >= 1;
        
        //expedienteAbierto puede ser null, si no es null deberá estar en la lista de expedientes
        assert expedienteAbierto.equals(null) || (!expedienteAbierto.equals(null) && expedientes.contains(expedienteAbierto));

        this.expedientes = expedientes;
        this.expedienteAbierto = expedienteAbierto;
    }


    protected Paciente(Expediente expedienteAbierto){
        
        //Expediente abierto puede ser null

        this.addExpediente(expedienteAbierto);
        this.expedienteAbierto = expedienteAbierto;
    }

    
    //Un paciente tiene que tener por lo menos un expediente en su lista de expedientes.
    //Para mantener la consistencia se crea un expediente nuevo y se añade a la lista de expedientes del paciente
    protected Paciente(){
        addExpediente(new Expediente(this));
    }

    protected void addExpediente(Expediente e){
        assert !e.equals(null);
        expedientes.add(e);
    }

    //Se abre un expediente al paciente de su lista de expedintes, o, en el caso de que ese expediente no
    //esté en la lista de expedientes del paciente, se añade
    protected void setExpedienteAbierto(Expediente e){
        assert e.getPaciente().equals(this);
        if(!expedientes.contains(e)){
            addExpediente(e);
        }
        expedienteAbierto = e;
    }

    protected Expediente getExpedienteAbierto(){
        return expedienteAbierto;
    }

    protected List<Expediente> getExpedientes(){
        return expedientes;
    }

    protected void setExpedientes(List<Expediente> expedientes){
        assert expedientes.size() >= 1;
        this.expedientes = expedientes;
    }

    protected void removeExpediente(Expediente e){
        assert !e.equals(null);
        expedientes.remove(e);
    }
}
