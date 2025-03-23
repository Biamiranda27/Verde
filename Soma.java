/*Crie um método recursivo que recebe um número inteiro como 
parâmetro e retorna a soma de seus dígitos. Na saída padrão, 
para cada linha de entrada, escreva uma linha de saída com o 
resultado da soma dos dígitos. Por exemplo, se a entrada for 
12345, a saída deve ser 15. */

import java.util.Scanner;
class Soma1{
    public int s(int n){
        if(n == 0){
            return 0;
        } else{
            return n %10 + s(n/10);
        }
    }
}

public class Soma {
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    //Soma soma = new Soma();
//String n;
 Integer n = null;
System.out.println(String.valueOf(n));
     
    scanner.close();
   }

}
