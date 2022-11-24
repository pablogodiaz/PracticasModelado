package Ejercicio3.patronEstado;

class Normal extends Estado {

    Normal(Bandeja bandeja) {
        super(bandeja);
    }
    
    @Override
    protected void put(Pieza pieza) {
        bandeja.addPieza(pieza);
        pieza.addBandeja(bandeja);
        if (bandeja.getCapacidad() == bandeja.size()) {
            bandeja.setEstado(new Full(bandeja));
            bandeja = null;
        }
    }

    @Override
    protected Pieza get() {
        Pieza pieza = bandeja.removePieza();
        if (bandeja.size() == 0) {
            bandeja.setEstado(new Empty(bandeja));
            bandeja = null;
        }
        return pieza;
    }
}
