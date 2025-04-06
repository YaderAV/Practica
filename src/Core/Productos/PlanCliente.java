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
        this.cliente.addPlan(this);
        this.plan.addPlanCliente(this);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Plan getPlan() {
        return plan;
    }
}
