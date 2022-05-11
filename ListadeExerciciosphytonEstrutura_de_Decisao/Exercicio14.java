package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/*Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre,
e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
        Média de Aproveitamento  Conceito
        Entre 9.0 e 10.0        A
        Entre 7.5 e 9.0         B
        Entre 6.0 e 7.5         C
        Entre 4.0 e 6.0         D
        Entre 4.0 e zero        E
        O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for A, B ou C
         ou “REPROVADO” se o conceito for D ou E.*/


import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primera nota: ");
        float primeiraNota = scanner.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float segundaNota = scanner.nextFloat();
        float mediaNotas = (primeiraNota+segundaNota)/2;
        boolean notaEntreNoveEDez = mediaNotas >=9 && mediaNotas <= 10;// A
        boolean notaEntreSeteVirgulaCincoENove = mediaNotas >= 7.5 && mediaNotas <9; // B
        boolean notaEntreSeisESeteVirgulaCinco = mediaNotas >=6 && mediaNotas <7.5;//C
        boolean notaEntreQuatroESeis = mediaNotas >=4 && mediaNotas <6;//D
        boolean notaEntreZeroEQuatro = mediaNotas >=0 && mediaNotas <4;//E
        if(notaEntreNoveEDez){
            System.out.println("A primeira nota = "+primeiraNota+ "\nSegunda Nota = "+segundaNota+ "\nSua média foi de: " + mediaNotas + "\n A Aprovado(a)!");
        } else if (notaEntreSeteVirgulaCincoENove){
            System.out.println("A primeira nota = "+primeiraNota+ "\nSegunda Nota = "+segundaNota+ "\nSua média foi de: " + mediaNotas + "\n B Aprovado(a)!");
        } else if (notaEntreSeisESeteVirgulaCinco){
            System.out.println("A primeira nota = "+primeiraNota+ "\nSegunda Nota = "+segundaNota+ "\nSua média foi de: " + mediaNotas + "\n C Aprovado(a)!");
        } else if (notaEntreQuatroESeis){
            System.out.println("A primeira nota = "+primeiraNota+ "\nSegunda Nota = "+segundaNota+ "\nSua média foi de: " + mediaNotas + "\n D Reprovado(a)!");
        } else if (notaEntreZeroEQuatro){
            System.out.println("A primeira nota = "+primeiraNota+ "\nSegunda Nota = "+segundaNota+ "\nSua média foi de: " + mediaNotas + "\n E Reprovado(a)!");
        } else {
            System.out.println("Você informou uma nota invalida.");
        }
        scanner.close();
    }
}