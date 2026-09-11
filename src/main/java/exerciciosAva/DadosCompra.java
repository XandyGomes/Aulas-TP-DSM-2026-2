/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosAva;

/**
 *
 * @author Alexandre
 */
public class DadosCompra {
    private int codPeca;
    private double valorPeca;
    private int quantPeca;

    public int getCodPeca() {
        return codPeca;
    }

    public void setCodPeca(int codPeca) {
        this.codPeca = codPeca;
    }

    public double getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(double valorPeca) {
        this.valorPeca = valorPeca;
    }

    public int getQuantPeca() {
        return quantPeca;
    }

    public void setQuantPeca(int quantPeca) {
        this.quantPeca = quantPeca;
    }
    
    public double calcularValorTotalSemIpi(){
        return (valorPeca * quantPeca);
    }
}
