package c;

public class Amarillo extends EstadoSemaforo{

	public Amarillo() {
		
	}
	
	public void abrir(Semaforo s) {
		s.estadoSemaforo = new Verde();
	}
	
	public void cerrar(Semaforo s) {
		s.estadoSemaforo = new Rojo();
	}
	
	public String estado() {
		return "Amarillo";
	}
	
}
