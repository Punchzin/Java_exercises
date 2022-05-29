/*2 - Escrever em seu caderno ou em uma IDE (caso seja possível), uma classe em Java com as seguintes informações (depois vou pedir as fotos/prints dos exercícios):
    * Criar uma classe com o nome de "Exercicio02";
    * Criar o método "main()";
    * Criar a variável "msgPositiva", do tipo "String";
    * Solicitar na tela uma mensagem de otimismo;
    * Ler a mensagem de otimismo digitada na tela e guardar na variável "msgPositiva", usando o método "Scanner";
    * Exibir na tela uma mensagem de otimismo;
    * Encerrar o programa.*/

    import java.util.*;
    public class Exercício02{
    public static void main(String args[]){
        String msgPositiva;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Escreva uma mensagem de otimismo: ");
            msgPositiva = sc.nextLine();
            System.out.println("Sua mensagem é: " + msgPositiva);
        } finally {

        }
        sc.close();
    }
}