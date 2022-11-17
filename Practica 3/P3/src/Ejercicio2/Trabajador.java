package Ejercicio2;

abstract class Trabajador {
    private String nombre;
    private String numeroSeguridadSocial;
    protected double salario;

    Trabajador(String nombre, String numeroSeguridadSocial, double salario) {
        setNombre(nombre);
        setNumeroSeguridadSocial(numeroSeguridadSocial);
        setSalario(salario);
    }

    public double nomina() {
        return salario;
    }

    public abstract void incrementar();

    public String getNombre() {
        return nombre;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }
}
