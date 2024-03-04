import java.util.ArrayList;
import java.util.List;
// Classe Aluno
class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Método para imprimir dados do aluno
    public void imprimirDados() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
    }
}

// Classe Disciplina
class Disciplina {
    private String nome;
    private String codigo;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Método para imprimir dados da disciplina
    public void imprimirDados() {
        System.out.println("Nome da Disciplina: " + nome);
        System.out.println("Código: " + codigo);
    }
}

// Classe Professor
class Professor {
    private String nome;
    private String departamento;

    public Professor(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Método para imprimir dados do professor
    public void imprimirDados() {
        System.out.println("Nome do Professor: " + nome);
        System.out.println("Departamento: " + departamento);
    }
}

// Classe Universidade
class Universidade {
    private String nome;
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Disciplina> disciplinas;

    public Universidade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<Aluno>();
        this.professores = new ArrayList<Professor>();
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    // Método para adicionar aluno
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Método para adicionar professor
    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    // Método para adicionar disciplina
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    // Método para imprimir dados da universidade
    public void imprimirDados() {
        System.out.println("Universidade: " + nome);
        System.out.println("\nAlunos:");
        for (Aluno aluno : alunos) {
            aluno.imprimirDados();
            System.out.println();
        }
        System.out.println("\nProfessores:");
        for (Professor professor : professores) {
            professor.imprimirDados();
            System.out.println();
        }
        System.out.println("\nDisciplinas:");
        for (Disciplina disciplina : disciplinas) {
            disciplina.imprimirDados();
            System.out.println();
        }
    }
}

// Classe principal Main
public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Aluno, Professor, Disciplina e Universidade
        Aluno aluno = new Aluno("Leticia", 89765);
        Professor professor = new Professor("Josiane", "Ciência da Computação");
        Disciplina disciplina = new Disciplina("Programação Java", "COMP123");
        Universidade universidade = new Universidade("Una");

        // Adicionando instâncias criadas à universidade
        universidade.adicionarAluno(aluno);
        universidade.adicionarProfessor(professor);
        universidade.adicionarDisciplina(disciplina);

        // Imprimindo dados da universidade
        universidade.imprimirDados();
    }
}
