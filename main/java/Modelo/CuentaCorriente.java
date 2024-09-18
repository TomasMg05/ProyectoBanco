/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class CuentaCorriente extends Cuenta {
    private double limiteCredito;

    public CuentaCorriente(String numeroCuenta, double saldo, double limiteCredito) {
        super(numeroCuenta, saldo);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo + limiteCredito >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}

