package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // write your code here

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor1 "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor2 "));

        Operacion op = new Operacion();
        int suma = op.sumar(n1,n2);
        int resta = op.restar(n1,n2);
        int mult = op.multiplicar(n1,n2);
        int div = op.dividir(n1,n2);



        op.mostrarDatos();



    }
}
