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
public class CuentaCorriente extends CuentaBancaria{
    private List<TarjetaCredito> tarjetasCredito;

    public CuentaCorriente() {
        tarjetasCredito = new ArrayList<>();
    }

    public void addTarjetaCredito(TarjetaCredito tarjeta) {
        tarjetasCredito.add(tarjeta);
    }

    public List<TarjetaCredito> getTarjetasCredito() {
        return tarjetasCredito;
    }

    public void removeTarjetaCredito(TarjetaCredito tarjeta) {
        tarjetasCredito.remove(tarjeta);
    }

    public void setTarjetasCredito(List<TarjetaCredito> tarjetasCredito) {
        this.tarjetasCredito = tarjetasCredito;
    }

    public CuentaCorriente(int numeroCuenta, String fechaApertura, double saldo, double tipoInteres) {
        super(numeroCuenta, fechaApertura, saldo, tipoInteres);
    }
    /*   public void setImporte(double importe) {
        this.importe = importe;
    }*/


}
