package b;

public class Rojo extends EstadoSemaforo{

	public Rojo() {
		
	}
	
	public void abrir(Semaforo s) {
		s.estadoSemaforo = new Amarillo();
	}
	
	public void cerrar(Semaforo s) {
		throw new RuntimeException("Ya está cerrado el semaforo: " + s);
	}
	
	public String estado() {
		return "Rojo";
	}
	
}
