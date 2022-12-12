package b;

public class Verde extends EstadoSemaforo{

	Verde() {
		
	}
	
	void abrir(Semaforo s) {
		throw new RuntimeException("Ya está abierto el semaforo: " + s);
	}
	
	void cerrar(Semaforo s) {
		s.estadoSemaforo = new Amarillo();
	}
	
	public String estado() {
		return "Verde";
	}
	
}
