package Ejercicio2Ruben;
public class Pensionista extends Trabajador{
   
	Pensionista (String nombre, String numeroSeguridadSocial, Double salario) {
        this.setNombre(nombre);
        this.setNumeroSeguridadSocial(numeroSeguridadSocial);
        this.setSalario(salario);
    }

    public void incrementar() {
        this.setSalario(this.getSalario()*1.04);
    }
}
