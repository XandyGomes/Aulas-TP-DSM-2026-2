/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class ExemploArrayList {
    public static void main(String[] args) {
        //criando uma ArrayList sem definir o tamanho
        
        ArrayList<String> lista = new ArrayList();
        
        //adicionando elementos à lista
        lista.add("Elemento 01");
        lista.add("Elemento 02");
        lista.add("Elemento 03");
        
        //acessando elementos da lista
        for (String elementos : lista){
            System.out.println(elementos);
        }
        
        System.out.println("Apenas a posição de 0: "+ lista.get(0));
        
        //Tamanho da lista
        System.out.println("Tamanho da lista: "+lista.size());
    }
}
