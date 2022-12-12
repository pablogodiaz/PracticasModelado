package ejercicio2.a;

public class Rojo extends EstadoSemaforo{

	Rojo() {
		
	}
	
	public void abrir(Semaforo s) {
		s.setEstadoSemaforo(new Verde());
	}
	
	protected void cerrar(Semaforo s) {
		throw new RuntimeException("Ya está cerrado el semaforo: " + s);
	}
	
	protected String estado() {
		return "Rojo";
	}
	
}
