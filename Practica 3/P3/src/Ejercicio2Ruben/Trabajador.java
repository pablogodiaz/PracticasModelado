package Ejercicio2Ruben;
public abstract class Trabajador {
    private String nombre;
    private String numeroSeguridadSocial;
    private Double salario;
    
    public Double nomina() {
        return this.salario;
    }
    public abstract void incrementar();
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}
	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
}
