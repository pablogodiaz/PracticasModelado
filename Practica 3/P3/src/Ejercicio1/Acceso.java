package Ejercicio1;

import java.sql.Date;
class Acceso {

    private Date fecha;
    private TipoAcceso tipo;
    private Expediente expediente;
    private Profesional accesor;

    Acceso(Date fecha, TipoAcceso tipo, Expediente expediente, Profesional accesor){
        this.fecha = fecha;
        this.tipo = tipo;
        this.expediente = expediente;
        this.accesor = accesor;

        //Para mantener la consistencia hay que añadir el acceso que se crea a la lista de accesos del expediente y del profesional
        expediente.addAcceso(this);
        accesor.addAcceso(this);   
    }

    Date getFecha(){
        return fecha;
    }

    TipoAcceso getTipo(){
        return tipo;
    }

    Expediente getExpediente(){
        return expediente;
    }

    Profesional getAccesor(){
        return accesor;
    }

    void setFecha(Date fecha){
        assert !fecha.equals(null);
        this.fecha = fecha;
    }

    void setTipo(TipoAcceso tipo){
        assert !tipo.equals(null);
        this.tipo = tipo;
    }

    void setExpediente(Expediente expediente){
        assert !expediente.equals(null);
        this.expediente = expediente;
    }

    void setAccesor(Profesional accesor){
        assert !accesor.equals(null);
        this.accesor = accesor;
    }
}
