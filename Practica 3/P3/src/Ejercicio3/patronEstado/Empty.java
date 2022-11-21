package Ejercicio3.patronEstado;

public class Empty extends Estado {
    private Bandeja bandeja;

    protected Empty(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    public void put(Pieza p) {
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
    public Pieza get() {
        return null;
    }
}
