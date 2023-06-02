package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//4) Implemente em Java uma classe chamada ConjuntoProdutos que contenha um
// ArrayList que possa guardar produtos (classe implementada na questão anterior)
// e forneça métodos que permitam inserir, remover, atualizar, mostrar produtos e
// atualizar o preço dos produtos por porcentagem.
    //Obs.: O conjunto não deve permitir que produtos com o mesmo código sejam cadastrados no conjunto.
public class ConjuntoProdutos extends Produto{

    private List<Produto> produtos;

    public ConjuntoProdutos(){
        super();
        this.produtos = new ArrayList<Produto>();
    }

    public void inserirProduto(Produto produto) {
        //Verifica se o produto já está na lista
        if (produtos.contains(produto) == false) {
            this.produtos.add(produto);
        }
    }

    public String mostrarProdutos() {
        String prod = "\n";
        for (Produto produto : this.produtos) {
            prod += produto.toString() + "\n";
        }
        return prod;
    }

    public void removerProduto(int codigo) {
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getCodigo() == codigo) {
                iterator.remove();
                break;
            }
        }
    }

    public void atualizarProduto(Produto produtoAtualizado) {
        int codigo = produtoAtualizado.getCodigo();
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if (produto.getCodigo() == codigo) {
                produtos.set(i, produtoAtualizado);
                break;
            }
        }
    }

    public void atualizarPrecoPorcentagem(float valor) {
        for (Produto produto : produtos) {
            produto.atualizarPreco(valor);
        }
    }


    @Override
    public String toString(){
        return "Código: " + getCodigo() + " | Produto: " + getNome() + " | Valor: " + getValor() + getFornecedor() + "\n";
    }

}
