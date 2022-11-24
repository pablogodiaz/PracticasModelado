
package Ejercicio2;

class MedioPensionista extends Trabajador {
    // Para simular el concepto de herencia multiple, tras razonamiento sobre una conversación
    // tenida con el profesor, optamos por declarar dos atributos privados internos en
    // la clase, exigiendo la existencia de ambos al crear una instancia de la misma.
    private Activo activo;
    private Pensionista pensionista;

    MedioPensionista(String nombre, String numeroSeguridadSocial, double salarioActivo, double salarioPensionista) {
        setNombre(nombre);
        setNumeroSeguridadSocial(numeroSeguridadSocial);
        setSalario(salarioPensionista+salarioActivo);
    	setActivo(new Activo(nombre, numeroSeguridadSocial, salarioActivo));
        setPensionista(new Pensionista(nombre, numeroSeguridadSocial, salarioPensionista));
    }
    MedioPensionista(Activo activo, double salarioPensionista) {
        setNombre(activo.getNombre());
        setNumeroSeguridadSocial(activo.getNumeroSeguridadSocial());
    	setActivo(activo);
        setPensionista(new Pensionista(activo.getNombre(), activo.getNumeroSeguridadSocial(), salarioPensionista));
        setSalario(salarioPensionista+activo.nomina());
    }
    MedioPensionista(Pensionista pensionista, double salarioActivo) {
        setNombre(pensionista.getNombre());
        setNumeroSeguridadSocial(pensionista.getNumeroSeguridadSocial());
    	setActivo(new Activo(pensionista.getNombre(), pensionista.getNumeroSeguridadSocial(), salarioActivo));
        setPensionista(pensionista);
        setSalario(salarioActivo+pensionista.nomina());
    }

    // En el método incrementar solo es necesario delegar la acción a cada variable.
    public void incrementar() {
        getActivo().incrementar();
        getPensionista().incrementar();
        this.setSalario(activo.nomina()+pensionista.nomina());
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public void setPensionista(Pensionista pensionista) {
        this.pensionista = pensionista;
    }

    public Activo getActivo() {
        return activo;
    }

    public Pensionista getPensionista() {
        return pensionista;
    }
}