package Model;

public abstract class PessoaIMC extends Pessoa{
    private double peso;
    private double altura;

    public PessoaIMC(){
        super();
    }

    public PessoaIMC(String nome, String dataNascimento, double peso, double altura){
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso(){
        return peso;
    }

    public double getAltura(){
        return altura;
    }

    public double calculaIMC(){
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    public abstract String resultIMC();

    @Override
    public String toString(){
        return "Nome: " + getNome() + "\n" + "Data de Nascimento: " + getDataNascimento() + "\n" + "Peso: " + getPeso() + "\n" + "Altura: " + getAltura();
    }
}
