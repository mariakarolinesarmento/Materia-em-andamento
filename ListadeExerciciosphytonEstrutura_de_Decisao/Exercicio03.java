package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/*Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever:
F - Feminino,
M - Masculino,
Sexo Inválido.*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite F para feminino ou M para Masculino: ");
        char generoInformado = scanner.next().charAt(0);
        boolean sexoDigitadoEFeminino = generoInformado == 'F' || generoInformado == 'f';
        boolean sexoDigitadoEMasculino = generoInformado == 'M' || generoInformado == 'm';
        if (sexoDigitadoEFeminino) {
            System.out.println("Sexo Femenino");
        } else if (sexoDigitadoEMasculino) {
            System.out.println("Sexo Masculino");
        } else {
            System.out.println("Sexo inválido " + " F (Feminino)" + " M (Masculino)");
        }
        scanner.close();
    }
}