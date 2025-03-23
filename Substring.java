/*Crie um método iterativo que recebe uma string como parâmetro e
 retorna o comprimento da substring mais longa sem caracteres
  repetidos. Na saída padrão, para cada linha de entrada, escreva
   uma linha de saída com o comprimento da substring mais longa
    sem repetição. Por exemplo, se a entrada for abcabcbb, a 
    saída deve ser 3 (correspondendo à substring abc). */

import java.util.Scanner;

class Testar{
    public int t(String p){
        boolean[] v= new boolean[300];
        int count = 0;
        for(int a = 0; a < p.length(); a++){
            char c = p.charAt(a);
                if(!v[c]){
                    v[c] = true;
                    count++;
                }
        }
        return count;
    }
}
public class Substring {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Testar teste = new Testar();//chamada do objeto da classe criada
    String palavra;
    do{
        //System.out.println("Digite uma palavra: ");
        palavra = scanner.nextLine();
        System.out.println(teste.t(palavra));
    }
     while(!palavra.equals("FIM"));
    scanner.close();
}
}
