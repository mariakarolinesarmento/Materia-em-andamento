package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/*Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo*/

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();
        if (valor<0) {
            System.out.println("O valor é negativo!: "+valor);
        } else {
            System.out.println("O valor é positivo!:"+valor);
        }
        scanner.close();

    }
}