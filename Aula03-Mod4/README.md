# Interface List
Assim como todas interface, não é possível que seja instanciada. Nós usamos suas implementações, dependendo do caso, e utilizamos seus métodos.
Suas implementações mais famosas são: ArrayList, LinkedList e Vector.

Veremos agora suas diferenças:

### ArrayList
* Implementação baseada em arrays dinâmicos.
* Acesso rápido aos elementos por índice.
* Ideal para leitura e acesso aleatório, mas a inserção/remoção de elementos no meio pode ser lenta.
* Boa escolha quando você precisa de uma lista onde a maioria das operações é leitura e acesso por * índice.
* Boa performance para iterações e pesquisas.
* Não é sincronizado (não é thread-safe).

OBS: "Thread-safe" é um termo usado na programação para descrever um código, uma estrutura de dados ou um sistema que pode ser usado simultaneamente por várias threads sem causar problemas como inconsistências de dados, corrupção de memória ou comportamento inesperado.

### LinkedList
* Implementação baseada em nós ligados.
* Inserção/remoção de elementos é rápida em comparação com ArrayList, especialmente no início/meio da lista.
* Acesso mais lento aos elementos por índice, pois requer percorrer a lista.
* Bons para casos em que você precisa frequentemente adicionar ou remover elementos.
* Pode ser usado como uma fila (FIFO) ou pilha (LIFO) facilmente.
* Não é sincronizado (não é thread-safe).


### LinkedList
* Implementação baseada em nós ligados.
* Inserção/remoção de elementos é rápida em comparação com ArrayList, especialmente no início/meio da lista.
* Acesso mais lento aos elementos por índice, pois requer percorrer a lista.
* Bons para casos em que você precisa frequentemente adicionar ou remover elementos.
* Pode ser usado como uma fila (FIFO) ou pilha (LIFO) facilmente.
* Não é sincronizado (não é thread-safe).

### Vector
* Uma das primeiras implementações de listas do Java (pré-Java 2).
* Semelhante ao ArrayList, mas é sincronizado (thread-safe), o que o torna mais lento em ambientes concorrentes.
* Geralmente não é a escolha preferencial em cenários modernos devido à sua sincronização e ao desempenho inferior ao do ArrayList.

## Quando utilizar cada um?
* **ArrayList**: Use quando precisa de acesso rápido por índice e quando as operações de inserção/remoção são menos frequentes ou ocorrem principalmente no final da lista. É uma escolha sólida para listas onde a ordem dos elementos importa e há muita leitura/iteração.

* **LinkedList**: Use quando você precisa frequentemente adicionar ou remover elementos, especialmente no início/meio da lista. É uma boa opção para filas ou pilhas também.

* **Vector**: Em geral, evite usar Vector em cenários modernos, a menos que você precise de sincronização explícita para ambientes multi-thread.


## Instanciando um objeto
```java
import java.util.List;

public class AulaList{
    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>(); //instanciando um objeto List
    }
}
```

## Principais métodos: 
**int size()**: Retorna o número de elementos na lista.

**boolean isEmpty()**: Verifica se a lista está vazia.

**boolean contains(Object o)**: Verifica se a lista contém o elemento especificado.

**boolean add(E e)**: Adiciona um elemento no final da lista.

**boolean remove(Object o)**: Remove a primeira ocorrência do elemento especificado na lista.

**E get(int index)**: Retorna o elemento na posição especificada.

**E set(int index, E element)**: Substitui o elemento na posição especificada pelo elemento fornecido.

**void add(int index, E element)**: Insere o elemento na posição especificada, deslocando os elementos subsequentes.

**E remove(int index)**: Remove e retorna o elemento na posição especificada.

**int indexOf(Object o)**: Retorna o índice da primeira ocorrência do elemento especificado, ou -1 se não estiver presente.

**int lastIndexOf(Object o)**: Retorna o índice da última ocorrência do elemento especificado, ou -1 se não estiver presente.

**List<E> subList(int fromIndex, int toIndex)**: Retorna uma sublista contendo elementos do intervalo de índices especificado.

**void sort(Comparator<? super E> c)**: Ordena a lista de acordo com o comparador fornecido.

**void clear()**: Remove todos os elementos da lista.

**boolean addAll(Collection<? extends E> c)**: Adiciona todos os elementos da coleção especificada no final da lista.

**boolean removeAll(Collection<?> c)**: Remove todos os elementos da lista que estão contidos na coleção especificada.

**boolean retainAll(Collection<?> c)**: Remove todos os elementos da lista que NÃO estão contidos na coleção especificada.

**Object[] toArray()**: Retorna um array contendo todos os elementos da lista.


# Exercicio
1. Crie um programa Java que declare uma lista de nomes usando a interface List<String>.
2. Adicione alguns nomes à lista.
3. Imprima a lista completa na tela.
4. Verifique se um nome específico está presente na lista.
5. Remova um nome da lista.
6. Imprima a lista novamente para mostrar a mudança.
7. Ordene a lista em ordem alfabética.
8. Imprima a lista ordenada.
9. Crie uma sublista contendo apenas alguns dos nomes.
10. Imprima a sublista.
11. Limpe a lista, removendo todos os elementos.
12. Imprima a lista vazia para confirmar.