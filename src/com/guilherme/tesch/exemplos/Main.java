package com.guilherme.tesch.exemplos;

import java.util.Scanner;

import com.guilherme.tesch.modelos.Habilitacao;

public class Main {
    public static void main(String[]args){
        var scanner = new Scanner(System.in);
        Habilitacao habilitacao = new Habilitacao(null, 0);
        System.out.println("Informe seu nome: ");
        habilitacao.setName(scanner.nextLine());
        System.out.println("Informe sua idade: ");
        habilitacao.setAge(scanner.nextInt());
        boolean isEmancipated = false;
        var message = "";



        if(habilitacao.getAge() >= 16 && habilitacao.getAge() < 18){
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
        var canDrive = (habilitacao.getAge() >= 18) || (habilitacao.getAge() >= 16 && isEmancipated);

          if (canDrive) {
             message = String.format("""
               Bem vindo, %s!
               %s, você tem %s e pode dirigir.
               """,habilitacao.getName(),habilitacao.getName(),habilitacao.getAge());
        
            }else{
                message = String.format("""
                %s, você não pode dirigir.
                """,habilitacao.getName());
                }
        
   
         
            System.out.println(message);
            System.out.println("Fim da execução");

         scanner.close();
    }
}
