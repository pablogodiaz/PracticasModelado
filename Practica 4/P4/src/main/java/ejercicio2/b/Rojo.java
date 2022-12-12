package ejercicio2.b;

public class Rojo extends EstadoSemaforo{

	Rojo() {
		
	}
	
	protected void abrir(Semaforo s) {
		s.setEstadoSemaforo(new Amarillo());
	}
	
	protected void cerrar(Semaforo s) {
		throw new RuntimeException("Ya está cerrado el semaforo: " + s);
	}
	
	public String estado() {
		return "Rojo";
	}
	
}
