/*8 - Usando a classe JOptionPane para entrada de dados, elabore uma classe que receba
 a nota de duas provas e de um trabalho. Calcule e mostre a média e o resultado final
 (APROVADO ou REPROVADO). Pare calcular a média utilize a fórmula seguinte: média = 
 (nota da prova 1 + nota da prova 2 + nota do trabalho) / 3. Considere que a média miníma 
 para aprovação é 6*/

import javax.swing.JOptionPane;
public class Exercício08 {
    public static void main(String args[]){
        float prova1, prova2, trabalho, media;
        String aux, aprovado, reprovado;

        aprovado = "Aprovado";
        reprovado = "Reprovado";

        aux = JOptionPane.showInputDialog("Qual sua nota na prova 1? ");
        prova1 = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog("Qual sua nota na prova 2? ");
        prova2 = Float.parseFloat(aux);

        aux = JOptionPane.showInputDialog("Qual sua nota no trabalho? ");
        trabalho = Float.parseFloat(aux);

        media = (prova1 + prova2 + trabalho) / 3;

        if(media < 5){
            JOptionPane.showMessageDialog(null, "O aluno foi " + aprovado + " com média: " + media);
        } else if(media < 6){
            JOptionPane.showMessageDialog(null, "O aluno foi " + reprovado + " com média: " + media);
        }

    }
}