package ejercicio2.b;

class Verde extends EstadoSemaforo {
	protected void abrir(Semaforo s) {
		throw new RuntimeException("Ya está abierto el semáforo: " + s);
	}
	
	protected void cerrar(Semaforo s) {
		s.setEstadoSemaforo(new Amarillo());
	}
	
	protected String estado() {
		return "abierto";
	}
}
