import java.util.*;
public class Curso {

    private String nome;

    private String professor;

    private List<String> disciplinas;

    private Map<Integer, String> alunos;

    public Curso(String nome, String professor){
        this.nome = nome;
        this.professor = professor;

        this.disciplinas = new ArrayList<>();
        this.alunos = new HashMap<>();
    }

    public void adicionarDisciplina(String disciplina){
       boolean adicionou = this.disciplinas.add(disciplina);

       if(adicionou){
           System.out.println("Disciplina adicionada com sucesso!");
       }else {
           System.out.println("Não foi possível adicionar a disciplina.");
       }
    }

    public void removerDisciplina(String disciplina){
        boolean removeu = this.disciplinas.remove(disciplina);

        if(removeu){
            System.out.println("Disciplina removida com sucesso!");
        }else{
            System.out.println("Não foi possível remover esta disciplina");
        }
    }

    public boolean verificarMatricula(int matricula){
        return this.alunos.containsKey(matricula);
    }

    public void adicionarAluno(int matricula, String nome){
        if(this.verificarMatricula(matricula)){
            System.out.println("Aluno já matriculado!");
            return;
        }

        this.alunos.put(matricula, nome);
    }

    public void removerAluno(int matricula){
        if(!this.verificarMatricula(matricula)){
            System.out.println("Aluno não matriculado!");
            return;
        }

        this.alunos.remove(matricula);
    }


    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                ", disciplinas=" + disciplinas +
                ", alunos=" + alunos +
                '}';
    }
}
