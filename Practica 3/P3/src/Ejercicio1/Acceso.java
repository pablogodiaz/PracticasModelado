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
        this.fecha = fecha;
    }

    protected void setTipo(TipoAcceso tipo){
        this.tipo = tipo;
    }

    protected void setExpediente(Expediente expediente){
        this.expediente = expediente;
    }

    protected void setAccesor(Profesional accesor){
        this.accesor = accesor;
    }
}
