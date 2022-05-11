package com.company.logica.ListaExerciciosPhytonEstruturaSequencial;

/* 05) Faça um Programa que converta metros para centímetros.*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade em metros: ");
        double metro = scanner.nextDouble();

        double centimetros = metro * 100;
        System.out.println("A quantidade em metros para centimetros é: "+centimetros);
        scanner.close();
    }
}