package Core.Productos;

import Core.Abstractas.Producto;
import Core.Personas.Cliente;
import java.time.LocalDate;

public class ProductoCliente extends Producto {
    private boolean estadoCliente;
    private int nivelAvance;
    private Cliente cliente;
    private Curso curso; 

    public ProductoCliente(boolean estadoCliente, int nivelAvance, Cliente cliente, Curso curso, int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, float valor) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.estadoCliente = estadoCliente;
        this.nivelAvance = nivelAvance;
        this.cliente = cliente;
        this.curso = curso;
        
        this.cliente.addProducto(this);
        this.curso.addProductoCliente(this);
    }

 
    public Cliente getCliente() {
        return cliente;
    }

    public Curso getCurso() {
        return curso;
    } 
}
