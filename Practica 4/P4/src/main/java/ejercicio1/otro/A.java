package ejercicio1.otro;

import ejercicio1.x.Proxy;

public class A {

    private Proxy p;

    public void rutina2(Double d) throws Exception {
        p.rutina2(this, d);
    }
}
