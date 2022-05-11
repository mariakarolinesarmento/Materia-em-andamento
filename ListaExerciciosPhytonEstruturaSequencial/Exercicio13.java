package com.company.logica.ListaExerciciosPhytonEstruturaSequencial;

/*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite altura: ");
        double h = scanner.nextDouble();
        double calculoHomem = (72.7*h) - 58;
        double calculoMulher = (62.1*h) - 44.7;
        System.out.println("O peso ideal de um homem seria: "+calculoHomem);
        System.out.println("O peso ideal de uma mulher seria: "+calculoMulher);
        scanner.close();
    }
}