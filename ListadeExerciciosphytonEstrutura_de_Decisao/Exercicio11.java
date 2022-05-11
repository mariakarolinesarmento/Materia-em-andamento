package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/*As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
 e lhe contraram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu salário: R$ ");
        double salario = scanner.nextFloat();
        boolean primeiroValor = salario <= 280;
        boolean segundoValor = salario > 280 & salario <= 700;
        boolean terceiroValor = salario > 700 & salario <= 1500;
        boolean quartovalor = salario > 1500;
        if (primeiroValor) {
            System.out.println("Antes do reajuste: " + salario);
            System.out.println("O percentual do aumento aplicado é de 20%");
            double aumentoVinteporcento = (salario * 20) / 100;
            System.out.println("O valor do aumento: " + aumentoVinteporcento);
            System.out.println("Com o reajuste, o seu salário é: R$" + salario + aumentoVinteporcento);
        } else if (segundoValor) {
            System.out.println("Antes do reajuste: " + salario);
            System.out.println("O percentual do aumento aplicado é de 15%");
            double aumentoQuinzeporcento = (salario * 15) / 100;
            System.out.println("O valor do aumento: " + aumentoQuinzeporcento);
            System.out.println("Com o reajuste, o seu salário é: R$" + salario + aumentoQuinzeporcento);
        } else if (terceiroValor) {
            System.out.println("Antes do reajuste: " + salario);
            System.out.println("O percentual do aumento aplicado é de 10%");
            double aumentoDezporcento = (salario * 10) / 100;
            System.out.println("O valor do aumento: " + aumentoDezporcento);
            System.out.println("Com o reajuste, o seu salário é: R$" + salario + aumentoDezporcento);
        } else if (quartovalor) {
            System.out.println("Antes do reajuste: " + salario);
            System.out.println("O percentual do aumento aplicado é de 5%");
            double aumentoCincoporcento = (salario * 5) / 100;
            System.out.println("O valor do aumento: " + aumentoCincoporcento);
            System.out.println("Com o reajuste, o seu salário é: R$" + salario + aumentoCincoporcento);
        }
        scanner.close();
    }
}