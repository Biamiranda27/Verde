/*Crie um método iterativo que recebe uma string como parâmetro e retorna true se 
essa é um ``Palíndromo''. Na saída padrão, para cada linha de entrada, escreva uma 
linha de saída com SIM/NÃO indicando se a linha é um palíndromo. Destaca-se que uma 
linha de entrada pode ter caracteres não letras. */

#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool p(char* pal) {
    int length = strlen(pal);
    for (int i = 0; i < length / 2; i++) {
        if (pal[i] != pal[length - i - 1]) {
            return false;
        }
    }
    return true;
}
int main() {
    char palavra[100];
    while (1) {
        fgets(palavra, sizeof(palavra), stdin);
        palavra[strcspn(palavra, "\n")] = 0;
        if (strcmp(palavra, "FIM") == 0) {
            break;
        } else if (p(palavra)) {
            printf("SIM\n");
        } else {
            printf("NAO\n");
        }
    }
}
