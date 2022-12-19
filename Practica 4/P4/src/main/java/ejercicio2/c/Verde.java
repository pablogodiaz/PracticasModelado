package ejercicio2.c;

class Verde extends EstadoSemaforo {
	protected void abrir(Semaforo s) {
		throw new RuntimeException("Ya está abierto el semáforo: " + s);
	}
	
	protected void cerrar(Semaforo s) {
		if(s.esTriestable()) {
			s.setEstadoSemaforo(new Amarillo());
		} else {
			s.setEstadoSemaforo(new Rojo());
		}
	}
	
	protected String estado() {
		return "cerrado";
	}
}
