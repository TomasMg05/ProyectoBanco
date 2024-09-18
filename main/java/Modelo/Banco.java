/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private ArrayList<Cuenta> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
}
