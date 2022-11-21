package Ejercicio3.comportamientoCondicional;

public class Pieza {
    private Bandeja bandeja;

    protected void addBandeja(Bandeja bandeja) {
        this.bandeja = bandeja;
    }

    protected void removeBandeja() {
        bandeja = null;
    }
}
