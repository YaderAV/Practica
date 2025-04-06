/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import Core.Personas.Cliente;
import Core.Personas.Instructor;
import Core.Productos.Curso;
import Core.Productos.Plan;
import Core.Productos.PlanCliente;
import Core.Productos.ProductoCliente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author yader
 */
public class Clatzy {

    private ArrayList<Cliente> clientes;
    private ArrayList<Instructor> instructores;
    private ArrayList<Curso> cursos;
    private ArrayList<Plan> planes;

    public Clatzy() {
        this.instructores= new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.planes = new ArrayList<>();
    }

    public boolean addInstructor(String nombre, String cedula, String numero, String correo) {
        Instructor instructor = new Instructor(nombre, cedula, numero, correo);
        this.instructores.add(instructor);
        return true;
    }

    public boolean addCurso(int id, String nombre, LocalDate date, float valor, Instructor instructor) {
        Curso curso = new Curso(id, nombre, date, date.plusYears(1), true, valor, instructor);
        this.cursos.add(curso);
        return true;
    }

    public boolean addCliente(String nombre, String cedula, String numero, String email) {
        Cliente cliente = new Cliente(nombre, cedula, numero, email);
        this.clientes.add(cliente);
        return true;
    }
    int id = 0;

    public boolean addPlan(String nombre, LocalDate date, float valor, float valorMaximo) {
        Plan plan = new Plan(valorMaximo, id++, nombre, date, date, true, valor);
        this.planes.add(plan);
        return true;
    }

    public Instructor getInstructor(int index) {
        Instructor instructor = instructores.get(index);
        return instructor;
    }

    public Cliente getCliente(int index) {
        Cliente cliente = clientes.get(index);
        return cliente;
    }

    public Curso getCurso(int index) {
        Curso curso = cursos.get(index);
        return curso;
    }
     public Plan getPlan(int index) {
        return this.planes.get(index);
    }
     public boolean comprarPlan(Cliente cliente, Plan plan, LocalDate fecha) {
        if (cliente.hasPlanActivo()) {
            System.out.println("El cliente " + cliente.getNombre() + " ya tiene un plan activo");
            return false;
        }
        PlanCliente planCliente = new PlanCliente(0, "", fecha, fecha.plusYears(1), true, plan.getValor(), cliente, plan);
        System.out.println("El cliente " + planCliente.getCliente().getNombre() + " compro exitosamente un plan " + planCliente.getPlan().getNombre());
        return true;
    }
     public boolean comprarCurso(Cliente cliente, Curso curso, LocalDate fecha) {
        ArrayList<Object> data = cliente.hasCursoCompradoRegistrado(curso);
        boolean hasCurso = (boolean) data.get(0);
        String obtencion = (String) data.get(1);
        if (hasCurso) {
            System.out.println("El cliente " + cliente.getNombre() + " ya habia " + obtencion + " el curso " + curso.getNombre());
            return false;
        } else if (cliente.hasPlanActivo()) {
            PlanCliente planCliente = cliente.getPlanActivo();
            if (curso.getValor() <= planCliente.getPlan().getValorMaximoCurso()) {
                ProductoCliente productoCliente = new ProductoCliente(0, "", fecha, null, true, 0, false, 0, cliente, curso);
                System.out.println("El cliente " + productoCliente.getCliente().getNombre() + " registro exitosamente el curso " + productoCliente.getCurso().getNombre());
                return true;
            } else {
                System.out.println("El plan del cliente " + cliente.getNombre() + " no cubre el curso " + curso.getNombre());
                return false;
            }
        }
        return false;
    }
    
    public boolean comprarCurso(Cliente cliente, Curso curso, LocalDate fecha, double valor) {
        ArrayList<Object> data = cliente.hasCursoCompradoRegistrado(curso);
        boolean hasCurso = (boolean) data.get(0);
        String obtencion = (String) data.get(1);
        if (hasCurso) {
            System.out.println("El cliente " + cliente.getNombre() + " ya habia " + obtencion + " el curso " + curso.getNombre());
            return false;
        } else if (cliente.hasPlanActivo()) {
            PlanCliente planCliente = cliente.getPlanActivo();
            if (curso.getValor() <= planCliente.getPlan().getValorMaximoCurso()) {
                ProductoCliente productoCliente = new ProductoCliente(0, "", fecha, null, true, 0, false, 0, cliente, curso);
                System.out.println("El curso esta incluido en el plan del cliente " + productoCliente.getCliente().getNombre() + ", por lo tanto no debe pagar. Se procede a registrar el curso " + productoCliente.getCurso().getNombre() + " con costo $0");
                return true;
            }
        }
        if (valor == curso.getValor()) {
            ProductoCliente productoCliente = new ProductoCliente(0, "", fecha, null, true, valor, false, 0, cliente, curso);
            System.out.println("El cliente " + productoCliente.getCliente().getNombre() + " compro exitosamente el curso " + productoCliente.getCurso().getNombre());
            return true;
        } else {
            System.out.println("El cliente " + cliente.getNombre() + " no pago el valor correcto por el curso " + curso.getNombre());
            return false;
        }
    }
     public String getClienteMayorIngreso() {
        ArrayList<Double> ingresos = new ArrayList<>();
        for (Cliente cliente : this.clientes) {
            ingresos.add(cliente.getIngreso());
        }
        int index = ingresos.indexOf(Collections.max(ingresos));
        return this.clientes.get(index).getNombre();
    }
    
    public void listAll() {
        System.out.println("Lista de clientes con sus compras:");
        for (Cliente cliente : this.clientes) {
            System.out.println("----------------------------------------");
            System.out.println(cliente.getNombre());
            System.out.println("Planes:");
            for (PlanCliente plan : cliente.getPlanes()) {
                System.out.println(plan.getPlan().getNombre() + " " + plan.getFechaInicio() + " " + String.format("%.1f", plan.getValor()).replace(",", ".") + " " + (plan.getEstadoActivo() ? "True" : "False"));
            }
            System.out.println("\nCursos:");
            for (ProductoCliente producto : cliente.getProductos()) {
                System.out.println(producto.getCurso().getNombre() + " " + producto.getFechaInicio() + " " + String.format("%.1f", producto.getValor()).replace(",", ".") + " " + (producto.getEstadoActivo() ? "True" : "False"));
            }
        }
    }
    
}
