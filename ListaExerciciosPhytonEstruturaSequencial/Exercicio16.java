package com.company.logica.ListaExerciciosPhytonEstruturaSequencial;

/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho em metros quadrados da área a ser pintada: ");
        double area = scanner.nextDouble();
        double litros = area/3;
        double preco = 80.0;
        double capacidadelitros = 18;
        double latas = litros/capacidadelitros;
        double total = latas*preco;
        System.out.println("Você usara "+latas+" latas de tintas");
        System.out.println("O preço total é de: R$"+total);
        scanner.close();
    }
}