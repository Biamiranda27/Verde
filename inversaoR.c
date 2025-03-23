/*Crie um método recursivo que recebe uma string como parâmetro e
 retorna a string invertida. Na saída padrão, para cada linha de
  entrada, escreva uma linha de saída com a string invertida. Por
   exemplo, se a entrada for abcde, a saída deve ser edcba. */

#include<stdio.h>
#include<string.h>

     void nova(char *palavra, int inicio, int final){
        if(inicio >= final){
            return;
        } else{
        char p = palavra[inicio];
        palavra[inicio] = palavra[final];
        palavra[final] = p;
        nova(palavra, inicio+1, final-1);
    }

}
int main(){
        char palavra[300];
        while(1){
            //printf("Digite uma palavra");
            scanf("%s", palavra);
            if(strcmp(palavra, "FIM") == 0){
                break;
            } else{
                nova(palavra, 0, strlen(palavra)-1);
                printf("%s\n", palavra);
            }
        }
    }

