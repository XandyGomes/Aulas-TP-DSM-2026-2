/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosLogicaJava;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */

/*

01) Faça um algoritmo que leia a idade de uma pessoa expressa
em anos, meses e dias e mostre-a expressa em dias.
Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

 */
public class IdadeEmDias {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a data do seu nascimento \"dd/mm/aaaa\": ");
        String entrada = input.next();
        
        String[] partes = entrada.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        IdadeEmDias calculo = new IdadeEmDias();
        calculo.setNasc(dia, mes, ano);
        
        long totalDias = calculo.calcularTotalDias();
        long totalHoras = totalDias * 24;
        
        System.out.println("Sua idade em dias: " + totalDias);
        System.err.println("Sua idade em horas: " + totalHoras);
    }

    private Date nasc;

    public void setNasc(int dia, int mes, int ano) {
        Calendar nascimento = Calendar.getInstance();
        nascimento.set(Calendar.YEAR, ano);
        nascimento.set(Calendar.MONTH, mes - 1); // Correção correta do mês (0-11)
        nascimento.set(Calendar.DAY_OF_MONTH, dia);
        this.nasc = nascimento.getTime();
    }

    public long calcularTotalDias(){
        Calendar hoje = Calendar.getInstance();
        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(this.nasc);
        
        long diferenca = hoje.getTimeInMillis() - nascimento.getTimeInMillis();
    
        // 1 dia = 24h * 60min * 60seg * 1000ms
        return diferenca / (24*60*60*1000);
    }

}
