/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bancodigitalers;

import bancodigitalers.model.Banco;
import bancodigitalers.model.CajaAhorro;
import bancodigitalers.model.Cliente;
import bancodigitalers.model.CuentaBancaria;
import bancodigitalers.model.CuentaCorriente;
import bancodigitalers.model.Empleado;
import bancodigitalers.model.TarjetaCredito;
import java.util.List;

/**
 *
 * @author alexx
 */
public class BancoDigitalers {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("01", "Bart Simpsons", "Avenida Falsa 123", "123456");
        Empleado empleado2 = new Empleado("02", "Rick Sánchez", "Avenida siempreviva 742", "654321");

        Cliente cliente1 = new Cliente("25252666", "Juan Perez", "Calle 123", "123456789");
        Cliente cliente2 = new Cliente("77755987", "Maria Gomez", "Avenida 456", "987654321");

        CuentaCorriente cuentaCorriente1 = new CuentaCorriente();
        cuentaCorriente1.setNumeroCuenta(001);
        cuentaCorriente1.setSaldo(1000);


        CajaAhorro cajaAhorro1 = new CajaAhorro();
        cajaAhorro1.setNumeroCuenta(15);
        cajaAhorro1.setSaldo(5000);
        cajaAhorro1.setDuracionMeses("12");

        TarjetaCredito tarjeta1 = new TarjetaCredito();
        tarjeta1.setTipo("Visa");
        tarjeta1.setNumero("123456789");
        tarjeta1.setTitular("Juan Perez");

        cuentaCorriente1.addTarjetaCredito(tarjeta1);

        Banco banco = new Banco("Mi Banco");

        banco.addEmpleado(empleado1);
        banco.addEmpleado(empleado2);
        banco.addCuentaBancaria(cuentaCorriente1);
        banco.addCuentaBancaria(cajaAhorro1);

        List<Empleado> empleados= banco.getEmpleados();
        System.out.println("Empleados del banco:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        List<CuentaBancaria> cuentasCliente1 = banco.getCuentasBancarias();
        System.out.println("Cuentas del cliente 1:");
        for (CuentaBancaria cuenta : cuentasCliente1) {
            System.out.println(cuenta);
        }
    }
}
