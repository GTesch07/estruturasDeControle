package com.guilherme.tesch.exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        var number = 0;

        System.out.println("===================================");
        System.out.println("Bem vindo a calculadora de Tabuada!");
        System.out.println("===================================");

        System.out.printf("    Informe um número inteiro: ");
        number = scanner.nextInt();
        System.out.println("===================================");
        System.out.printf("A tabuada do número %s é: \n\n", number);

        for(int i = 0; i <= 10; i ++){
            int resultado = number * i;
            System.out.printf("%s X %s = %s\n", number, i, resultado);
        }


        scanner.close();
    }
}
