package com.guilherme.tesch.exemplos;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age =scanner.nextInt();
        boolean isEmancipated = false;
        var message = "";



        if(age >= 16 && age < 18){
            String resposta;
            while (true) {
                System.out.println("Você é emancipado? (S/N)");
            resposta = scanner.next();
            if (resposta.equalsIgnoreCase("S")) {
                isEmancipated = true;
                break;
            }else if (resposta.equalsIgnoreCase("N")) {
                isEmancipated = false;
                break;
            }else{
                System.out.println("Opção inválidada! Digite S ou N.");
                isEmancipated = false;
            }
        }
    }
        var canDrive = (age >= 18) || (age >= 16 && isEmancipated);

          if (canDrive) {
             message = String.format("""
               Bem vindo, %s!
               %s, você tem %s e pode dirigir.
               """,name,name,age);
        
            }else{
                message = String.format("""
                %s, você não pode dirigir.
                """,name);
                }
        
   
         
            System.out.println(message);
            System.out.println("Fim da execução");

         scanner.close();
    }
}
