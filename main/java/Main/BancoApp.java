/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Controlador.BancoControlador;
import Modelo.Banco;
import Vista.BancoVista;

public class BancoApp {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Centro");
        BancoVista vista = new BancoVista();
        BancoControlador controlador = new BancoControlador(banco, vista);

        controlador.agregarCuentaCorriente();
        controlador.mostrarCuentas();
    }
}

