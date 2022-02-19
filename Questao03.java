import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Questão 03
 */
public class Questao03 {

    public static void main(String[] args) {
        // Recebe input do usuário e guarda em uma substring, pois vamos precisar
        // quebrar a string em partes para análise.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        subString(input.nextLine());
    }

    // o método substring para manipulação das partes da string.
    static void subString(String palavra) {
        // criamos um mapa pois precisamos das coordenadas.
        HashMap<String, Integer> map = new HashMap<>();
        // laço de repetição para percorrer toda a string,
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i; j < palavra.length(); j++) {
                // e transformar a substring em um array de caracteres,
                char[] valC = palavra.substring(i, j + 1).toCharArray();
                // organizar em ordem alfabética,
                Arrays.sort(valC);
                // criar uma nova string com esses caracteres organizados,
                String val = new String(valC);
                // mapeia a string associando as chaves aos valores
                if (map.containsKey(val))
                    map.put(val, map.get(val) + 1);
                else
                    map.put(val, 1);
            }
        }
        // cria a variável que vai indicar a quantidade de anagramas
        int anagramPairCount = 0;
        // mapeia as coordenadas em busca de anagramas e guarda nas variáveis adequadas
        for (String key : map.keySet()) {
            int n = map.get(key);
            anagramPairCount += (n * (n - 1)) / 2;
        }
        // imprime a quantidade encontrada
        System.out.println(anagramPairCount);
    }
}