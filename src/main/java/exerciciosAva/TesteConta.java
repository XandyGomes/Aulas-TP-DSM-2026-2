/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosAva;

/**
 *
 * @author Alexandre
 */
public class TesteConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        
        conta1.inicializar(1524, 500.0);

        System.out.println("Saldo inicial da conta nº "
                + conta1.getNumero()
                + " = " 
                + conta1.getSaldo());
        
        conta1.depositar(100.0);
        
        System.out.println("Saldo após depósito da conta nº "
                + conta1.getNumero()
                + " = " 
                + conta1.getSaldo());
        
        System.out.println("Tentando sacar R$ 1.000,00");
        conta1.sacar(1000.0);
        
        
        System.out.println("Tentando sacar R$ 20,00");
        conta1.sacar(20.0);
        
        System.out.println("Saldo após saque da conta nº "
                + conta1.getNumero()
                + " = " 
                + conta1.getSaldo());
    
    
    }
}
