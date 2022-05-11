package com.company.logica.ListaExerciciosPhytonEstruturaSequencial;

/*Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
        Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
        comprar apenas latas de 18 litros;
        comprar apenas galões de 3,6 litros
        misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.*/

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o tamanho em metros quadrados da área a ser pintada: ");
            double area = scanner.nextDouble();
            double litro = area/6;
            double latas = litro/18;
            double galoes = litro/3.6;
            double precolata = 80;
            double precogalao = 25;

            System.out.println("Quantidade compradas com latas R$: "+Math.ceil(latas));





        }

    }