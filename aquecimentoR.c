/*Crie um método recursivo em C que receba como parâmetro uma string e retorne seu número de caracteres maiúsculos. Em seguida, 
teste o método anterior usando redirecionamento de entrada e saída. A entrada padrão é composta por várias linhas sendo que a última 
contém a palavra FIM. A saída padrão contém um número inteiro para cada linha de entrada.*/

#include<stdio.h>
#include<ctype.h>
#include<string.h>

int maiusculas(char *string, int index){
    if(index == strlen(string)){
        return 0;
    }
    if(isupper(string[index])){
        return 1 + maiusculas(string, index+1);
    }
    return maiusculas(string, index+1);
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
        int quant = maiusculas(string, 0);
        printf("%d\n", quant);
    }
}