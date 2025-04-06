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
    }

    public boolean isEstadoCliente() {
        return estadoCliente;
    }

    public int getNivelAvance() {
        return nivelAvance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Curso getCurso() {
        return curso;
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

    public void setEstadoCliente(boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public void setNivelAvance(int nivelAvance) {
        this.nivelAvance = nivelAvance;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
    
    
    
}
