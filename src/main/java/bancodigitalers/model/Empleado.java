/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodigitalers.model;

/**
 *
 * @author alexx
 */
public class Empleado extends Persona {
    private String cargo;
    private Double sueldo;

    public Empleado(String dni, String nombre, String direccion, String telefono) {
        super(dni, nombre, direccion, telefono);
    }
    @Override
    public String toString() {
        return "Empleado [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + "]";
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }


    
    
}
