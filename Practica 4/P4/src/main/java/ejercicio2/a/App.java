package ejercicio2.a;

import a.Semaforo;

public class App {

    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo();

        System.out.println(semaforo.estado()); 

        semaforo.abrir();

        System.out.println(semaforo.estado());

        semaforo.cerrar();

        System.out.println(semaforo.estado());
        
    }
    
}
