package Ejercicio1;

import java.sql.Date;
class Acceso {

    private Date fecha;
    private TipoAcceso tipo;
    private Expediente expediente;
    private Profesional accesor;

    protected Acceso(Date fecha, TipoAcceso tipo, Expediente expediente, Profesional accesor){
        this.fecha = fecha;
        this.tipo = tipo;
        this.expediente = expediente;
        this.accesor = accesor;

        //Para mantener la consistencia hay que añadir el acceso que se crea a la lista de accesos del expediente y del profesional
        expediente.addAcceso(this);
        accesor.addAcceso(this);   
    }

    protected Date getFecha(){
        return fecha;
    }

    protected TipoAcceso getTipo(){
        return tipo;
    }

    protected Expediente getExpediente(){
        return expediente;
    }

    protected Profesional getAccesor(){
        return accesor;
    }

    protected void setFecha(Date fecha){
        assert !fecha.equals(null);
        this.fecha = fecha;
    }

    protected void setTipo(TipoAcceso tipo){
        assert !tipo.equals(null);
        this.tipo = tipo;
    }

    protected void setExpediente(Expediente expediente){
        assert !expediente.equals(null);
        this.expediente = expediente;
    }

    protected void setAccesor(Profesional accesor){
        assert !accesor.equals(null);
        this.accesor = accesor;
    }
}
