package Ejercicio3.patronEstado;

class Empty extends Estado {
    private Bandeja bandeja;

    Empty(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    protected void put(Pieza p) {
        bandeja.addPieza(p);
        p.addBandeja(bandeja);
        if (bandeja.getCapacidad() == 1) {
            bandeja.setEstado(new Full(bandeja));
        } else {
            bandeja.setEstado(new Normal(bandeja));
        }
        bandeja = null;
    }

    @Override
    protected Pieza get() {
        return null;
    }
}
