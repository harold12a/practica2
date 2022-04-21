package com.company;

public class Operacion {

    // atributos

    int suma;
    int resta;
    int mult;
    int div;

    // metodos


    public int sumar(int numero1, int numero2){
        suma = numero1+numero2;
        return  suma;

    }
    public int restar(int numero1, int numero2){
        resta = numero1-numero2;
        return resta;

    }

    public int multiplicar(int numero1, int numero2){
        mult = numero1*numero2;
        return mult;

    }
    public int dividir(int numero1, int numero2){
        div = numero1/numero2;
        return  div;

    }

    public void mostrarDatos() {
        System.out.println("la suma es: "+ suma);
        System.out.println("la resta es: "+ resta);
        System.out.println("la multiplicacion es: "+ mult);
        System.out.println("la div es :"+ div);
    }
}
