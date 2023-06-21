package Model;

public class Mulher extends PessoaIMC{
    public Mulher(String nome, String dataNascimento, double peso, double altura){
        super(nome, dataNascimento, peso, altura);
    }

    @Override
    public String resultIMC(){
        double imc = calculaIMC();
        String retorno = "\n";

        if (imc < 19) {
            retorno += "IMC(" + imc + "): Abaixo do peso Ideal";
        } else if (imc >= 19 && imc < 25.8) {
            retorno += "IMC(" + imc + "): Peso Ideal";
        }else if (imc >= 25.8) {
            retorno += "IMC(" + imc + "): Acima do peso Ideal";
        }
        return retorno;
    }
}
