/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Personas;

import Core.Abstractas.Persona;
import Core.Abstractas.Producto;
import Core.Productos.Plan;
import java.util.ArrayList;

/**
 *
 * @author yader
 */
public class Cliente extends Persona{
    private ArrayList<Plan> planes; 
    private ArrayList<Producto> productos;

    public Cliente(ArrayList<Plan> planes, ArrayList<Producto> productos, String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
        this.planes = new ArrayList<>();
        this.productos = new ArrayList<>();
    }
    
}
