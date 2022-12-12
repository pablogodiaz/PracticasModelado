package b;

public class Rojo extends EstadoSemaforo{

	Rojo() {
		
	}
	
	void abrir(Semaforo s) {
		s.estadoSemaforo = new Amarillo();
	}
	
	void cerrar(Semaforo s) {
		throw new RuntimeException("Ya está cerrado el semaforo: " + s);
	}
	
	public String estado() {
		return "Rojo";
	}
	
}
