/*Crie um método iterativo em C que receba como parâmetro uma string e retorne seu número de caracteres maiúsculos. Em seguida, 
teste o método anterior usando redirecionamento de entrada e saída. A entrada padrão é composta por várias linhas sendo que a última 
contém a palavra FIM. A saída padrão contém um número inteiro para cada linha de entrada.*/

#include<stdio.h>
#include<ctype.h>
#include<string.h>

int maiusculas(char *string){
    int tam = strlen(string), count = 0;
    for(int i = 0; i < tam; i++){
        if(isupper(string[i])){
            count++;
        }
    }
    return count;
}
int main(){
    char string[100];
    while(1){
   // printf("Digite uma string: ");
    fgets(string, sizeof(string), stdin);
    string[strcspn(string, "\n")] = '\0';
    if(strcmp(string, "FIM") == 0){
        break;
    } 
        int quant = maiusculas(string);
        printf("%d\n", quant);
    }
}