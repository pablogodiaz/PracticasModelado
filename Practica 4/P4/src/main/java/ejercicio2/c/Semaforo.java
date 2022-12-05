package c;

public class Semaforo {
	
	protected EstadoSemaforo estadoSemaforo;
	protected boolean cambio;
	
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
		cambio = !cambio;
	}
}
