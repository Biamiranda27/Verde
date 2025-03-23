/* Crie um método iterativo que recebe uma string como parâmetro 
e retorna o número de palavras na string. Uma palavra é definida 
como uma sequência de caracteres separada por espaços. Na saída 
padrão, para cada linha de entrada, escreva uma linha de saída 
com o número de palavras. Por exemplo, se a entrada for 
Hello world, a saída deve ser 2 */

import java.util.Scanner;

class Testar{
    public int contar(String frase){
        int count = 1;
        for(int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
                if(c == ' '){
                    count ++;
                }
            }
        return count;
    }
}
public class Contagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Testar t = new Testar();
        String frase;
        while(true){
           //System.out.println("Digite uma frase: ");
            frase = scanner.nextLine();
            if(frase.equals("FIM")){
                break;
            } else{
                System.out.println(t.contar(frase));
            }
        }
        scanner.close();
    }
}
