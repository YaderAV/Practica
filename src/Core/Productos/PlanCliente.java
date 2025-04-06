package Core.Productos;

import Core.Abstractas.Producto;
import Core.Personas.Cliente;
import java.util.Date;

public class PlanCliente extends Producto{
    private Cliente cliente; 
    private Plan plan; 

    public PlanCliente(Cliente cliente, Plan plan, int id, String nombre, Date fechaInicio, Date fechaFin, boolean estadoActivo, float valor) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.cliente = cliente;
        this.plan = plan;
    }
    
}
