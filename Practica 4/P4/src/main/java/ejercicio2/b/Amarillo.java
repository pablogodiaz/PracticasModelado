package ejercicio2.b;

public class Amarillo extends EstadoSemaforo{

	Amarillo() {
		
	}
	
	protected void abrir(Semaforo s) {
		s.setEstadoSemaforo(new Verde());
	}
	
	protected void cerrar(Semaforo s) {
		s.setEstadoSemaforo(new Rojo());
	}
	
	public String estado() {
		return "Amarillo";
	}
	
}
