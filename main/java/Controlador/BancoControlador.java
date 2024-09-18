/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Banco;
import Modelo.Cuenta;
import Modelo.CuentaCorriente;
import Vista.BancoVista;

public class BancoControlador {
    private Banco banco;
    private BancoVista vista;

    public BancoControlador(Banco banco, BancoVista vista) {
        this.banco = banco;
        this.vista = vista;
    }

    public void agregarCuentaCorriente() {
        String numeroCuenta = vista.obtenerNumeroCuenta();
        double saldoInicial = vista.obtenerSaldoInicial();
        double limiteCredito = vista.obtenerLimiteCredito();
        
        CuentaCorriente cuenta = new CuentaCorriente(numeroCuenta, saldoInicial, limiteCredito);
        banco.agregarCuenta(cuenta);
        vista.mostrarMensaje("Cuenta corriente agregada con éxito.");
    }

    public void mostrarCuentas() {
        for (Cuenta cuenta : banco.getCuentas()) {
            vista.mostrarMensaje(cuenta.toString());
        }
    }
}
