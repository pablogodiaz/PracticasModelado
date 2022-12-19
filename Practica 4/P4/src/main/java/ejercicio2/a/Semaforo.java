package ejercicio2.a;

public class Semaforo {
	
	private EstadoSemaforo estadoSemaforo;
	
	public Semaforo() {
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

	protected void setEstadoSemaforo(EstadoSemaforo estadoSemaforo) {
		this.estadoSemaforo = estadoSemaforo;
	}
}
