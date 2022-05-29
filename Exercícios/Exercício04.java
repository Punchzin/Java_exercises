/*4 - Desenvolva um programa em Java que recebe as informações, calcule e exiba o tamanho de uma área em metros quadrados. Use as variáveis area, altura e largura.
Fórmula - area = altura * largura.
*/
import java.util.*;
public class Exercício04 {
    public static void main(String args[]){
        Double area, altura, largura;
        Scanner leia;

        System.out.println("Escreva a altura: ");
        leia = new Scanner(System.in);
        altura = leia.nextDouble();

        System.out.println("Escreva a largura: ");
        leia = new Scanner(System.in);
        largura = leia.nextDouble();

        area = altura * largura;

        System.out.println("Sua área é: " + area + " metros quadrados.");
    }
}
