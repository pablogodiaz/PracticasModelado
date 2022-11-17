package Ejercicio2;

public class App {
    public static void main(String[] args) throws Exception {
        //Activo activo = new Activo("Pablo", "555501234", 1000);
        //Pensionista pensionista = new Pensionista("Victor", "550034726", 1500);
        //activo.incrementar();
        //pensionista.incrementar();

        MedioPensionista medioPensionista = new MedioPensionista("Pablo", "555501234", 1000, 1500);
        medioPensionista.incrementar();
    }
}
