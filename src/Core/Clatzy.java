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
import java.time.LocalDate;
import java.util.ArrayList;

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

    public void comprarPlan(Cliente cliente, Plan plan, LocalDate date) {
        for (PlanCliente plan1 : cliente.getPlanes()) {
            if (plan1.getEstadoActivo()) {
                System.out.println("El cliente " + cliente.getNombre() + " ya tiene un plan activo");
            } else {
                cliente.getPlanes().add(plan1);
                System.out.println("El cliente " + cliente.getNombre() + " compró exitosamente un " + plan.getNombre());
            }
        }

    }

    public void comprarCurso(Cliente cliente, Curso curso, LocalDate date) {
        if (cliente.getPlan(0).getValor() <= curso.getValor()) {
            if (cliente.getProductos().get(0).equals(curso)) {
                System.out.println("El cliente" + cliente.getNombre() + " ya había registrado exitosamente el curso " + curso.getNombre());
            } else {
                cliente.getProductoCliente(0).setCurso(curso);
                cliente.getProductoCliente(0).setNivelAvance(0);
                System.out.println("El cliente " + cliente.getNombre() + " registro exitosamente el curso " + curso.getNombre());
            }
        } else {
            System.out.println("El plan del cliente " + cliente.getNombre() + "no cubre el curso " + curso.getNombre());
        }
    }

    public void comprarCurso(Cliente cliente, Curso curso, LocalDate date, float valor) {
        if (cliente.getPlanes() != null && cliente.getPlan(0).getValor() <= curso.getValor()) {
            System.out.println("El curso está incluido en el plan de "+cliente.getNombre()+", por lo tantono debe pagar. Se procede a registrar el curso: "+ curso.getNombre()+" con costo $0");
            cliente.getProductoCliente(0).setValor(0);
        } else {
            if (valor == curso.getValor()) {
                if (cliente.getProductos().get(0).equals(curso)) {
                    System.out.println("El cliente" + cliente.getNombre() + " ya había registrado exitosamente el curso " + curso.getNombre());
                } else {
                    cliente.getProductoCliente(0).setCurso(curso);
                    cliente.getProductoCliente(0).setValor(valor);
                    System.out.println("El cliente " + cliente.getNombre() + " registro exitosamente el curso " + curso.getNombre());
                }
            } else if (valor < curso.getValor()) {
                System.out.println("El cliente " + cliente.getNombre() + "no pagó el valor correcto por el curso de " + curso.getNombre());
            } else {
                System.out.println("El cliente " + cliente.getNombre() + "no pagó el valor correcto por el curso de " + curso.getNombre());
            }
        }
    }

    public Cliente getClienteMayorIngreso() {
        
        
        return null;
    }

    public void listAll() {

    }

    public Plan getPlan(int i) {
        return null;
    }
}
