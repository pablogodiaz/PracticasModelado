package ejercicio2.b;

class Amarillo extends EstadoSemaforo {
	protected void abrir(Semaforo s) {
		s.setEstadoSemaforo(new Verde());
	}
	
	protected void cerrar(Semaforo s) {
		s.setEstadoSemaforo(new Rojo());
	}
	
	protected String estado() {
		return "precaución";
	}
}
