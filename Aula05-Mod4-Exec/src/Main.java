
public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso("Java", "Marlon");

        curso.adicionarDisciplina("Orientação objetos");
        curso.adicionarDisciplina("Collections");
        curso.adicionarDisciplina("Streams");

        curso.adicionarAluno(2020, "Fulano");
        curso.adicionarAluno(2021, "Beltrano");
        curso.adicionarAluno(2022, "Maria");
        curso.adicionarAluno(2023, "Ana");

        System.out.println(curso);

        boolean matriculado = curso.verificarMatricula(2024);

        System.out.println("A matricula 2024 está matriculada? " + matriculado);

        curso.removerAluno(2020);
        curso.removerDisciplina("streams");
        curso.removerDisciplina("Streams");

        System.out.println(curso);
    }
}