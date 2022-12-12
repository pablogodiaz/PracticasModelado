package a;

public class Verde extends EstadoSemaforo{

	public Verde() {
		
	}
	
	void abrir(Semaforo s) {
		throw new RuntimeException("Ya está abierto el semaforo: " + s);
	}
	
	void cerrar(Semaforo s) {
		s.estadoSemaforo = new Rojo();
	}
	
	public String estado() {
		return "Verde";
	}
	
}
