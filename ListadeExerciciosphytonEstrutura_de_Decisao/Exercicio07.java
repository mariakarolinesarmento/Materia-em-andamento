package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/* Faça um Programa que leia três números e mostre o maior e o menor deles.*/


import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        double segundoNumero = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        double terceiroNumero = scanner.nextInt();
        boolean seNaoHouverNumeroIgual = primeiroNumero != segundoNumero && primeiroNumero != terceiroNumero && segundoNumero != terceiroNumero;
        if (seNaoHouverNumeroIgual) {
            boolean primeiroNumeroMaiorQueOSegundo = primeiroNumero > segundoNumero;
            boolean primeiroNumeroMaiorQueOterceiro = primeiroNumero > terceiroNumero;
            boolean segundoNumeroMaiorQueOPrimeiro = segundoNumero > primeiroNumero;
            boolean segundoNumeroMaiorQueOterceiro = segundoNumero > terceiroNumero;
            boolean primeiroNumeroMenorQueOSegundo = segundoNumero < primeiroNumero;
            boolean primeiroNumeroMenorQueOterceiro = terceiroNumero < primeiroNumero;
            boolean segundoNumeroMenorQueoPrimeiro = primeiroNumero < segundoNumero;
            boolean segundoNumeroMenorQueOTerceiro = terceiroNumero < segundoNumero;
            if (primeiroNumeroMaiorQueOSegundo & primeiroNumeroMaiorQueOterceiro) {
                System.out.println("O primeiro número é maior ");
            } else if (segundoNumeroMaiorQueOPrimeiro & segundoNumeroMaiorQueOterceiro) {
                System.out.println("O Segundo número é maior ");
            } else {
                System.out.println("O terceiro número é maior " + terceiroNumero);
            }
            if (primeiroNumeroMenorQueOSegundo && primeiroNumeroMenorQueOterceiro) {
                System.out.println("O primeiro número é o menor");
            } else if (segundoNumeroMenorQueoPrimeiro && segundoNumeroMenorQueOTerceiro) {
                System.out.println("O segundo número é o menor");
            } else {
                System.out.println("O terceiro numero é o menor" + terceiroNumero);
            }
            scanner.close();
        }
    }
}