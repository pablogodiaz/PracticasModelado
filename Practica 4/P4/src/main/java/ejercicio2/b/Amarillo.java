package b;

public class Amarillo extends EstadoSemaforo{

	Amarillo() {
		
	}
	
	void abrir(Semaforo s) {
		s.estadoSemaforo = new Verde();
	}
	
	void cerrar(Semaforo s) {
		s.estadoSemaforo = new Rojo();
	}
	
	public String estado() {
		return "Amarillo";
	}
	
}
