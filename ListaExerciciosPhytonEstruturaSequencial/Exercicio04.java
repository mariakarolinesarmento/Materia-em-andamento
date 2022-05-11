package com.company.logica.ListaExerciciosPhytonEstruturaSequencial;

/* 04) Faça um Programa que peça as 4 notas bimestrais e mostre a média.*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a 1º nota do Bimestre: ");
        Double nota1 = scanner.nextDouble();

        System.out.print("Digite a 2º nota do Bimestre: ");
        Double nota2 = scanner.nextDouble();

        System.out.print("Digite a 3º nota do Bimestre: ");
        Double nota3 = scanner.nextDouble();

        System.out.print("Digite a 4º nota do Bimestre: ");
        Double nota4 = scanner.nextDouble();

        double total = (nota1 + nota2 + nota3 + nota4) /4 ;
        System.out.println("A média das notas bimestrais é: "+total);
        scanner.close();
    }
}