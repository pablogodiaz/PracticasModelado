package Ejercicio1;

import java.sql.Date;
import java.util.List;
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
}
