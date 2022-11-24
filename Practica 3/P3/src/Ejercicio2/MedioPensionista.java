package Ejercicio2;

class MedioPensionista {
    // Para simular el concepto de herencia multiple, tras razonamiento sobre una conversación
    // tenida con el profesor, optamos por declarar dos atributos privados internos en
    // la clase, exigiendo la existencia de ambos al crear una instancia de la misma.
    private Activo activo;
    private Pensionista pensionista;

    MedioPensionista(String nombre, String numeroSeguridadSocial, double salarioActivo, double salarioPensionista) {
        setActivo(new Activo(nombre, numeroSeguridadSocial, salarioActivo));
        setPensionista(new Pensionista(nombre, numeroSeguridadSocial, salarioPensionista));
    }



    // En el método incrementar solo es necesario delegar la acción a cada variable.
    public void incrementar() {
        getActivo().incrementar();
        getPensionista().incrementar();
    }

    protected void setActivo(Activo activo) {
        this.activo = activo;
    }

    protected void setPensionista(Pensionista pensionista) {
        this.pensionista = pensionista;
    }

    public Activo getActivo() {
        return activo;
    }

    public Pensionista getPensionista() {
        return pensionista;
    }
}
