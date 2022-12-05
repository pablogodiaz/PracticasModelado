package b;

public abstract class EstadoSemaforo {
	
	public abstract void abrir(Semaforo s);
	public abstract void cerrar(Semaforo s);
	
	public abstract String estado();
}
