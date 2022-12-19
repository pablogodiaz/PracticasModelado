package ejercicio2.a;

class Verde extends EstadoSemaforo {
	protected void abrir(Semaforo s) {
		throw new RuntimeException("Ya está abierto el semáforo: " + s);
	}
	
	protected void cerrar(Semaforo s) {
		s.setEstadoSemaforo(new Rojo());
	}
	
	protected String estado() {
		return "abierto";
	}
}
