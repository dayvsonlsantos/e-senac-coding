package Model;

public class Pessoa {
    private String nome;
    private String dataNascimento;

    public Pessoa(){
        super();
    }

    public Pessoa(String nome, String dataNascimento){
        super();
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\n" + "Data de Nascimento: "  + dataNascimento;
    }
}
