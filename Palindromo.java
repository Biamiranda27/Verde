/*Crie um método iterativo que recebe uma string como parâmetro e retorna true se 
essa é um ``Palíndromo''. Na saída padrão, para cada linha de entrada, escreva uma 
linha de saída com SIM/NÃO indicando se a linha é um palíndromo. Destaca-se que uma 
linha de entrada pode ter caracteres não letras. */

import java.util.Scanner;

class Testar{
    public boolean p(String pal){
        for(int i = 0; i < pal.length()/2; i++){
                if(pal.charAt(i) != pal.charAt(pal.length() - i - 1)){
                    return false;
            }
        }
         return true;
        }
}
public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Testar a = new Testar();
        String palavra;
        while(true){
            // System.out.println("digite uma palavra");
             palavra = scanner.nextLine(); //metodo para ler string
             if(palavra.equals("FIM")){ 
                 break;
             } else if(a.p(palavra)){
                 System.out.println("SIM");
             } else {
               System.out.println("NAO");;
             }
         }  scanner.close();
    }
}
