package Ejercicio3.comportamientoCondicional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

class Bandeja {
    private int capacidad;
    private List<Pieza> piezas;
    private Estado estado;

    Bandeja(int capacidad) {
        assert capacidad > 0;
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
        }else{
            throw new RuntimeException ("No se puede agregar la pieza, la bandeja esta llena");
        }
    }

    Pieza get() {
        if (piezas.size() > 0) {
            Pieza pieza = piezas.get(piezas.size() - 1);
            piezas.remove(pieza);
            pieza.removeBandeja();
            return pieza;
        } else {
            throw new RuntimeException("No se puede sacar la pieza, la bandeja esta vacia");
        }
        
    }

    int size() {
        return piezas.size();
    }

    Estado getEstado() {
        if (piezas.size() == 0) {
            estado = Estado.Empty;
        } else if (piezas.size() == capacidad) {
            estado = Estado.Full;
        } else {
            estado = Estado.Normal;
        }
        return estado;
    }
}
