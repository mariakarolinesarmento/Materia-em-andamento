package com.company.logica.ListaExerciciosPhytonEstruturaSequencial;

/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês*/

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora ?");
        double valorHoras = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhado: ");
        double horastrabalhadas = scanner.nextDouble();

        double TotalSalario = horastrabalhadas * valorHoras;
        System.out.println("O total do salário do mês é: "+TotalSalario);
        scanner.close();
    }
}