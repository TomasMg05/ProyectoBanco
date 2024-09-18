/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

public class BancoVista {
    private Scanner scanner = new Scanner(System.in);

    public String obtenerNumeroCuenta() {
        System.out.println("Ingrese el número de cuenta:");
        return scanner.nextLine();
    }

    public double obtenerSaldoInicial() {
        System.out.println("Ingrese el saldo inicial:");
        return scanner.nextDouble();
    }

    public double obtenerLimiteCredito() {
        System.out.println("Ingrese el límite de crédito:");
        return scanner.nextDouble();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

