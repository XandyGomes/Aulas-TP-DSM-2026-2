/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class AplicandoArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> array = new ArrayList();
        
        int soma = 0;
        double media = 0.0;
        int numeros = 0;
        int qtdArray = 0;
        
        System.out.print("Digite a quantidade de números que você quer para o array: ");
        qtdArray = input.nextInt();

        for (int i = 0; i < qtdArray ; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros = input.nextInt();
            array.add(numeros);
            soma += numeros;
            
        }

        for (int num : array) {
            System.out.println(num);
        }

        media = soma / array.size();

        System.out.printf("\nMédia: %.2f: ", media);

    }
}
