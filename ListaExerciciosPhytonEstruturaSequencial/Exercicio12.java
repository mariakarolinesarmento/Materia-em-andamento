package com.company.logica.ListaExerciciosPhytonEstruturaSequencial;
/*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58 */


import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua Altura: ");
        double altura = scanner.nextDouble();
        double calculoMultiplicacao = (72.7*altura);
        double calculoSubtracao = (calculoMultiplicacao - 58);
        System.out.println("Seu peso ideal seria: "+calculoSubtracao);
        scanner.close();

    }
}