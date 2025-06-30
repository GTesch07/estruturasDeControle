package com.guilherme.tesch.exercicios;

import java.util.Scanner;

public class IndiceDeMassaCorporal {
    public static void main(String[]args){
        var scanner = new Scanner(System.in);
        var altura = 0.00;
        var peso = 0.00;

        System.out.println("==================");
        System.out.println("Calculadora de IMC");
        System.out.println("==================");

        System.out.println("Informe seu peso: (EX: 56,70)");
        peso = scanner.nextDouble();
        System.out.println("Informe sua Altura: (EX: 1,69)");
        altura = scanner.nextDouble();

        var imc = peso/(altura * altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso!");
        }else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        }else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        }else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        }else if (imc >= 35.0 && imc <= 39.90) {
            System.out.println("Obesidade Grau II (Severa)");
        }else{
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        scanner.close();
    }
}
