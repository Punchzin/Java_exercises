
/*Crie um programa que solicite sua idade calcule quantos dias de vida 
você já viveu até hoje.*/

import java.util.Scanner;
public class Exercício06 {
    public static void main(String args[]){
        int idade, dias;
        Scanner sc;

        System.out.println("Qual sua idade? ");
        sc = new Scanner(System.in);
        idade = sc.nextInt();
        sc.close();

        dias = (idade * 365);

        System.out.println("Você viveu " + dias + " dias");
    }
}
