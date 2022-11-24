package Ejercicio3.comportamientoCondicional;

class App {
    public static void main(String[] args) throws Exception {

        Bandeja bandeja = new Bandeja(3);

        System.out.println("Piezas en bandeja: " + bandeja.size());

        System.out.println("Estado de la bandeja: " + bandeja.getEstado());

        Pieza pieza1 = new Pieza();
        Pieza pieza2 = new Pieza();
        Pieza pieza3 = new Pieza();

        bandeja.put(pieza1);
        bandeja.put(pieza2);

        System.out.println("Piezas en bandeja: " + bandeja.size());

        System.out.println("Estado de la bandeja: " + bandeja.getEstado());

        bandeja.put(pieza3);

        System.out.println("Piezas en bandeja: " + bandeja.size());

        System.out.println("Estado de la bandeja: " + bandeja.getEstado());

        bandeja.get();

        System.out.println("Piezas en bandeja: " + bandeja.size());

        System.out.println("Estado de la bandeja: " + bandeja.getEstado());

        bandeja.get();
        bandeja.get();

        System.out.println("Piezas en bandeja: " + bandeja.size());

        System.out.println("Estado de la bandeja: " + bandeja.getEstado());





    }
    
}
