package ejercicio2.c;

class Rojo extends EstadoSemaforo {
	protected void abrir(Semaforo s) {
		if(s.esTriestable()) {
			s.setEstadoSemaforo(new Amarillo());
		} else {
			s.setEstadoSemaforo(new Verde());
		}
	}
	
	public void cerrar(Semaforo s) {
		throw new RuntimeException("Ya está cerrado el semáforo: " + s);
	}
	
	public String estado() {
		return "cerrado";
	}
}
