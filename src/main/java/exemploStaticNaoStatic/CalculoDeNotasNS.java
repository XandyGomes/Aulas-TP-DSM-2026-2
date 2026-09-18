/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploStaticNaoStatic;

/**
 *
 * @author Alexandre
 */
//Exemplo 2 - métodos não static (OO, exige instanciar)
public class CalculoDeNotasNS {

    public static void main(String[] args) {
        CalculoDeNotasNS ObjJoao = new CalculoDeNotasNS();
        CalculoDeNotasNS ObjAle = new CalculoDeNotasNS();
        CalculoDeNotasNS ObjSergio = new CalculoDeNotasNS();

        System.out.println("Média Joao: " + ObjJoao.calcularMedia(8.0, 7.0, 6.0));
        System.out.println("Média Ale: " + ObjAle.calcularMedia(7.0, 7.0, 7.0));
        System.out.println("Média Sergio: " + ObjSergio.calcularMedia(1.0, 8.0, 9.0));
    }

    public double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }
}
