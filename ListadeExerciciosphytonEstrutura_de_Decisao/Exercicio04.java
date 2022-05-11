package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/*Faça um Programa que verifique se uma letra digitada é vogal ou consoante.*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma letra do alfabeto: ");
        char letraInserida = scanner.next().charAt(0);
        boolean digitouUmaLetra =('a' <= letraInserida && letraInserida <= 'z') || ('A' <= letraInserida && letraInserida <= 'Z');
        if (digitouUmaLetra){
            switch (letraInserida) {
                case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' -> {
                    System.out.println("A letra é vogal");
                }
                default -> {
                    System.out.println("A letra é consoante");
                }
            }
            scanner.close();
        }
    }
}