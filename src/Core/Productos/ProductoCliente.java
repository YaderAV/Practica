package Core.Productos;

import Core.Abstractas.Producto;
import Core.Personas.Cliente;
import java.time.LocalDate;

public class ProductoCliente extends Producto {
    private boolean estadoAprobado;
    private int nivelAvance;
    private Cliente cliente;
    private Curso curso; 

    public ProductoCliente(int id, String nombre, LocalDate fechaInicio, LocalDate fechaFin, boolean estadoActivo, double valor, boolean estadoAprobado, int nivelAvance, Cliente cliente, Curso curso) {
        super(id, nombre, fechaInicio, fechaFin, estadoActivo, valor);
        this.estadoAprobado = estadoAprobado;
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
