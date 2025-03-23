/* O Imperador Júlio César foi um dos principais nomes do Império Romano. Entre suas 
contribuições, temos um algoritmo de criptografia chamado ``Ciframento de César''. 
Segundo os historiadores, César utilizava esse algoritmo para criptografar as 
mensagens que enviava aos seus generais durante as batalhas. A ideia básica é um 
simples deslocamento de caracteres. Assim, por exemplo, se a chave utilizada para 
criptografar as mensagens for 3, todas as ocorrências do caractere 'a' são 
substituídas pelo caractere 'd', as do 'b' por 'e', e assim sucessivamente. 
Crie um método \textbf{recursivo} que recebe uma string como parâmetro e retorna 
outra contendo a entrada de forma cifrada. Neste exercício, suponha a chave de 
ciframento três. Na saída padrão, para cada linha de entrada, escreva uma linha com 
a mensagem criptografada. */

import java.util.Scanner;

class Testar{
    public String textbf(String p){
    if(p.length() == 0){
        return " ";
    } else{
        char c = (char) (p.charAt(0) +3);
        return c + textbf(p.substring(1));
    }
}
}
public class CiframentoR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Testar t = new Testar();
        String palavra;
        while(true){
            //System.out.println("Digite uma sequencia de caracteres: ");
            palavra = scanner.nextLine();
            if(palavra.equals("FIM")){ 
                break;
            } else{
                System.out.println(t.textbf(palavra));
            }
        }
        scanner.close();
    }
}
