package com.company.logica.ListaExerciciosPhytonEstruturaSequencial;

/* Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.*/
/* Sempre que existir um exercicio que peça a área lembrar do metodo PI CIRCULO */

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Raio de um circulo: ");
        double raio = scanner.nextDouble();
        double PI = 3.14;
        double raioAoQuadrado = raio * raio;
        double calculo = PI * raioAoQuadrado;
        System.out.println("O raio de um circulo é: " + calculo);
        scanner.close();
    }
}