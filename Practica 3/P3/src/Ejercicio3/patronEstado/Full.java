package Ejercicio3.patronEstado;

public class Full extends Estado {

    protected Full(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    public void put(Pieza p) {
    }

    @Override
    public Pieza get() {
        Pieza pieza = bandeja.removePieza();
        if (bandeja.getCapacidad() == 1) {
            bandeja.setEstado(new Empty(bandeja));
        } else {
            bandeja.setEstado(new Normal(bandeja));
        }
        bandeja = null;
        return pieza;
    }
}
