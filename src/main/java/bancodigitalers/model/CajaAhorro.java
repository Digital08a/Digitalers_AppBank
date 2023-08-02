/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancodigitalers.model;

/**
 *
 * @author alexx
 */
public class CajaAhorro extends CuentaBancaria{
    private String duracionMeses;

    public String getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(String duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public CajaAhorro() {
    }

    public CajaAhorro(String duracionMeses) {
        this.duracionMeses = duracionMeses;
    }




}
