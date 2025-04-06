package Core.Abstractas;

import java.util.Date;

public abstract class Producto {
    protected int id; 
    protected String nombre; 
    protected Date fechaInicio; 
    protected Date fechaFin;
    protected boolean estadoActivo;
    protected float valor;

    public Producto(int id, String nombre, Date fechaInicio, Date fechaFin, boolean estadoActivo, float valor) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoActivo = estadoActivo;
        this.valor = valor;
    }
    
}
