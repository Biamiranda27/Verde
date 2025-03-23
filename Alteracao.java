/*Crie um método iterativo que recebe uma string, sorteia duas letras minúsculas 
aleatórias (código ASCII ≥ 'a' e ≤ 'z'), substitui todas as ocorrências da primeira 
letra na string pela segunda e retorna a string com as alterações efetuadas. Na saída 
padrão, para cada linha de entrada, execute o método desenvolvido nesta questão e 
mostre a string retornada como uma linha de saída.
Abaixo, observamos um exemplo de entrada supondo que para a primeira linha as letras 
sorteadas foram 'a' e 'q'. Para a segunda linha, foram 'e' e 'k'. */

import java.util.Random;
import java.util.Scanner;

class Testar{
    public char nova(){
        Random gerador = new Random();
        gerador.setSeed(4);
        return (char)('a' + (Math.abs(gerador.nextInt()) % 26));
    }

    public String palavra(String frase, char n){
        Random gerador = new Random();
        gerador.setSeed(4);
        char letra =  (char)('a' + (Math.abs(gerador.nextInt()) % 26));
        return frase.replace(letra,n);
    }
}
public class Alteracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Testar teste = new Testar();
        String frase;
        while(true){
            //System.out.println("Digite uma frase: ");
            frase = scanner.nextLine();
            if(frase.equals("FIM")){ 
                break;
            } else{
                char a = teste.nova();
                System.out.println(teste.palavra(frase,a));
            }
        }
        scanner.close();
    } 
}
