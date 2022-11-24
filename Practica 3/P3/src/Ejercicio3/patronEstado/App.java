package Ejercicio3.patronEstado;

public class App {

    public static void main(String[] args) throws Exception {

        Bandeja bandeja = new Bandeja(3);

        Pieza pieza1 = new Pieza();

        System.out.println(bandeja.getEstado());

        bandeja.put(pieza1);

        System.out.println(bandeja.getEstado());
    }
    
}
