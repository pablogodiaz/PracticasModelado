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

        if(expediente.getListaAccesos().contains(this) || accesor.getListaAccesos().contains(this)){
            throw new RuntimeException("El profesional no puede acceder más de una vez al mismo expediente");
        }
            
        

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

    @Override
    public boolean equals(Object o){
        return o instanceof Acceso && (((Acceso) o).getExpediente().equals(this.expediente) && ((Acceso) o).getAccesor().equals(this.accesor));
    }

    @Override
    public int hashCode(){
        return expediente.hashCode() + accesor.hashCode();
    }

}
