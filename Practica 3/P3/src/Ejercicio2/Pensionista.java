package Ejercicio2;

class Pensionista extends Trabajador {

    Pensionista(String nombre, String numeroSeguridadSocial, double salario) {
        this.setNombre(nombre);
        this.setNumeroSeguridadSocial(numeroSeguridadSocial);
        this.setSalario(salario);    
        }

    @Override
    public void incrementar() {
        super.setSalario(super.nomina() * 1.04);
    }
}