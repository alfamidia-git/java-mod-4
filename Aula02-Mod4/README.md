# Collections
Veremos a partir de agora um dos aspectos mais fundamentais e poderosos da linguagem de programação Java: as coleções. As coleções formam a base para manipular e organizar conjuntos de elementos de maneira eficiente e flexível, permitindo que os programadores enfrentem uma variedade de desafios de desenvolvimento de software.

## O que são coleções?
Coleções em Java referem-se a um conjunto de classes e interfaces que permitem armazenar, organizar e manipular grupos de objetos. Elas fornecem estruturas de dados flexíveis para lidar com diferentes tipos de informações, desde listas ordenadas até conjuntos que garantem a unicidade dos elementos.
As principais interfaces de coleções em Java estão contidas no pacote java.util. Algumas das interfaces mais importantes incluem:

1. **List**: Interface que define uma sequência ordenada de elementos, onde os elementos podem ser duplicados. Implementações comuns incluem ArrayList, LinkedList e Vector.
2. **Set**: Interface que define um conjunto de elementos únicos, sem duplicatas. Implementações incluem HashSet, LinkedHashSet e TreeSet.
3. **Queue**: Interface que representa uma fila, onde os elementos são inseridos no final e removidos do início. Implementações incluem LinkedList e PriorityQueue.
4. **Map**: Interface que mapeia chaves para valores, onde as chaves são exclusivas. Implementações incluem HashMap, LinkedHashMap e TreeMap.

Além das interfaces, Java também fornece classes utilitárias como **Arrays** e **Collections** que oferecem métodos auxiliares para trabalhar com coleções. Essas classes incluem operações para ordenação, inversão, pesquisa e muito mais.

```java
import java.util.List;

public class AulaList{
    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>(); //instanciando um objeto List
    }
}
```

