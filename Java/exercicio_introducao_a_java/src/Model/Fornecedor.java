package Model;

//1) Implemente em Java uma classe que represente um Fornecedor:
public class Fornecedor {
    private String cnpj;
    private String telefone;
    private String nome;

    public Fornecedor(){
        super();
    }

    public Fornecedor(String cnpj, String telefone, String nome){
        super();
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return " | Fornecedor: " + nome + " | CNPJ: " + cnpj + " | Telefone: " + telefone;
    }

}
