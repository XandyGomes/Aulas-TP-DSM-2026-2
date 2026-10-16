/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testAnimal;

import implementAnimal.Cavalo;
import implementAnimal.Leao;
import implementAnimal.Animal;

/**
 *
 * @author Alexandre
 */
public class Test {
    public static void main(String[] args) {
        Cavalo cavalo1 = new Cavalo();
        Cavalo cavalo2 = new Cavalo();
        Leao leao1 = new Leao();
        Leao leao2 = new Leao();
        
        
        cavalo1.setRaca("Mangalarga");
        cavalo1.setTamanho((float)2.3);
        cavalo1.setCor("Preto com manchas brancas");
        
        cavalo2.setRaca("Quarto de Milha");
        cavalo2.setTamanho(2);
        cavalo2.setCor("Branco com manchas pretas");
        
        leao1.setCor("Branco");
        leao1.setJuba(true);
        leao1.setTamanho(1);
        
        leao2.setCor("Amarelo");
        leao2.setJuba(false);
        leao2.setTamanho((float)1.5);
        
        System.out.println("### Cavalo 01 ###");
        System.out.println("Raça: " + cavalo1.getRaca());
        System.out.println("Tamanho: " + cavalo1.getTamanho());
        System.out.println("Cor: " + cavalo1.getCor());
        cavalo1.fugir();
        
        System.out.println("\n\n### Cavalo 02 ###");
        System.out.println("Raça: " + cavalo2.getRaca());
        System.out.println("Tamanho: " + cavalo2.getTamanho());
        System.out.println("Cor: " + cavalo2.getCor());
        System.out.print("O cavalo da raça "+ cavalo2.getRaca());
        cavalo2.comer();
        
        System.out.println("\n\n### Leão 01 ###");
        System.out.println("Cor: "+leao1.getCor());
        System.out.println("Tamanho: "+leao1.getTamanho());
        System.out.println("Juba?: "+leao1.getJuba());
        leao1.cacar();
        
        System.out.println("\n\n### Leão 02 ###");
        System.out.println("Cor: "+leao2.getCor());
        System.out.println("Tamanho: "+leao2.getTamanho());
        System.out.println("Juba?: "+leao2.getJuba());
        leao2.cacar();
        System.out.print(" e ");
        leao2.comer();
        
        
    }
   
}
