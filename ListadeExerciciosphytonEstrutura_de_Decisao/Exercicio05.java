package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/*“Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a
média alcançada por aluno e apresentar:
A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
A mensagem “Reprovado”, se a média for menor do que sete;
A mensagem “Aprovado com Distinção”, se a média for igual a dez.” */

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        int notaDoAluno1 = scanner.nextInt();
        System.out.print("Digite a segunda nota: ");
        int notaDoAluno2 = scanner.nextInt();
        int media = (notaDoAluno1 + notaDoAluno2) / 2;
        boolean aprovadoComDistinção = media ==10;
        boolean acimaDaMedia = media >=7;
        if (aprovadoComDistinção) {
            System.out.println("Aluno foi aprovado com distinção");
        } else if (acimaDaMedia) {
            System.out.println("Aluno foi aprovado");
        } else {
            System.out.println("Aluno foi reprovado");
        }

    }
}