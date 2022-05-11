package com.company.logica.ListaExerciciosPhytonEstruturaSequencial;

/*07)Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcule a área de um quadrado");
        System.out.print("Digite um lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        double dobro = area *2;
        System.out.print("A area é: "+ area+ "O dobro é "+dobro);
        scanner.close();
    }
}