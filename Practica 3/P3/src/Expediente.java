import java.util.List;

class Expediente {
    
    private Paciente paciente;
    private List<Acceso> listaAccesos;

    protected Expediente(Paciente paciente, List<Acceso> listaAccesos){
        //Expediente tiene que tener si o si un paciente
        assert !paciente.equals(null);

        //Expediente tiene una lista de accesos que puede ser vacia
        assert !listaAccesos.equals(null);

        this.paciente = paciente;
        this.listaAccesos = listaAccesos;
    }

    protected Expediente(Paciente paciente){
        //Expediente tiene que tener si o si un paciente
        assert !paciente.equals(null);
        this.paciente = paciente;
        this.listaAccesos = listaAccesos;
    }

    protected void addAcceso(Acceso a){
        assert !a.equals(null);
        listaAccesos.add(a);
    }
}
