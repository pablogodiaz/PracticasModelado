package c;

public class Verde extends EstadoSemaforo{

	public Verde() {
		
	}
	
	public void abrir(Semaforo s) {
		throw new RuntimeException("Ya está abierto el semaforo: " + s);
	}
	
	public void cerrar(Semaforo s) {
		if(s.cambio) {
			s.estadoSemaforo = new Rojo();
		} else {
			s.estadoSemaforo = new Amarillo();
		}
	}
	
	public String estado() {
		return "Verde";
	}
	
}
