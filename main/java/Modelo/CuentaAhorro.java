/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class CuentaAhorro extends Cuenta {
    private double tasaInteres;

    public CuentaAhorro(String numeroCuenta, double saldo, double tasaInteres) {
        super(numeroCuenta, saldo);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
