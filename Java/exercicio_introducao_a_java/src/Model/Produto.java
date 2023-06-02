package Model;

//2) Implemente em Java uma classe que represente um Produto:

import java.util.ArrayList;
import java.util.List;
public class Produto {

    //   a)Um produto tem como atributos um código (um inteiro),
    //   um nome (uma String), um valor (um float) e um fornecedor
    //   (do tipo Fornecedor implementado na questão anterior)
    private int codigo;
    private String nome;
    private float valor;
    private Fornecedor fornecedor;

    public Produto(){
        super();
    }

    public Produto(int codigo, String nome, float valor, Fornecedor fornecedor){
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    //b)Implemente um método atualizarPreco na classe produto que
    // receba como parâmetro um valor (um float) que representa um
    // percentual. O valor passado deve aumentar o valor do produto.
        // Por exemplo, se for passado o valor 10.0, o valor do produto e aumentado em 10.0%.
    public void atualizarPreco(float valor){
        if (valor>0){
            this.valor += this.valor*0.10;
        }else{
            this.valor = 0;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString(){
        return "Código: " + codigo + " | Produto: " + nome + " | Valor: " + valor + fornecedor + "\n";
    }

}