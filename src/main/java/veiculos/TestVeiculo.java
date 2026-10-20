/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculos;

/**
 *
 * @author Alexandre
 */
public class TestVeiculo {

    public static void main(String[] args) {
        Automovel carro1 = new Automovel();
        Motocicleta moto1 = new Motocicleta();
        
        carro1.ligar();
        carro1.setCor("Prata");
        carro1.setValor(100000.0);
        System.out.println("Cor do carro: " + carro1.getCor());
        
        Double valor = Veiculo.calcularValorVenda(carro1);
        System.out.println("Valor do é: " 
                + carro1.getValor() 
                + " valor de venda é: " 
                + valor);
        carro1.desligar();
        
    
    }

}
