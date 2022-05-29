/*Crie uma classe que receba o valor de um produto e a porcentagem de 
desconto. Calcule e mostre o valor do desconto e o valor do produto com o 
desconto. O valor do desconto é calculado por meio da 
fórmula: valor da porcentagen = valor do produto * percentual de desconto/100.*/

import java.util.*;
public class Exercício07 {
    public static void main(String args[]){
        double vProduto, desconto, conta, conta2;
        Scanner leia;

        System.out.println("Qual o valor do produto? ");
        leia = new Scanner(System.in);
        vProduto = leia.nextDouble();
        

        System.out.println("Qual porcentagem de desconto do produto? ");
        leia = new Scanner(System.in);
        desconto = leia.nextDouble();

        conta = (vProduto * desconto) / 100;
        conta2 = (vProduto - conta);

        System.out.println("O preço do desconto é de: " + conta + "$");
        System.out.println("O preço do produto com desconto é de: " + conta2 + "$");
    }
}
