package a;

public class Semaforo {
	
	protected EstadoSemaforo estadoSemaforo;
	
	public Semaforo () {
		estadoSemaforo = new Rojo();
	}
	
	public void abrir() {
		estadoSemaforo.abrir(this);
	}
	
	public void cerrar() {
		estadoSemaforo.cerrar(this);
	}

	public String estado() {
		return estadoSemaforo.estado();
	}
	
}
