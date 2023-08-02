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
public class CarteraValores extends Valor{
    private List<Valor> valoresAsociados;
    private double precioCotizacion;
    private List<Valor> valores;

    public CarteraValores() {
        valores = new ArrayList<>();
    }

    public CarteraValores(String nombre, String descripcion, String fechaApertura) {
        super(nombre, descripcion, fechaApertura);
    }

    public List<Valor> getValoresAsociados() {
        return valoresAsociados;
    }

    public void setValoresAsociados(List<Valor> valoresAsociados) {
        this.valoresAsociados = valoresAsociados;
    }

    public double getPrecioCotizacion() {
        return precioCotizacion;
    }

    public void setPrecioCotizacion(double precioCotizacion) {
        this.precioCotizacion = precioCotizacion;
    }
    

    public void addValor(Valor valor) {
        valores.add(valor);
    }

    public List<Valor> getValores() {
        return valores;
    }

    public void removeValor(Valor valor) {
        valores.remove(valor);
    }
}
