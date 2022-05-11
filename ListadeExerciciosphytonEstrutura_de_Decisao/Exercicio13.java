package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/*Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.*/
/* corrigir*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número que corresponde um dia da semana: "+ "1- Domingo\n 2-Segunda\n 3-Terça\n 4-Quarta\n 5-Quinta\n 6-Sexta\n 7-Sábado");
        System.out.print("\n Digite: ");
        int numeroDaSemana = scanner.nextInt();
        Integer domingo = 1;
        Integer segundaFeira = 2;
        Integer tercaFeira = 3;
        Integer quartaFeira=4;
        Integer quintaFeira=5;
        Integer sextaFeira=6;
        Integer sabado = 7;
        boolean primeiroDiaDaSemana = numeroDaSemana == domingo;
        boolean segundoDiaDaSemana = numeroDaSemana == segundaFeira;
        boolean terceiroDiaDaSemana = numeroDaSemana == tercaFeira;
        boolean quartoDiaDaSemana = numeroDaSemana == quartaFeira;
        boolean quintoDiaDaSemana = numeroDaSemana == quintaFeira;
        boolean sextoDiaDaSemana = numeroDaSemana == sextaFeira;
        boolean setemoDiaDaSemana =numeroDaSemana == sabado;
        if(primeiroDiaDaSemana){
            System.out.println("Corresponde ao dia de: "+domingo);
        }
        if (segundoDiaDaSemana){
            System.out.println("Corresponde ao dia de: "+segundaFeira);
        }
        if (terceiroDiaDaSemana){
            System.out.println("Corresponde ao dia de: "+tercaFeira);
        }
        if (quartoDiaDaSemana){
            System.out.println("Corresponde ao dia de: "+quartaFeira);
        }
        if (quintoDiaDaSemana){
            System.out.println("Corresponde ao dia de: "+quintaFeira);
        }
        if (sextoDiaDaSemana){
            System.out.println("Corresponde ao dia de: "+sextaFeira);
        }
        if (setemoDiaDaSemana){
            System.out.println("Corresponde ao dia de: "+sabado);
        } else {
            System.out.println("Número inválido");
        }
        scanner.close();
    }
}