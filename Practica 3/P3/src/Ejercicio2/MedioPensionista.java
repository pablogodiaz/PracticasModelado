
package Ejercicio2;

class MedioPensionista extends Trabajador{
    // Para simular el concepto de herencia multiple, tras razonamiento sobre una conversación
    // tenida con el profesor, optamos por declarar dos atributos privados internos en
    // la clase, exigiendo la existencia de ambos al crear una instancia de la misma.
    private Activo activo;
    private Pensionista pensionista;

    MedioPensionista(String nombre, String numeroSeguridadSocial, double salarioActivo, double salarioPensionista) {
    	super(nombre,numeroSeguridadSocial,salarioActivo+salarioPensionista);
    	setActivo(new Activo(nombre, numeroSeguridadSocial, salarioActivo));
        setPensionista(new Pensionista(nombre, numeroSeguridadSocial, salarioPensionista));
    }
    MedioPensionista(Activo activo, Pensionista pensionista) {
    	super(activo.getNombre(),activo.getNumeroSeguridadSocial(),activo.nomina()+pensionista.nomina());
    	setActivo(activo);
        setPensionista(pensionista);
    }
    MedioPensionista(Activo activo, double salarioPensionista) {
        super(activo.getNombre(),activo.getNumeroSeguridadSocial(),activo.nomina()+salarioPensionista);
    	setActivo(activo);
        setPensionista(new Pensionista(activo.getNombre(), activo.getNumeroSeguridadSocial(), salarioPensionista));
    }
    MedioPensionista(Pensionista pensionista, double salarioActivo) {
        super(pensionista.getNombre(),pensionista.getNumeroSeguridadSocial(),pensionista.nomina()+salarioActivo);
    	setActivo(new Activo(pensionista.getNombre(), pensionista.getNumeroSeguridadSocial(), salarioActivo));
        setPensionista(pensionista);
    }

    // En el método incrementar solo es necesario delegar la acción a cada variable.
    public void incrementar() {
        getActivo().incrementar();
        getPensionista().incrementar();
        setSalario(activo.nomina()+pensionista.nomina());
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