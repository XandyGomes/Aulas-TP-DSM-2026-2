/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author Alexandre
 */
public class TesteConta2 {
    public static void main(String[] args) {
        Conta2 meuNome1 = new Conta2("Alexandre");
        Conta2 meuNome2 = new Conta2("Gomes");
        
        System.out.printf("Os nomes dos objetos são: %s %s",
                meuNome1.getName(), meuNome2.getName());
    }
}
