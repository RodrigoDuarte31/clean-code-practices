#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
#define LIN 2
#define COL 2

void somaMatriz(int mat[LIN][COL]) {
    int soma = 0;
    for(int i = 0; i < LIN; i++){
        for(int j = 0; j < COL; j++){
            soma += mat[i][j];
        }
    }
    printf("Soma de todos os elementos da matriz: %d", soma);
}

void somaDiagonalPrincipal(int mat[LIN][COL]) {
    int soma = 0;
    for(int i = 0; i < LIN; i++){
        for(int j = 0; j < COL; j++){
            if(i == j){
                soma += mat[i][j];
            }
        }
    }
    printf("Soma dos elementos da diagonal principal: %d", soma);
}

void somaDiagonalSecundaria(int mat[LIN][COL]) {
    int soma = 0;
    for(int i = 0; i < LIN; i++){
        for(int j = 0; j < COL; j++){
            if(i + j == LIN - 1){
                soma += mat[i][j];
            }
        }
    }
    printf("Soma de todos os elementos da diagonal secundaria: %d", soma);
}

int main(){

    setlocale(LC_ALL, "Portuguese");

    int mat[LIN][COL], ref;

    for(int i = 0; i < LIN; i++){
        for(int j = 0; j < COL; j++){
            printf("Informe o elemento %dx%d da matriz: ", i, j);
            scanf("%d", &mat[i][j]);
        }
    }

    printf("\nInforme um valor de referência: ");
    printf("\n1 - Soma dos elementos da matriz");
    printf("\n2 - Soma dos elementos da diagonal principal");
    printf("\n3 - Soma dos elementos da diagonal secundaria\n");
    scanf("%d", &ref);

    switch(ref) {
        case 1:
            somaMatriz(mat);
            break;
        case 2:
            somaDiagonalPrincipal(mat);
            break;
        case 3:
            somaDiagonalSecundaria(mat);
            break;
        default:
            printf("Entrada invalida");
    }

    return 0;

}
