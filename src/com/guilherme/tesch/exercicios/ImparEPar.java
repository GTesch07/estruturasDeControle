package com.guilherme.tesch.exercicios;

import java.util.Scanner;

public class ImparEPar {
    public static void main(String[]args){
        var scanner = new Scanner(System.in);
        System.out.println("Informe um primeiro número inteiro: ");
        var num1 = scanner.nextInt();
        System.out.println("Informe um segundo número inteiro: (Maior que o primeiro) ");
        var num2 = scanner.nextInt();

        while (num2 <= num1) {
            System.out.println("O segundo número deve ser maior que o primeiro. Tente novamente!");
            num2 = scanner.nextInt();
        }

        scanner.nextLine();

        System.out.println("Deseja que imprimir os números Ímpares ou Pares? (Impar/Par)");
        var opcao = scanner.nextLine();
        System.out.println("=== Resultados em ordem decrescente ===");


        if (opcao.equalsIgnoreCase("Impar")) {
            for(int i = num2; i >= num1; i--){
                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }else if (opcao.equalsIgnoreCase("Par")) {
            for(int i = num2; i >= num1; i--){
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Opção inválida. Informe 'Impar' ou 'Par'. ");
        }
        System.out.println("Fim do programa.");
        scanner.close();
    }
}
