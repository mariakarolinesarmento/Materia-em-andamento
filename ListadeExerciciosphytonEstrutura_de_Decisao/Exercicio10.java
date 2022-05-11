package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/*Faça um Programa que pergunte em que turno você estuda.
Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe em que turno você estuda");
        System.out.println("M-matutino ou V-Vespertino ou N- Noturno");
        System.out.println("Digite: ");
        char turno = scanner.next().charAt(0);
        char turnoMatutino = ('M' | 'm');
        char turnoVespertino = ('V' | 'v');
        char turnoNoturno = ('N' | 'n');
        boolean primeiroTurno = turno == turnoMatutino;
        boolean segundoTurno = turno == turnoVespertino;
        boolean terceiroTurno = turno == turnoNoturno;
        if (primeiroTurno) {
            System.out.println("Bom Dia!");
        } else if (segundoTurno) {
            System.out.println("Boa Tarde!");
        } else if (terceiroTurno) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido");
        }
        scanner.close();
    }
}