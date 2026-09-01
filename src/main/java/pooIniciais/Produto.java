/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooIniciais;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Produto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x, y, z, result;
        
        System.out.print("Digite o primeiro numero: ");
        x = input.nextInt();
        System.out.print("Digite o segundo numero: ");
        y = input.nextInt();
        System.out.print("Digite o terceiro numero: ");
        z = input.nextInt();
        
        result = x * y * z;
        
        System.out.println("O resultado do produto e: " + result);
    }
}
