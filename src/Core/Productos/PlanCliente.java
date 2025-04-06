package Core.Productos;

import Core.Abstractas.Producto;
import Core.Personas.Cliente;
import java.time.LocalDate;
import java.util.Date;

public class PlanCliente extends Producto{
    private Cliente cliente; 
    private Plan plan; 

    public PlanCliente(Cliente cliente, Plan plan, int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.cliente = cliente;
        this.plan = plan;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Plan getPlan() {
        return plan;
    }

    public int getId() {
        return id;
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

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public float getValor() {
        return valor;
    }
    public void setEstadoActivo(boolean bool){
        plan.setEstadoActivo(bool);
    }
}
