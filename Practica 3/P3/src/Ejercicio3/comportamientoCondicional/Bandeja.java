package Ejercicio3.comportamientoCondicional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Bandeja {
    private final int capacidad;
    private List<Pieza> piezas;

    public Bandeja(int capacidad) {
        assert(capacidad > 0);
        this.capacidad = capacidad;
        piezas = new ArrayList<>();
    }

    public Enumeration<Pieza> getPiezas() {
        return Collections.enumeration(piezas);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void put(Pieza p) {
        if (piezas.size() < capacidad) {
            piezas.add(p);
            p.addBandeja(this);
        }
    }

    public Pieza get() {
        if (piezas.size() > 0) {
            Pieza pieza = piezas.get(piezas.size() - 1);
            pieza.removeBandeja();
            return pieza;
        } else {
            return null;
        }
    }

    public int size() {
        return piezas.size();
    }
}
