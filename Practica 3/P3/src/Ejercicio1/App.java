package Ejercicio1;

import java.sql.Date;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Se crea el paciente pepe. Un paciente debe tener por lo menos un expediente, por lo tanto se crea también un expediente
        Paciente pepe = new Paciente();

        //Vemos que en la lista de expedientes, el paciente pepe tiene un expediente
        System.out.println("Paciente: pepe" + ", Expedientes: " + pepe.getExpedientes().size());

        //Creamos un nuevo expediente para el paciente pepe, y se lo añadimos como expediente abierto
        Expediente expedientePepe = new Expediente(pepe);
        pepe.setExpedienteAbierto(expedientePepe);

        //Vemos que al añadirse el expediente abierto, también se añade a la lista de expedientes del paciente, aumentando el tamaño de la lista
        System.out.println("Paciente: pepe" + ", Expedientes: " + pepe.getExpedientes().size());


        Profesional doctorPaco = new Profesional();
        Acceso acceso1 = new Acceso(new Date(122, 10, 20), TipoAcceso.consulta, expedientePepe, doctorPaco);

        //Vemos que el expediente abierto del paciente pepe tiene un acceso
        System.out.println("Número de accesos expediente del paciente pepe: " + pepe.getExpedienteAbierto().getListaAccesos().size());

    }
}
