/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Personas;

import Core.Productos.Curso;
import Core.Productos.ProductoCliente;
import java.util.ArrayList;

/**
 *
 * @author yader
 */
public class Instructor {
    private ArrayList<Curso> cursos; 

    public Instructor(ArrayList<Instructor> instructores, ArrayList<ProductoCliente> productosCliente) {
        this.cursos = new ArrayList<>(); 
    }
    
}
