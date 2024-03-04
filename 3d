class Animal {
    private int id;
    private String tipo;
    private String habitat;

    // Construtor
    public Animal(int id, String tipo, String habitat) {
        this.id = id;
        this.tipo = tipo;
        this.habitat = habitat;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

// Classe Cachorro que herda de Animal
class Cachorro extends Animal {
    private String nome;
    private String raca;
    private int idade;

    // Construtor
    public Cachorro(int id, String tipo, String habitat, String nome, String raca, int idade) {
        super(id, tipo, habitat);
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

// Classe principal Main
public class Main {
    public static void main(String[] args) {
        // Criando uma instância de Cachorro
        Cachorro cachorro = new Cachorro(1, "Doméstico", "Terrestre", "Thor", "Pastor Alemão", 1);

        // Imprimindo os dados do cachorro
        System.out.println("Dados do Cachorro:");
        System.out.println("ID: " + cachorro.getId());
        System.out.println("Tipo: " + cachorro.getTipo());
        System.out.println("Habitat: " + cachorro.getHabitat());
        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getRaca());
        System.out.println("Idade: " + cachorro.getIdade());
    }
}
