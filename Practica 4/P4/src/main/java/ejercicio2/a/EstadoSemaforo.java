package a;

public abstract class EstadoSemaforo {
	
	protected abstract void abrir(Semaforo s);
	protected abstract void cerrar(Semaforo s);
	
	protected abstract String estado();
}
