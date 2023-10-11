# Arrays
array é uma estrutura de dados que permite armazenar uma coleção de elementos do mesmo tipo em uma única variável. Os arrays são utilizados para organizar e acessar dados de forma eficiente, pois permitem o acesso direto aos elementos através de índices. 

 Para declarar um array em JAVA, é necessário especificar o tipo dos elementos que ele irá conter, seguido pelos colchetes que indicam que se trata de um array.
```java
public class Arrays{
    public static void main(String[] args){
        int[] array = new int[5]; //aqui estamos criando um array de 5 posições
    }
}
```
É importante lembrar que os índices em JAVA começam a partir de 0.
|0|1|2|3|4|
-|-|-|-|-|

Então, se atribuirmos valores para cada uma das posições, ficaria assim:
```java
public class Arrays{
    public static void main(String[] args){
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
    }
}
```
|0|1|2|3|4|
-|-|-|-|-|
10|20|30|40|50|

Também é possível iniciar o Array com todos seus valores:
```java
public class Arrays{
    public static void main(String[] args){
        int[] array = {10, 20, 30, 40, 50};
    }
}
```

E o resultado será o mesmo:
|0|1|2|3|4|
-|-|-|-|-|
10|20|30|40|50|

## Matriz
As matrizes em programação são estruturas de dados multidimensionais que permitem armazenar elementos em uma grade ou tabela organizada em linhas e colunas. Em JAVA, as matrizes são usadas para representar conjuntos de dados bidimensionais, tridimensionais ou mesmo com mais dimensões.

Assim é a declaração de um array bidimensional:
```java
public class Arrays{
    public static void main(String[] args){
        int[][] matriz = new int[3][4];

        matriz[0][0] = 10
        matriz[1][0] = 100;
        matriz[2][0] = 1000;

        matriz[0][1] = 20;
        matriz[1][1] = 200;
        matriz[2][1] = 2000;

        matriz[0][2] = 30;
        matriz[1][2] = 300;
        matriz[2][2] = 3000;

        matriz[0][3] = 40;
        matriz[1][3] = 400;
        matriz[2][3] = 4000;
    }
}
```
Neste exemplo acima, acabamos de criar um array com 3 linhas e 4 colunas.

|-     | 0   | 1   | 2   | 3   |
|:----:|-----|-----|-----|-----|
|**0**|  10  | 20  | 30  | 40  |
|**1**| 100  | 200 | 300 | 400 |
|**2**| 1000 | 2000| 3000| 4000|


Podemos ver isso no Java com este código que percorre toda nossa matriz:
``` java
    for (int i = 0; i < matriz.length; i++) {
        // Loop para percorrer as colunas
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
    }
    // Quebra de linha após cada linha da matriz
    System.out.println();
    }
```

## Exercicio

Utilizando um array ou matriz bidimensional, crie um jogo da velha. 

|     |     |     |
|-----|-----|-----|
|  1  | 2  | 3  |
| 4  | 5 | 6 |
| 7 | 8| 9 |

No inicio o jogo deverá aparecer desta forma. 
Se o jogador 1 digitar 5 e o jogador 2 digitar 1. Deverá ficar assim:

|     |     |     |
|-----|-----|-----|
|  O  | 2  | 3  |
| 4  | X | 6 |
| 7 | 8| 9 |

Ao final do jogo imprimir quem foi o vencedor ou se deu velha.