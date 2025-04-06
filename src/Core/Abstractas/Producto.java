package Core.Abstractas;

import java.time.LocalDate;
import java.util.Date;

public abstract class Producto {
    protected int id; 
    protected String nombre; 
    protected LocalDate fechaInicio; 
    protected LocalDate fechaFin;
    protected boolean estadoActivo;
    protected double valor;

    public Producto(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, double valor) {
        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estadoActivo = estadoActivo;
        this.valor = valor;
    }

   
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public boolean getEstadoActivo() {
        return estadoActivo;
    }

    public double getValor() {
        return valor;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
    
}
