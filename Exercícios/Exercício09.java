/*9 - Usando a classe Scanner para entrada de dados, faça uma classe 
que receba dois valores inteiros. O primeiro valor corresponde a quantidade 
de portas do líder do compeonato basileiro de futebol, o segundo valor corresponde
 à quantidade de pontos do time lanterna. Considerando que cada vitórias necessárias 
 para que cada time lanterna alcance(ou altrapasse) o líder. Por exemplo, supondo que 
 as quantidades de pontos fornecidas sejam 40 e 22, então o número de vitórias 
 apresentada na saída deverá ser 6, pois (40 - 22) / 3 = 6.*/

import java.util.Scanner;
public class Exercício09 {
    public static void main(String args[]){
        int t1, l2, qp;
        float fn;
        Scanner input;

        try{
            System.out.println("Entre com a quantidade de pontos do time 1: ");
            input = new Scanner(System.in);
            t1 = input.nextInt();

            System.out.println("Entre com a quantidade de pontos do time 2: ");
            input = new Scanner(System.in);
            l2 = input.nextInt();

            System.out.println("Entre com o valor dos pontos: ");
            input = new Scanner(System.in);
            qp = input.nextInt();

            fn = (t1 - l2) / qp;
            if(fn >= 0){
                System.out.println("Para empatar é necessário pontuar: " + fn + " vezes");
            }
            if(fn <= 0){
                System.out.println("Estamos ganhando por: " + (fn* -1) + " jogadas");
            }
        }catch (Exception error){
            System.out.println("Houve um erro na conversão, digite apenas caracteres numéricos.");
        }
    }
}