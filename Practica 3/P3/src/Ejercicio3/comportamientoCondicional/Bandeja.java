package Ejercicio3.comportamientoCondicional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

class Bandeja {
    private int capacidad;
    private List<Pieza> piezas;

    Bandeja(int capacidad) {
        assert(capacidad > 0);
        this.capacidad = capacidad;
        piezas = new ArrayList<>();
    }

    Enumeration<Pieza> getPiezas() {
        return Collections.enumeration(piezas);
    }

    int getCapacidad() {
        return capacidad;
    }

    void put(Pieza p) {
        if (piezas.size() < capacidad) {
            piezas.add(p);
            p.addBandeja(this);
        }
    }

    Pieza get() {
        if (piezas.size() > 0) {
            Pieza pieza = piezas.get(piezas.size() - 1);
            pieza.removeBandeja();
            return pieza;
        } else {
            return null;
        }
    }

    int size() {
        return piezas.size();
    }
}
