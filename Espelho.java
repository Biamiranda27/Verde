/*Imprimir números em sequência é uma tarefa relativamente simples. Mas e quando se trata de uma sequência espelho? Essa é uma sequência 
que possui um número inicial e um número final, e todos os números entre eles, inclusive, são dispostos em ordem crescente, sem espaços, 
e então essa sequência é refletida de forma invertida, como um reflexo no espelho. Por exemplo, se a sequência for de 7 a 12, o resultado 
seria 789101112211101987. Escreva um programa que, dados dois números inteiros, imprima a respectiva sequência espelho. */

import java.util.*;

class Testar {
    public void result(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
        }
        for (int i = num2; i >= num1; i--) {
            System.out.print(i);
        }
        System.out.println(); 
    }
}

public class Espelho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Testar teste = new Testar();
        int num1, num2;

        while (true) {
            if (scanner.hasNextInt()) {
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                if (num1 == 0 || num2 == 0) {
                    break;
                }
                if (num1 > num2) {
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                }
                teste.result(num1, num2);
            } else {
                break;
            }
        }
        scanner.close();
    }
}
