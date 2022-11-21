package Ejercicio3.patronEstado;

public class Pieza {
    private Bandeja bandeja;

    protected void addBandeja(Bandeja bandeja) {
        this.bandeja = bandeja;
    }

    protected void removeBandeja() {
        bandeja = null;
    }
}
