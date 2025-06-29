package com.guilherme.tesch.exemplos;

import java.util.Scanner;

public class MainWhile {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        var i = 0;
        while (args.length > i) {
            System.out.println(args[i]);
            i++;
        }

        i = 0;
        do{
            System.out.println(args[i]);
            i ++;
                //Código é rodado pelo menos uma vez antes de entrar na estrutura While
        }while(args.length > i);
       
    }
}
