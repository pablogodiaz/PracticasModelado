package c;

public class Rojo extends EstadoSemaforo{

	public Rojo() {
		
	}
	
	public void abrir(Semaforo s) {
		if(s.cambio) {
			s.estadoSemaforo = new Verde();
		} else {
			s.estadoSemaforo = new Amarillo();
		}
	}
	
	public void cerrar(Semaforo s) {
		throw new RuntimeException("Ya está cerrado el semaforo: " + s);
	}
	
	public String estado() {
		return "Rojo";
	}
	
}
