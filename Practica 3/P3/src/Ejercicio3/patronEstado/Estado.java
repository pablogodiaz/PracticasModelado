package Ejercicio3.patronEstado;

public abstract class Estado {
    Bandeja bandeja;

    protected Estado(Bandeja bandeja) {
        assert(bandeja != null);
        this.bandeja = bandeja;
    }

    protected abstract void put(Pieza p);
    protected abstract Pieza get();
}
