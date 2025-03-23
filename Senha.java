/*Crie um método iterativo que recebe uma string como parâmetro e
 retorna true se a string é uma senha válida, ou false caso 
 contrário. Uma senha é considerada válida se contém pelo menos 8
  caracteres, incluindo pelo menos uma letra maiúscula, uma letra
   minúscula, um número e um caractere especial
   (por exemplo, !, @, #, etc.). Na saída padrão, para cada linha
    de entrada, escreva uma linha de saída com SIM/NÃO indicando 
    se a senha é válida. Por exemplo, se a entrada for Senha123!s,
     a saída deve ser SIM */

import java.util.Scanner;

class Testar{
    public boolean teste(String p){
        boolean maiuscula = false, minuscula = false, numero = false, especial = false;
        if(p.length() >= 8){
            for(int i = 0; i < p.length(); i++){
             char c = p.charAt(i);
             if(Character.isUpperCase(c)){
                maiuscula =  true;
             }  else if(Character.isLowerCase(c)){
                minuscula = true;
             } else if(Character.isDigit(c)){
                numero = true;
             } else if("!@#$%&*()-_=+[]{}|;:,.<>?/".indexOf(c) != -1){
                especial = true;
             }
    } 
}
    return maiuscula && minuscula && numero && especial;
   }
}
public class Senha {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Testar t = new Testar();
         String palavra;
         while(true){
             // System.out.println("digite uma senha");
              palavra = scanner.nextLine(); //metodo para ler string
              if(palavra.equals("FIM")){ 
                  break;
              } else if(t.teste(palavra)){
                  System.out.println("SIM");
              } else {
                System.out.println("NAO");;
              }
          }  scanner.close();
         }
        }
    
    

