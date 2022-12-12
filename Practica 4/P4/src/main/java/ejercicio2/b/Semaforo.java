package b;

public class Semaforo {
	
	private EstadoSemaforo estadoSemaforo;
	
	Semaforo () {
		estadoSemaforo = new Rojo();
	}
	
	void abrir() {
		estadoSemaforo.abrir(this);
	}
	
	void cerrar() {
		estadoSemaforo.cerrar(this);
	}

	public String estado() {
		return estadoSemaforo.estado();
	}
	
}
