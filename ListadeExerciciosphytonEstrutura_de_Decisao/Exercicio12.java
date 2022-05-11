package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto,
mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos.
O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo.
No exemplo o valor da hora é 5 e a quantidade de hora é 220.
        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor recebido por hora trabalhada: ");
        float valorHora = scanner.nextFloat();
        System.out.println("Digite  a quantidade de hora trabalhada no dia: ");
        float quantidadeHora = scanner.nextFloat();
        float horasTrabalhadaNoMes = 22; //* Dias úteis//*
        float horastrabalhadaNoMes = valorHora*quantidadeHora;
        float salarioBruto = valorHora * horasTrabalhadaNoMes;
        float impostoDeRenda = 0;
        float inss = (salarioBruto * 10) / 100;
        float fgts = (salarioBruto * 11) / 100;
        float totalDeDescontos = impostoDeRenda + inss;
        float salarioLiquido = salarioBruto - totalDeDescontos;
        boolean salarioAteNovecentosReais = salarioBruto <= 900;
        boolean salarioForMaiorQueNovecentosAteMilEQuinhentos = salarioBruto > 900 && salarioBruto <= 1500;
        boolean salarioForMaiorQueMilEQuinhentosAteDoisMilEQuinhentos = salarioBruto > 1500 && salarioBruto <= 2500;
        boolean salarioAteMaiorQueDoisMileQUinhentosReais = salarioBruto<=2500;
        if (salarioAteNovecentosReais) {
            System.out.println("Salário Bruto:            R$" + salarioBruto);
            System.out.println("(-) Imposto de Renda (0%) R$" + impostoDeRenda);
            System.out.println("(-) Inss (10%)            R$" + inss);
            System.out.println("FGTS (11%)                R$" + fgts);
            System.out.println("Total de descontos        R$" + totalDeDescontos);
            System.out.println("Salário Liquido           R$" + salarioLiquido);
            System.out.println("_______________________________________________");
        }    else if (salarioForMaiorQueNovecentosAteMilEQuinhentos) {
            System.out.println("Salário Bruto:            R$" + salarioBruto);
            System.out.println("(-) Imposto de Renda (5%) R$" + impostoDeRenda);
            System.out.println("(-) Inss (10%)            R$" + inss);
            System.out.println("FGTS (11%)                R$" + fgts);
            System.out.println("Total de descontos        R$" + totalDeDescontos);
            System.out.println("Salário Liquido           R$" + salarioLiquido);
            System.out.println("_______________________________________________");
        } else if (salarioForMaiorQueMilEQuinhentosAteDoisMilEQuinhentos) {
            System.out.println("Salário Bruto:            R$" + salarioBruto);
            System.out.println("(-) Imposto de Renda (10%) R$" + impostoDeRenda);
            System.out.println("(-) Inss (10%)            R$" + inss);
            System.out.println("FGTS (11%)                R$" + fgts);
            System.out.println("Total de descontos        R$" + totalDeDescontos);
            System.out.println("Salário Liquido           R$" + salarioLiquido);
            System.out.println("_______________________________________________");
        } else if (salarioAteMaiorQueDoisMileQUinhentosReais) {
            System.out.println("Salário Bruto:            R$" + salarioBruto);
            System.out.println("(-) Imposto de Renda (20%) R$" + impostoDeRenda);
            System.out.println("(-) Inss (10%)            R$" + inss);
            System.out.println("FGTS (11%)                R$" + fgts);
            System.out.println("Total de descontos        R$" + totalDeDescontos);
            System.out.println("Salário Liquido           R$" + salarioLiquido);
            System.out.println("_______________________________________________");
        }
        scanner.close();
    }
}