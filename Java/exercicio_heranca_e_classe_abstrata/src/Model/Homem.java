package Model;

public class Homem extends PessoaIMC{

    public Homem(String nome, String dataNascimento, double peso, double altura){
        super(nome, dataNascimento, peso, altura);
    }
    @Override
    public String resultIMC(){
        double imc = calculaIMC();
        String retorno = "\n";

        if (imc < 20.7) {
            retorno += "IMC(" + imc + "): Abaixo do peso Ideal";
        } else if (imc >= 20.7 && imc < 26.4) {
            retorno += "IMC(" + imc + "): Peso Ideal";
        }else if (imc >= 26.4) {
            retorno += "IMC(" + imc + "): Acima do peso Ideal";
        }
        return retorno;
    }
}
