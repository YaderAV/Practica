/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import Core.Personas.Cliente;
import Core.Personas.Instructor;
import Core.Productos.Curso;
import Core.Productos.Plan;
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
    }
    public void addInstructor(String nombre, String cedula, String numero, String correo){
    
    }
    public void addCurso(int id, String nombre, LocalDate date, float valor, Instructor instructor){
    
    }
    public void addCliente(String nombre, String cedula, String numero, String email){
    
    }
    public void addPlan(String nombre, LocalDate date, float valor, float valorMaximo){
    
    }
    public Instructor getInstructor(int index){
        return null;
    }
    public Cliente getCliente(int index){
        return null;
    }
    public Curso getCurso(int index){
        return null; 
    }
    
    public void comprarCurso(Cliente cliente, Curso curso, LocalDate date){
    
    }
    public void comprarCurso(Cliente cliente, Curso curso, LocalDate date, float valor){
    
    }
    public void comprarPlan(Cliente cliente, Plan plan, LocalDate date){
    
    }
    public Cliente getClienteMayorIngreso(){
    return null;
    }
    public void listAll(){
    
    }

    public Plan getPlan(int i) {
       
    }
}
