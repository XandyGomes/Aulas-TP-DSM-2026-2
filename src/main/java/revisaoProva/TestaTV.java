package revisaoProva;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alexandre
 */
public class TestaTV {

    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        
        System.out.println("--- Status da Smart TV ---");
        System.out.println("A TV está ligada? " + (tv.isLigada() ? "Sim" : "Não") );
        
        
        System.out.println("--- Por favor ligue a teve. ---");
        tv.ligar();
        System.out.println("A TV está ligada? " + (tv.isLigada() ? "Sim" : "Não") );
        
        System.out.println("Canal atual: " + tv.getCanal());
        System.out.println("Volume atual: " + tv.getVolume());
        
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        
        System.out.println("Volume atual: " + tv.getVolume());
        
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        
        System.out.println("Volume atual: " + tv.getVolume());

        tv.mudarCanal(200);
        System.out.println("Canal atual: " + tv.getCanal());
        
        tv.desligar();
        System.out.println("A TV está ligada? " + (tv.isLigada() ? "Sim" : "Não") );
        
    }
}

