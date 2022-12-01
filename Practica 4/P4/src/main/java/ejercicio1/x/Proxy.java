package ejercicio1.x;
import ejercicio1.otro.*;
public class Proxy {
    private X x;

    public void rutina1() {
        x.rutina1();
    }

    public void rutina2(Object obj, Double y) throws Exception {
        if ((obj instanceof A) || (obj instanceof B)) {
            x.rutina2(y);
        }
        else {
            throw new Exception("Acceso no permitido");
        }
    }

    public Boolean rutina3(Object obj, Integer i) throws Exception {
        if ((obj instanceof A) || (obj instanceof C)) {
            return x.rutina3(i);
        }
        else {
            throw new Exception("Acceso no permitido");
        }
    }

    //public Integer rutina4() solo visible para la clase X y derivadas, no disponible en el proxy

}
