package Ejercicio3.patronEstado;

class Full extends Estado {
    Full(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    protected void put(Pieza p) {
    }

    @Override
    protected Pieza get() {
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
