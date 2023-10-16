## DESAFIO FINAL DO MÓDULO
Com base em todo conteúdo visto nas aulas anteriores, você precisará desenvolver um...

### Sistema de Gerenciamento de Biblioteca
Neste desafio, seu foco principal é gerenciar uma lista de livros e suas categorias usando as estruturas de Collections.

#### Vamos ao desafio:
1. Crie uma classe **Livro** com os seguintes
**atributos**
    * título (String).
    * autor (String).
    * categoria (String).
**métodos** 
    * Construtor com todos os parâmetros.
    * Métodos getters e setters.
    * Método 'exibirDetalhes()' que retorna uma String.
2. Crie uma classe **Biblioteca**:
**atributos**
    * acervo (List< Livro>).
    * categorias (Set< String>).
**métodos** 
    * **adicionarLivro(Livro livro)**: para adicionar um livro na lista e sua categoria no conjunto.
    * **removerLivro(Livro livro)**: para remover um livro.
    * **listLivros(Livro livro)**: para listar todos os livros.
    * **listarCategorias()**: para listar todas as categorias de livros distintas.
    * **buscarPorCategoria(String categoria)**: para listar todos os livros de uma categoria 
6. Na classe Principal:
    * Instancie livros.
    * Crie uma instância da biblioteca.
    * Adicione os livros à biblioteca.
    * Liste todos os livros.
    * Liste todas as categorias.
    * Busque livros de uma categoria específica.