package Ejercicio2;

class Activo extends Trabajador {

    Activo(String nombre, String numeroSeguridadSocial, double salario) {
        this.setNombre(nombre);
        this.setNumeroSeguridadSocial(numeroSeguridadSocial);
        this.setSalario(salario);
        }

    @Override
    public void incrementar() {
        super.setSalario(super.nomina() * 1.02);
    }
}