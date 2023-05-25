package Model;

import java.util.Date;

public class ContaPoupanca extends Conta{

    private double taxaRendimento;

    //Polimorfismo de sobrecarga, pois existe dois métodos fazendo a mesma coisa. Iniciando o mesmo objeto;
        //Também pode haver sobrecarga de construtores;
    public ContaPoupanca (){ //Construtor vazio inicializando o objeto
        super(); //Boas práticas
    }

    public ContaPoupanca(Cliente cliente, int numero, Agencia ag, Date dataCriacao, double saldo, double limite, double taxaRendimento) {//Construtor vazio inicializando o objeto
        super(cliente, numero, ag, dataCriacao, saldo, limite);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public boolean depositar(double valor){
        valor += valor*this.taxaRendimento;
        return super.depositar(valor);
    }

}
