package Ejercicio2Ruben;
public class MedioPensionista extends Trabajador{

    private Activo activo;
    private Pensionista pensionista;
        
    public MedioPensionista(Activo activo, Pensionista pensionista) {
        this.setNombre(activo.getNombre()); //sirve cualquiera
        this.activo=activo;
        this.setNumeroSeguridadSocial(activo.getNumeroSeguridadSocial());
        this.pensionista=pensionista;
        this.setSalario(activo.nomina()+pensionista.nomina());
    }
    
    public void incrementar() {
        activo.incrementar();
        pensionista.incrementar();
        this.setSalario(activo.nomina()+pensionista.nomina());
    }
}
