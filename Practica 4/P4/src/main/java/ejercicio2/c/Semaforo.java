package ejercicio2.c;

public class Semaforo {
	private EstadoSemaforo estadoSemaforo;
	private boolean esTriestable;
	
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
	
	public void cambio() {
		esTriestable = !esTriestable;
	}

	protected void setEstadoSemaforo(EstadoSemaforo estadoSemaforo) {
		this.estadoSemaforo = estadoSemaforo;
	}

	protected boolean esTriestable() {
		return this.esTriestable;
	}
}
