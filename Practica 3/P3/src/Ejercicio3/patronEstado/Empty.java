package Ejercicio3.patronEstado;

class Empty extends Estado {

    Empty(Bandeja bandeja) {
        super(bandeja);
    }

    @Override
    protected void put(Pieza p) {
        assert p != null;
        assert !bandeja.getPiezas().contains(p);
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
        throw new RuntimeException("La bandeja está vacía");
    }
    

    public String toString() {
        return "Empty";
    }
}
