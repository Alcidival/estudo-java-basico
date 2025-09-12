package edu.diome.terminalargumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMeTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
/*
        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");*/

        double A, B, media;

        A = sc.nextDouble();
        B = sc.nextDouble();

        //TODOS: Complete os espaços em branco com uma possível solução para o desafio
        media = (A * 3.5 + B * 7.5)/11;

        System.out.printf("MEDIA = %.5f",media);
        System.out.println();
    }

}
