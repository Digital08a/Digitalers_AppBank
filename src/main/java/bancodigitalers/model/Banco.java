/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodigitalers.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexx
 */
public class Banco {

    private String nombre;
    private String direccion;
    private String telefono;
    private List<Empleado> empleado;
    private List<CuentaBancaria> cuentasBancarias;

    public Banco(String nombre) {
        this.nombre = nombre;
        cuentasBancarias = new ArrayList<>();
        empleado = new ArrayList<>();
    }

    public void addEmpleado(Empleado empleado) {
        empleado.add(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleado;
    }

    public void removeEmpleado(Empleado empleado) {
        empleado.remove(empleado);
    }

    public void addCuentaBancaria(CuentaBancaria cuenta) {
        cuentasBancarias.add(cuenta);
    }

    public List<CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void removeCuentaBancaria(CuentaBancaria cuenta) {
        cuentasBancarias.remove(cuenta);
    }

    public Banco(String nombre, String direccion, String telefono, List<Empleado> empleado, List<CuentaBancaria> cuentasBancarias, List<Empleado> empleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.empleado = empleado;
        this.cuentasBancarias = cuentasBancarias;
        this.empleado = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(List<Empleado> empleado) {
        this.empleado = empleado;
    }
/*
    public List<CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }*/

    public Banco(String nombre, String direccion, String telefono, List<Empleado> empleado, List<CuentaBancaria> cuentasBancarias) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.empleado = empleado;
        this.cuentasBancarias = cuentasBancarias;
    }

    public Banco() {
    }

    public void setCuentasBancarias(List<CuentaBancaria> cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

}
