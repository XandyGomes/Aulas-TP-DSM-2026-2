/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class TesteConta1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Conta1 minhaConta = new Conta1();
        
        System.out.printf("O nome inicial é: %s%n%n", minhaConta.getName());

    }
}
