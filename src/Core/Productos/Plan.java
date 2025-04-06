package Core.Productos;

import Core.Abstractas.Producto;
import java.util.ArrayList;
import java.util.Date;

public class Plan extends Producto{
    private  float valorMaximoCurso; 
    private ArrayList<Plan> planes; 

    public Plan(float valorMaximoCurso, ArrayList<Plan> planes, int id, String nombre, Date fechaInicio, Date fechaFin, boolean estadoActivo, float valor) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.valorMaximoCurso = valorMaximoCurso;
        this.planes = new ArrayList<>();
    }
    public boolean setEstadoActivo(boolean bool){
        return bool;
    }
}
