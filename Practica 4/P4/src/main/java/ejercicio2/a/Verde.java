package ejercicio2.a;

public class Verde extends EstadoSemaforo{

	public Verde() {
		
	}
	
	protected void abrir(Semaforo s) {
		throw new RuntimeException("Ya está abierto el semaforo: " + s);
	}
	
	protected void cerrar(Semaforo s) {
		s.setEstadoSemaforo(new Rojo());
	}
	
	public String estado() {
		return "Verde";
	}
	
}
