# Interface Map
Assim como todas interfaces, a Map não pode ser instanciada diretamente. Em vez disso, usamos suas implementações conforme a necessidade, aproveitando seus métodos. Suas implementações mais famosas são: HashMap, LinkedHashMap e TreeMap.

Vamos explorar suas diferenças:

### HashMap
* Implementação baseada em uma tabela hash.
* Não permite chaves duplicadas, mas permite múltiplos valores nulos.
* Oferece um desempenho rápido para operações de inserção, remoção e pesquisa.
* Não garante uma ordem específica das entradas.
* Apropriado para situações em que a ordem dos elementos não é importante.

### LinkedHashMap
* Uma extensão do HashMap.
* Mantém a ordem de inserção das entradas usando uma lista ligada.
* Não permite chaves duplicadas.
* Combina a vantagem de acesso rápido com a capacidade de manter uma ordem previsível das entradas.
* Útil quando a ordem de inserção das entradas é significativa.

### TreeMap
* Implementação baseada em uma árvore de pesquisa balanceada.
* As chaves são armazenadas em ordem natural ou usando um comparador personalizado.
* Garante que as chaves estejam sempre em ordem, o que é útil para iterações ordenadas.
* Não permite chaves duplicadas.
* Oferece um desempenho eficiente para operações de busca e iteração ordenada, embora possa ser mais lento em comparação com HashMap e LinkedHashMap para operações de inserção e remoção.

## Quando utilizar cada um?
* **HashMap**: Use quando a ordem das entradas não é importante, e você precisa de acesso e inserção rápidos. Ideal para armazenamento chave-valor onde a ordem não é crucial.

* **LinkedHashMap**: Opte por ele quando a ordem de inserção das entradas é importante e também deseja um acesso rápido.

* **TreeMap**: Escolha quando você precisa de uma estrutura chave-valor com chaves ordenadas, seja em sua ordem natural ou por um comparador personalizado.

## Instanciando um objeto
```java
import java.util.Map;

public class AulaMap {
    public static void main(String[] args){
        Map<Integer, String> mapa = new HashMap<>(); // instanciando um objeto Map
    }
}
```

### Quando devo utilizar?
A escolha quando usar um Map ou depende das necessidades do seu projeto e das características dos dados que você está manipulando.

**Utilize Map quando:**

* Há uma relação chave-valor nos dados.
* As chaves devem ser únicas.
* Você deseja acessar ou modificar valores com base em suas chaves.

### Principais métodos:
**V put(K key, V value)**: Associa a chave especificada ao valor especificado.

**V get(Object key)**: Retorna o valor ao qual a chave especificada está mapeada.

**V remove(Object key)**: Remove a entrada com a chave especificada.

**boolean containsKey(Object key)**: Verifica se o mapa contém uma entrada para a chave especificada.

**boolean containsValue(Object value)**: Verifica se o mapa mapeia uma ou mais chaves para o valor especificado.

**int size()**: Retorna o número de entradas no mapa.

**boolean isEmpty()**: Verifica se o mapa está vazio.

**void clear()**: Remove todas as entradas do mapa.

**Set<K> keySet()**: Retorna um conjunto das chaves contidas neste mapa.

**Collection<V> values()**: Retorna uma coleção das valores contidos neste mapa.

**Set<Map.Entry<K, V>> entrySet()**: Retorna um conjunto das entradas contidas neste mapa.

# Exercicio
1. Crie uma classe **Curso**, com os seguintes atributos: nome, professor, disciplinas e alunos. 
2. Crie métodos para adicionar e remover disciplinas.
3. Crie métodos para adicionar aluno, verificar se aluno já está matriculado e remover aluno.
4. Na classe Principal, Crie um Objeto Curso que receba no construtor o nome do curso e o professor.
5. Depois adicione 3 disciplinas neste curso.
6. Adicione 4 alunos neste curso. 
7. Verifique se um aluno já está cadastrado com o método criado anteriormente.
8. Imprimir detalhe da turma. 
9. Remova uma disciplina.
10. Remova um aluno.
11. Imprimir detalhe da turma.