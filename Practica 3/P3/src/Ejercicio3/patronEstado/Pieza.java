package Ejercicio3.patronEstado;

class Pieza {
    private Bandeja bandeja;

    void addBandeja(Bandeja bandeja) {
        this.bandeja = bandeja;
    }

    void removeBandeja() {
        bandeja = null;
    }
}
