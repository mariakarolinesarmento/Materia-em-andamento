package com.company.logica.ListadeExerciciosphytonEstrutura_de_Decisao;

/*Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
sabendo que a decisão é sempre pelo mais barato */

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o preço do primeiro produto:R$ ");
        float precoProduto1 = scanner.nextFloat();
        System.out.print("Digite o preço do sengudo produto:R$ ");
        float precoProduto2 = scanner.nextFloat();
        System.out.print("Digite o preço do terceiro produto:R$ ");
        float precoProduto3 = scanner.nextFloat();
        boolean oPrimeiroProdutoEOMaisBaratoQueOSegundoProduto = precoProduto1<precoProduto2;
        boolean oPrimeiroProdutoEOMaisBaratoQueOTerceiroProduto = precoProduto1<precoProduto3;
        boolean oSegundoProdutoEOMaisBaratoQueOPrimeiroProduto = precoProduto2<precoProduto3;
        boolean oSegundoProdutoEOMaisBaratoQueOTerceiroProduto = precoProduto2<precoProduto1;
        if (oPrimeiroProdutoEOMaisBaratoQueOSegundoProduto && oPrimeiroProdutoEOMaisBaratoQueOTerceiroProduto){
            System.out.println("Você deve comprar o primeiro produto!");
        } else if (oSegundoProdutoEOMaisBaratoQueOPrimeiroProduto  && oSegundoProdutoEOMaisBaratoQueOTerceiroProduto){
            System.out.println("Você deve comprar o segundo produto!");
        } else {
            System.out.println("Você deve comprar o terceiro produto!");
        }
        scanner.close();
    }
}
