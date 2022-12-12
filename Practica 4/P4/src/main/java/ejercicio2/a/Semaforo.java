package ejercicio2.a;

public class Semaforo {
	
	private EstadoSemaforo estadoSemaforo;
	
	Semaforo () {
		estadoSemaforo = new Rojo();
	}
	
	protected void abrir() {
		estadoSemaforo.abrir(this);
	}
	
	protected void cerrar() {
		estadoSemaforo.cerrar(this);
	}

	public String estado() {
		return estadoSemaforo.estado();
	}

	protected void setEstadoSemaforo(EstadoSemaforo estadoSemaforo) {
		this.estadoSemaforo = estadoSemaforo;
	}
	
}
