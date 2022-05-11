package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/*Faça um Programa que peça dois números e imprima o maior deles.*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Segundo numero: ");
        int numero2 = scanner.nextInt();
        boolean oPrimeiroNumeroEmaior = numero1 > numero2;
        if (oPrimeiroNumeroEmaior) {
            System.out.println("O numéro maior é:" + numero1);
        } else {
            System.out.println("O número maior é:" + numero2);
        }
        scanner.close();

    }
}