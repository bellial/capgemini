import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Questão 01
 */
public class Questao01 {

    public static void main(String[] args) {
        // Recebe input do usuário e guarda em uma variável.
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de degraus: ");
        int qtdDegraus = entrada.nextInt();
        // cria um array que será usado no laço de repetição
        List<String> degraus = new ArrayList<>();

        // laço de repetição que adiciona ao array a quantidade de espaços e símbolos.
        for (int i = 0; i < qtdDegraus; i++) {
            degraus.add(" ".repeat(qtdDegraus - i) + "*".repeat(i + 1));
        }
        // laço de repetição que imprime na tela de acordo com o que foi armazenado no
        // laço anterior
        for (String d : degraus) {
            System.out.println(d);
        }
    }
}