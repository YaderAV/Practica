/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core.Personas;

import Core.Abstractas.Persona;
import Core.Abstractas.Producto;
import Core.Productos.Plan;
import Core.Productos.PlanCliente;
import Core.Productos.ProductoCliente;
import java.util.ArrayList;

/**
 *
 * @author yader
 */
public class Cliente extends Persona{
    private ArrayList<PlanCliente> planes; 
    private ArrayList<ProductoCliente> productos;

    public Cliente( String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono, email);
        this.planes = new ArrayList<>();
        this.productos = new ArrayList<>();
        
    }
    public void addPlan(PlanCliente plan){
        if(!this.planes.contains(plan)){
            this.planes.add(plan);
        }
      
    }
    
    public void addProducto(ProductoCliente planCliente){
        if(!this.productos.contains(planCliente)){
            this.productos.add(planCliente);
        }
    }
    public PlanCliente getPlan(int i) {
        PlanCliente plan = planes.get(i);
        return plan; 
    }
    public ProductoCliente getProductoCliente(int i){
        ProductoCliente plan = (ProductoCliente) productos.get(i);
        return plan;
    }
    public boolean getEstadoPlan(){
        for(ProductoCliente curso: this.productos){
            if(curso.isEstadoActivo()){
                return true;
            }
        }
        return false;
    }
    public ArrayList<PlanCliente> getPlanes(){
    return this.planes; 
    }
    public ArrayList<ProductoCliente> getProductos(){
    return productos;
    }

    public String getNombre() {
        return nombre;
    }
    
}
