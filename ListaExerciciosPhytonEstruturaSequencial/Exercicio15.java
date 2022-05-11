package com.company.logica.ListaExerciciosPhytonEstruturaSequencial;

/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês,
sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$ */

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor que você ganha por hora: ");
        double valorHoras = scanner.nextDouble();
        System.out.print("Horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();
        double salarioBruto = valorHoras*horasTrabalhadas;
        double ir = salarioBruto*0.11;
        double inss = salarioBruto*0.08;
        double sindicato = salarioBruto*0.05;
        double liquido = (salarioBruto-ir-inss-sindicato);
        System.out.println("Sálario Bruto é: "+salarioBruto);
        System.out.println("O valor descontado do INSS: "+inss);
        System.out.println("O valor descontado do Sindicato: "+sindicato);
        System.out.println("O valor liquido: "+liquido);
        scanner.close();

    }
}