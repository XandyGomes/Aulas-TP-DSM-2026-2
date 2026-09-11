/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosAva;

/**
 *
 * @author Alexandre
 */
public class CalculadoraIPI {
    private double porcentagemIpi;

    public CalculadoraIPI(double porcentagemIpi) {
        this.porcentagemIpi = porcentagemIpi;
    }
    
    public double calcularValorTotalComIpi(double valorTotalSemIpi){
        double valorIpi = valorTotalSemIpi * (porcentagemIpi / 100);
        return (valorTotalSemIpi + valorIpi);
    }
    
}
