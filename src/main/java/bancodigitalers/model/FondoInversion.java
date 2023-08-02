/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodigitalers.model;

/**
 *
 * @author alexx
 */
public class FondoInversion extends Valor{
    private double importe;
    private double rentabilidad;
    private String fechaVencimiento;

    public FondoInversion() {
    }

    public FondoInversion(String nombre, String descripcion, String fechaApertura) {
        super(nombre, descripcion, fechaApertura);
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getRentabilidad() {
        return rentabilidad;
    }

    public void setRentabilidad(double rentabilidad) {
        this.rentabilidad = rentabilidad;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
}
