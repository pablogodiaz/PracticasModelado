package a;

public class Verde extends EstadoSemaforo{

	public Verde() {
		
	}
	
	public void abrir(Semaforo s) {
		throw new RuntimeException("Ya está abierto el semaforo: " + s);
	}
	
	public void cerrar(Semaforo s) {
		s.estadoSemaforo = new Rojo();
	}
	
	public String estado() {
		return "Verde";
	}
	
}
