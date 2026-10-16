/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementPessoa;

/**
 *
 * @author Alexandre
 */
public class Parceiro extends Juridica {

    private String tipoPessoa;
    private float desenpenho;

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public float getDesenpenho() {
        return desenpenho;
    }

    public void setDesenpenho(float desenpenho) {
        this.desenpenho = desenpenho;
    }

    public void cadastrar() {
        System.out.println("Parceiro cadastrado com sucesso!");
    }

    public void bloquear() {
        System.out.println("Parceiro bloqueado com sucesso!");
    }

    public void excluir() {
        System.out.println("Parceiro excluído com sucesso!");
    }

}
