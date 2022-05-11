package com.company.logica.ListaExerciciosPhytonEstruturaSequencial;
/* 11) Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo. */


import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1º número inteiro: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o 2º número inteiro: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite um número real: ");
        double numeroReal = scanner.nextDouble();
        double soma = ((2*numero1)*(numero2/2));
        double produto = ((3*numero1)+numeroReal);
        double cubo = (numeroReal*numeroReal*numeroReal);

        System.out.println("O produto do dobro do primeiro com metade do segundo é: "+soma);
        System.out.println("O protudo do triplo do primeiro com o teirceiro é: "+produto);
        System.out.println("O terceiro elevado ao cubo é: "+cubo);
        scanner.close();
    }

}