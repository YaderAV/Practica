package Core.Productos;

import Core.Abstractas.Producto;
import Core.Personas.Instructor;
import java.util.ArrayList;
import java.util.Date;

public class Curso extends Producto {
    private ArrayList<Instructor> instructores; 
    private ArrayList<ProductoCliente> productosCliente;

    public Curso(ArrayList<Instructor> instructores, ArrayList<ProductoCliente> productosCliente, int id, String nombre, Date fechaInicio, Date fechaFin, boolean estadoActivo, float valor) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.instructores = new ArrayList<>();
        this.productosCliente = new ArrayList<>();
    }
    
    
}
