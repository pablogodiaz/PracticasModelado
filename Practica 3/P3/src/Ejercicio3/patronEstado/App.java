package Ejercicio3.patronEstado;

public class App {

    public static void main(String[] args) throws Exception {

        Bandeja bandeja = new Bandeja(3);

        Pieza pieza1 = new Pieza();
        Pieza pieza2 = new Pieza();
        Pieza pieza3 = new Pieza();

        System.out.println("Estado bandeja: " + bandeja.getEstado());

        bandeja.put(pieza1);

        System.out.println("Estado bandeja: " + bandeja.getEstado());

        bandeja.put(pieza2);
        bandeja.put(pieza3);

        System.out.println("Estado bandeja: " + bandeja.getEstado());

        bandeja.get();

        System.out.println("Estado bandeja: " + bandeja.getEstado());

        bandeja.get();
        bandeja.get();

        System.out.println("Estado bandeja: " + bandeja.getEstado());


        
    }
    
}
