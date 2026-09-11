/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosAva;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Leia a porcentagem do IPI do usuário
        System.out.print("Digite a porcentagem do IPI: ");
        double porcentagemIPI = input.nextDouble();
        
        //criação dos objetos
        CalculadoraIPI calculoIPI = new CalculadoraIPI(porcentagemIPI);
        DadosCompra produto1 = new DadosCompra();
        DadosCompra produto2 = new DadosCompra();
        
        //Leia os dados da peça 1
        System.out.println("**Dados da Peça 1:**");
        System.out.print("Código: ");
        int codigoPeca1 = input.nextInt();
        produto1.setCodPeca(codigoPeca1);
        System.out.print("Valor unitário: ");
        double valorUnitarioPeca1 = input.nextDouble();
        produto1.setValorPeca(valorUnitarioPeca1);
        System.out.print("Quantidade: ");
        int quantidadePeca1 = input.nextInt();
        produto1.setQuantPeca(quantidadePeca1);
        
        //Leia os dados da peça 2
        System.out.println("**Dados da Peça 2:**");
        System.out.print("Código: ");
        int codigoPeca2 = input.nextInt();
        produto2.setCodPeca(codigoPeca2);
        System.out.print("Valor unitário: ");
        double valorUnitarioPeca2 = input.nextDouble();
        produto2.setValorPeca(valorUnitarioPeca2);
        System.out.print("Quantidade: ");
        int quantidadePeca2 = input.nextInt();
        produto2.setQuantPeca(quantidadePeca2);
        
        //cálculo dos valores
        double valorTotalSemIPI = produto1.calcularValorTotalSemIpi() 
                                    + produto2.calcularValorTotalSemIpi();
        
        double valorTotalComIPI = calculoIPI.calcularValorTotalComIpi(valorTotalSemIPI);
        
        double valorTotalIPI = valorTotalComIPI - valorTotalSemIPI;
        
    }
}
