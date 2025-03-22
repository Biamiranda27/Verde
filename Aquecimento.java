/*Crie um método iterativo em Java que receba como parâmetro uma string e retorne seu número de caracteres maiúsculos. Em seguida, 
teste o método anterior usando redirecionamento de entrada e saída. A entrada padrão é composta por várias linhas sendo que a última 
contém a palavra FIM. A saída padrão contém um número inteiro para cada linha de entrada. */

import java.util.*;

class Testar{
    public int count(String palavra){
        int quant = 0;
        for(int i = 0; i < palavra.length(); i++){
            if(Character.isUpperCase(palavra.charAt(i))){
                quant++;
            }
        }
        return quant;
    }
}
public class Aquecimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Testar teste = new Testar();
        String palavra;
        while(true){
           // System.out.println("Digite uma palavra: ");
            palavra = scanner.nextLine();
            if(palavra.equals("FIM")){
                break;
            } else{
                int tam = teste.count(palavra);
                System.out.println(tam);
            }
        }
        scanner.close();
    }
}
