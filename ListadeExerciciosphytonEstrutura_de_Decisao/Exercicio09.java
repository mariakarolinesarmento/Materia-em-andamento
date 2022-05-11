package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/*Faça um Programa que leia três números e mostre-os em ordem decrescente.*/

import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva um número: ");
        float numero1 = scanner.nextFloat();
        System.out.print("Escreva um número: ");
        float numero2 = scanner.nextFloat();
        System.out.print("Escreva um número: ");
        float numero3 = scanner.nextFloat();
        if (numero1<numero2 && numero1<numero3){
            System.out.println("A ordem decrescente é: "+numero3);
        } else if (numero1<numero2 && numero3<numero2){
            System.out.println("A ordem descrente é: "+numero2);
        } else if (numero3<numero2 && numero3<numero1){
            System.out.println("A ordem descrente é: "+numero1);
        }
        scanner.close();
    }
}