package Ejercicio1;

import java.util.LinkedList;
import java.util.List;

class Paciente {

    private List<Expediente> expedientes;
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

        List<Acceso> listaAccesos = new LinkedList<>();
        Expediente expedienteAbierto = new Expediente(this, listaAccesos);

        this.addExpediente(expedienteAbierto);
        this.expedienteAbierto = expedienteAbierto;
    }

    

    protected void addExpediente(Expediente e){
        assert !e.equals(null);
        expedientes.add(e);
    }
}
