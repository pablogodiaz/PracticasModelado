package Ejercicio3.patronEstado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

class Bandeja {
    private int capacidad;
    private Estado estado;
    private List<Pieza> piezas;

    Bandeja(int capacidad) {
        assert(capacidad > 0);
        this.capacidad = capacidad;
        estado = new Empty(this);
        piezas = new ArrayList<>();
    }

    void addPieza(Pieza p) {
        piezas.add(p);
    }

    Pieza removePieza() {
        return piezas.remove(piezas.size()-1);
    }

    void setEstado(Estado estado) {
        this.estado = estado;
    }

    Estado getEstado(){
        return estado;
    }

    List<Pieza> getPiezas() {
        return piezas;
    }

    int getCapacidad() {
        return capacidad;
    }

    void put(Pieza p) {
        estado.put(p);
    }

    Pieza get() {
        return estado.get();
    }

    int size() {
        return piezas.size();
    }
}
