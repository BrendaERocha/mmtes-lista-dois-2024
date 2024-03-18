class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    // Construtor
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

// Classe principal Main
public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Pessoa
        Pessoa pessoa = new Pessoa("Aline", 20, "123.456.789-00");

        // Imprimindo os dados da pessoa
        System.out.println("Dados da Pessoa:");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Cpf: " + pessoa.getCpf());
    }
}
