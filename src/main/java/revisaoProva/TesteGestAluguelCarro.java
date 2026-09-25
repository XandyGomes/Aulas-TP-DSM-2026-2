/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaoProva;

/**
 *
 * @author Alexandre
 */
public class TesteGestAluguelCarro {
    public static void main(String[] args) {
        GestAluguelCarro locacao = new GestAluguelCarro();
        
        locacao.inicializar("VW Polo 2024", 150.0);
        
        //retirar carro
        locacao.retirarCarro(12500);
        
        //devolucao após 5 dias
        int dias = 5;
        locacao.devolverCarro(13200);
        
        System.out.println("\n--- Resumo do Aluguel ---");
        System.out.println("Veículo: " + locacao.getModelo());
        System.out.println("Valor da Diária: R$ " + locacao.getValorDiaria());
        System.out.println("Total a pagar por " + dias + " dias: R$ " + locacao.calcularValorTotal(dias));
        System.out.println("Status de locação: "+ (locacao.isAlugado() ? "Alugado" : "Disponivel"));
        
    }
}
