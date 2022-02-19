
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Questão 02
 */
public class Questao02 {

    public static void main(String[] args) {
        // Recebe input do usuário e guarda em uma variável.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String password = input.nextLine();

        // cria variáveis para fazer a validação dos critérios
        int valid = 0;
        int num = 0;
        int up = 0;
        int lo = 0;
        int dig = 0;
        int sp = 0;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        // Cria um objeto para guardar a lista de caracteres especiais, e também uma
        // lista com os caracteres para comparação
        Character[] specialchar = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+' };
        ArrayList<Character> special = new ArrayList<Character>();
        special.addAll(Arrays.asList(specialchar));
        // Laço de repetição para converter a string em um array de caracteres, e cada
        // caractere será analisado individualmente se preenche os critérios
        for (char character : password.toCharArray()) {
            hasUpperCase = hasUpperCase || Character.isUpperCase(character);
            hasLowerCase = hasLowerCase || Character.isLowerCase(character);
            hasDigit = hasDigit || Character.isDigit(character);
            // laço para comparação com a lista de caracteres especiais
            for (Character search : special) {
                hasSpecial = hasSpecial || search.equals(character);
            }
        }
        // checa se a senha possui o número mínimo de caracteres (6) e se não,
        // acrescenta na variável de validação quantos caracteres são necessários para
        // que chegue no número mínimo (6).
        if (password.length() < 6) {
            num = (6 - password.length());
        }
        // Testes para checar se ao menos um caractere respeita cada um dos critérios, e
        // se não, atribui o valor de 1 na variável de validação
        if (hasUpperCase == false) {
            up = 1;
        }
        if (hasLowerCase == false) {
            lo = 1;
        }
        if (hasDigit == false) {
            dig = 1;
        }
        if (hasSpecial == false) {
            sp = 1;
        }
        // Ao final, faz a contagem e atribui na variável de validação adequada
        valid = up + lo + dig + sp;
        // checa se o número de caracteres necessários para que a senha respeite todos
        // os critérios é maior que o número mínimo (no caso: 6), se o input for menor
        // que o número mínimo (6).
        if (valid > num) {
            // se sim, imprime o número de caracteres que necessita acrescentar para que a
            // senha seja validada
            System.out.println(valid);
        } else {
            // senão, imprime apenas a quantidade de caracteres que precisa para chegar no
            // número mínimo necessário (6)
            System.out.println(num);
        }

        return;
    }

}
