package Model;

import java.util.Date;

public class ContaCorrente extends Conta{ //ContaCorrente Herda de Conta

    private double taxaManutencao;

    //Polimorfismo de sobrecarga, pois existe dois métodos fazendo a mesma coisa. Iniciando o mesmo objeto;
    public ContaCorrente (){ //Construtor vazio inicializando o objeto
        super();
    }

    public ContaCorrente(Cliente cliente, int numero, Agencia ag, Date dataCriacao, double saldo, double limite, double taxaManutencao) {//Construtor vazio inicializando o objeto
        super(cliente, numero, ag, dataCriacao, saldo, limite);
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    @Override //Polimorfismo de sobrescrita
    public boolean sacar(double valor){
        valor += valor*this.taxaManutencao;
        return super.sacar(valor); //O super indica que é o sacar do pai, pois vem de conta.java
    }

}
