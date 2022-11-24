package Ejercicio3.patronEstado;

abstract class Estado {
    Bandeja bandeja;

    Estado(Bandeja bandeja) {
        assert(bandeja != null);
        this.bandeja = bandeja;
    }

    protected abstract void put(Pieza p);
    protected abstract Pieza get();
}
