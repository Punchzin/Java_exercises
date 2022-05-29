/*3) Crostrua um programa em Java para exiber os seguintes dados:
- Seu nome;
- Sua idade;
- Sua música/filme/sport/lazer preferido.*/

import java.util.*;
public class Exercício03 {
    public static void main(String args[]){
        String nome, lazer;
        int idade;
        Scanner leia;

        System.out.println("Escreva seu nome: ");
        leia = new Scanner(System.in);
        nome = leia.nextLine();

        System.out.println("Escreva sua idade: ");
        leia = new Scanner(System.in);
        idade = leia.nextInt();

        System.out.println("Escreva seu hobbie favorito: ");
        leia = new Scanner(System.in);
        lazer = leia.nextLine();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu hobbie é: " + lazer);
    }
}
