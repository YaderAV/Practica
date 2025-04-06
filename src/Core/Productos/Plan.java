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
    public float getValorMaximoCurso(){
    return this.valorMaximoCurso;
    }
    public boolean addPlanCliente(PlanCliente plan) {
        if (!this.planes.contains(plan)) {
            this.planes.add(plan);
            return true;
        }
        return false;
    }
}
