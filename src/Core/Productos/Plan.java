package Core.Productos;

import Core.Abstractas.Producto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Plan extends Producto{
    private  float valorMaximoCurso; 
    private ArrayList<PlanCliente> planes; 

    public Plan(float valorMaximoCurso, int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.valorMaximoCurso = valorMaximoCurso;
        this.planes = new ArrayList<>();
    }
    public boolean setEstadoActivo(boolean bool){
        return bool;
    }
    public LocalDate getFechaFin(){
    return fechaFin;
    }
    public LocalDate getFechaInicio(){
    return fechaInicio;
    }

    public float getValorMaximoCurso() {
        return valorMaximoCurso;
    }

    public ArrayList<PlanCliente> getPlanes() {
        return planes;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public float getValor() {
        return valor;
    }
    
}
