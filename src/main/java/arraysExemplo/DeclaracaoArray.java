/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Alexandre
 */
public class DeclaracaoArray {
    public static void main(String[] args) {
        //[] - são inseridos em uma variável que referencia um array
        int[] a = new int[4];
        
        //outra maneira de fazer uma declaração de array
        int[] b;
        b = new int[10];
        
        //declarando vários arrays
        int[] r = new int[44], k = new int[23];
        
        //{} - inicializar valores em um array
        int[] inicializadores = {12,32,54,6,8,89,64,6};
        
        //declarar um array de inteiros
        int[] meuArray;
        meuArray = new int[10];
        
        meuArray[0]=100;
        meuArray[1]=85;
        meuArray[2]=32;
        meuArray[3]=64;
        meuArray[4]=43;
        meuArray[5]=52;
        meuArray[6]=71;
        meuArray[7]=23;
        meuArray[8]=49;
        meuArray[9]=99;
        //meuArray[10]=8522;
        
        System.out.println(meuArray[9]);
        System.out.println(meuArray[1]);
    }
    
    
}
