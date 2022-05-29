/*5 - Faça um programa em Java que receba a temperatura em graus Celsius e converta em Fahrenheit.
Fórmula - Celsius = (ctemp * 9/5) + 32.*/

import java.util.Scanner;
public class Exercícios05 {
    public static void main(String args[]){
        Double ctemp, celsius;
        Scanner leia;

        System.out.println("Quantos graus está fazendo? ");
        leia = new Scanner(System.in);
        ctemp = leia.nextDouble();
        leia.close();

        celsius = (ctemp * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é de " + celsius + " graus");
    }
}
