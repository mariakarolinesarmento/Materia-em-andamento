package com.company.logica.ListaExerciciosPhytonEstruturaSequencial;
/* Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9). */

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = 5 * ( (temperaturaFahrenheit - 32) / 9);

        System.out.println("A temperatura em graus Celsius é de: " + temperaturaCelsius);
        scanner.close();
    }
}