package revisaoProva;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Alexandre
 */
public class SmartTV {

    private boolean ligada;
    private int canal;
    private int volume; // (0 a 100)

    public void ligar() {
        this.ligada = true;
        this.canal = 1;
        this.volume = 10;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
        }else{
            System.out.println("TV está desligada");
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
        }else{
            System.out.println("TV está desligada ou mudo");
        }
    }

    public void subirCanal() {
        if (ligada) {
            canal++;
        }else{
            System.out.println("TV está desligada");
        }
    }

    public void descerCanal() {
        if (ligada && canal > 1) {
            canal--;
        }else{
            System.out.println("TV está desligada ou canal < 1");
        }
    }
    
    public void mudarCanal(int novoCanal){
        if(ligada && novoCanal > 0){
            this.canal = novoCanal;
        }
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
