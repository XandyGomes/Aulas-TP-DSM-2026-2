/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testPessoa;

import implementPessoa.Colaborador;
import implementPessoa.Parceiro;

/**
 *
 * @author Alexandre
 */
public class Test {

    public static void main(String[] args) {
        Colaborador c1 = new Colaborador();
        c1.setNome("Alexandre");
        c1.setBairro("Centro");
        c1.setCidade("Franca");
        c1.setCpf("1234567890");
        c1.setLogradouro("Rua Floriano Peixoto");
        c1.setNasc(1980, 10, 3);

        Parceiro p1 = new Parceiro();
        p1.setNome("Fatec");
        p1.setCnpj("5875875425487");
        p1.setTipoPessoa("Jurídica");

        System.out.println("### Dados do Colaborador ###");
        System.out.println("Bairro do colaborador " 
                + c1.getNome() 
                + ": " 
                + c1.getBairro()
        );
        
        System.out.println("Nascimento do colaborador "
                + c1.getNome()
                + ": "
                + c1.getNasc()
        );
        
        System.out.println("\n\n### Dados do Parceiro ###");
        System.out.println("Empresa parceira: "
                + p1.getNome()
        );
        
        System.out.println("CNPJ da empresa "
                + p1.getNome()
                +": "
                +p1.getCnpj()
        );
        p1.cadastrar();
    }
}
