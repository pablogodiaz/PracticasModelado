package ejercicio2.b;

public class Verde extends EstadoSemaforo{

	Verde() {
		
	}
	
	protected void abrir(Semaforo s) {
		throw new RuntimeException("Ya está abierto el semaforo: " + s);
	}
	
	protected void cerrar(Semaforo s) {
		s.setEstadoSemaforo(new Amarillo());
	}
	
	public String estado() {
		return "Verde";
	}
	
}
