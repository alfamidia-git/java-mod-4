# Interface Set
Assim como todas interface, não é possível que seja instanciada. Nós usamos suas implementações, dependendo do caso, e utilizamos seus métodos.
Suas implementações mais famosas são: HashSet, LinkedHashSet e TreeSet.

Veremos agora suas diferenças:

### HashSet
* Implementação baseada em uma tabela hash.
* Não permite elementos duplicados.
* Oferece um desempenho rápido para operações de inserção, remoção e pesquisa..
* Não mantém uma ordem específica dos elementos.
* Adequado para situações em que a ordem dos elementos não é importante, e a necessidade principal é evitar duplicatas.

### LinkedHashSet
* Uma extensão do HashSet.
* Mantém a ordem de inserção dos elementos usando uma lista ligada.
* Também não permite elementos duplicados.
* Combina as vantagens de um conjunto sem duplicatas com a capacidade de manter uma ordem previsível dos elementos.
* Útil quando você precisa de uma coleção com semântica de conjunto, mas também deseja manter a ordem de inserção.


### TreeSet
* Implementação baseada em uma árvore de pesquisa balanceada
* Os elementos são armazenados em ordem natural ou usando um comparador personalizado.
* Garante que os elementos estejam sempre em ordem, o que é útil para iterações ordenadas.
* Não permite elementos duplicados.
* Possui um desempenho ligeiramente mais lento em comparação com HashSet e LinkedHashSet, mas é eficiente para operações de busca e iteração ordenada.

## Quando utilizar cada um?
* **HashSet**: Use quando a ordem dos elementos não é importante e você precisa de rápida inserção, remoção e pesquisa. É uma escolha eficaz para eliminar duplicatas.

* **LinkedHashSet**: Escolha quando você deseja manter a ordem de inserção e também deseja evitar duplicatas. Pode ser útil para tarefas como remoção de duplicatas mantendo a ordem original.

* **TreeSet**: Opte por ele quando você precisa de uma coleção com elementos ordenados e exclusivos. Use especialmente quando é necessário iterar pelos elementos em ordem.


## Instanciando um objeto
```java
import java.util.Set;

public class AulaSet{
    public static void main(String[] args){
        Set<Integer> lista = new HashSet<>(); //instanciando um objeto Set
    }
}
```

## Set ou List. Qual devo utilizar?
A escolha entre usar uma List ou um Set depende das necessidades do seu projeto e das características dos dados que você está manipulando. A principal diferença entre eles está na capacidade de armazenar elementos duplicados:

**Utilize List quando**:
* A ordem dos elementos é importante.
* Você precisa acessar elementos por índice.
* Elementos duplicados são permitidos ou desejados.
* Não há necessidade de garantir que os elementos sejam exclusivos.

**Utilize Set quando**: 
* Elementos duplicados devem ser evitados.
* A ordem dos elementos não é crucial ou é manipulada por uma implementação específica (como LinkedHashSet).
* Apenas a presença ou ausência de um elemento é importante, sem se preocupar com contagem ou frequência.

## Principais métodos: 
**boolean add(E e)**: Adiciona o elemento especificado ao conjunto, se ele ainda não estiver presente. Retorna true se o elemento foi adicionado.

**boolean remove(Object o)**: Remove o elemento especificado do conjunto, se estiver presente. Retorna true se o elemento foi removido.

**boolean contains(Object o)**: Verifica se o conjunto contém o elemento especificado. Retorna true se o elemento estiver presente.

**int size()**: Retorna o número de elementos no conjunto.

**boolean isEmpty()**: Verifica se o conjunto está vazio.

**void clear()**: Remove todos os elementos do conjunto, deixando-o vazio.

**Iterator<E> iterator()**: Retorna um iterador sobre os elementos do conjunto.

**boolean addAll(Collection<? extends E> c)**: Adiciona todos os elementos da coleção especificada ao conjunto. Retorna true se o conjunto foi modificado.

**boolean removeAll(Collection<?> c)**: Remove todos os elementos do conjunto que estão contidos na coleção especificada. Retorna true se o conjunto foi modificado.

**boolean retainAll(Collection<?> c)**: Remove todos os elementos do conjunto que NÃO estão contidos na coleção especificada. Retorna true se o conjunto foi modificado.

**Object[] toArray()**: Retorna um array contendo todos os elementos do conjunto.

**<T> T[] toArray(T[] a)**: Retorna um array contendo todos os elementos do conjunto, usando o array fornecido se possível.

**boolean containsAll(Collection<?> c)**: Verifica se o conjunto contém todos os elementos da coleção especificada. Retorna true se todos os elementos estiverem presentes.


# Exercicio
1. Crie um programa Java que declare um conjunto de números usando a interface Set<Integer>.
2. Adicione alguns números ao conjunto, garantindo que não haja duplicatas.
3. Imprima o conjunto completo na tela.
4. Verifique se um número específico está presente no conjunto.
5. Remova um número do conjunto.
6. Imprima o conjunto novamente para mostrar a mudança.
7. Adicione mais números ao conjunto.
8. Crie uma cópia do conjunto original.
9. Use o método retainAll() para manter apenas os números presentes na cópia do conjunto.
10. Imprima o conjunto após a operação retainAll().
11. Limpe o conjunto, removendo todos os elementos.
12. Imprima o conjunto vazio para confirmar.