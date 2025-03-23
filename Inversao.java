/*Crie um método iterativo que recebe uma string como parâmetro e
 retorna a string invertida. Na saída padrão, para cada linha de
  entrada, escreva uma linha de saída com a string invertida. Por
   exemplo, se a entrada for abcde, a saída deve ser edcba. */

import java.util.Scanner;

class Testar{
    public String nova(String palavra){
        StringBuilder n = new StringBuilder();
        for(int i = palavra.length() - 1; i >= 0; i--){
            n.append(palavra.charAt(i));
        } 
        return n.toString();
    }
}

public class Inversao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Testar t = new Testar();
        String palavra;
        while(true){
            //System.out.println("Digite uma palavra");
            palavra = scanner.nextLine();
            if(palavra.equals("FIM")){
                break;
            } else{
                System.out.println(t.nova(palavra));
            }
        }
    scanner.close();
    }
}
