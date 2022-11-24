package Ejercicio3.patronEstado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Bandeja {
    private int capacidad;
    private Estado estado;
    private List<Pieza> piezas;

    public Bandeja(int capacidad) {
        assert capacidad > 0;
        this.capacidad = capacidad;
        estado = new Empty(this);
        piezas = new ArrayList<>();
    }

    protected void addPieza(Pieza p) {
        piezas.add(p);
    }

    protected Pieza removePieza() {
        return piezas.remove(piezas.size()-1);
    }

    protected void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Enumeration<Pieza> getPiezas() {
        return Collections.enumeration(piezas);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void put(Pieza p) {
        estado.put(p);
    }

    public Pieza get() {
        return estado.get();
    }

    public int size() {
        return piezas.size();
    }
}
