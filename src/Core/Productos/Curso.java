package Core.Productos;

import Core.Abstractas.Producto;
import Core.Personas.Instructor;
import Core.Productos.ProductoCliente;
import java.time.LocalDate;
import java.util.ArrayList;

public class Curso extends Producto {
    private ArrayList<Instructor> instructores; 
    private ArrayList<ProductoCliente> productosCliente;

    public Curso( int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, double valor, Instructor instructor) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.instructores = new ArrayList<>();
        this.productosCliente = new ArrayList<>();
        
        instructores.add(instructor);
        instructores.get(0).getCursos().add(this);
    }
    
    public void addProductoCliente(ProductoCliente producto){
        if(!this.productosCliente.contains(producto)){
            this.productosCliente.add(producto);
        }
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
}
