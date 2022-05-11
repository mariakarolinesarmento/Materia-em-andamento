package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

// Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
// Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
//Dicas:
//Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
//Triângulo Equilátero: três lados iguais;
//Triângulo Isósceles: quaisquer dois lados iguais;
//Triângulo Escaleno: três lados diferentes; //


import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        float ladoA = scanner.nextFloat();
        System.out.println("Digite o segundo lado: ");
        float ladoB = scanner.nextFloat();
        System.out.println("Digite o terceiro lado: ");
        float ladoC = scanner.nextFloat();
        boolean umTriangulo = ladoA+ladoB>ladoC;

    }
}