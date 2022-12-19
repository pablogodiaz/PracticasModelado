package ejercicio2.b;

class Rojo extends EstadoSemaforo {
	protected void abrir(Semaforo s) {
		s.setEstadoSemaforo(new Amarillo());
	}
	
	protected void cerrar(Semaforo s) {
		throw new RuntimeException("Ya está cerrado el semáforo: " + s);
	}
	
	protected String estado() {
		return "cerrado";
	}
}
