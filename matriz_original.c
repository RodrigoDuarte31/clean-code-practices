#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
#define LIN 2
#define COL 2

void calcMatriz(int mat[LIN][COL], int ref){

    int i, j, soma = 0;

    switch(ref){
        case 1:
            for(i = 0; i < LIN; i++){
                for(j = 0; j < COL; j++){
                    soma += mat[i][j];
                }
            }
            printf("Soma de todos os elementos da matriz: %d", soma);
        break;

        case 2:
            for(i = 0; i < LIN; i++){
                for(j = 0; j < COL; j++){
                    if(i == j){
                        soma += mat[i][j];
                    }
                }
            }
            printf("Soma dos elementos da diagonal principal: %d", soma);
        break;

        case 3:
            for(i = 0; i < LIN; i++){
                for(j = 0; j < COL; j++){
                    if(i + j == LIN - 1){
                        soma += mat[i][j];
                    }
                }
            }
            printf("Soma de todos os elementos da diagonal secundaria: %d", soma);
        break;

        default:
            printf("Valor de referencia invalido");
    }

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

    calcMatriz(mat, ref);

    return 0;

}
