package Principal;

import Model.*;

//3) Crie uma classe TesteProduto com um método main. No método main desta classe,
// instancie três produtos e dois fornecedores, de acordo com o esquema em anexo (Figura 01).

public class TesteProduto {
    public static void main(String[] args) {

        ConjuntoProdutos conjuntoProdutos = new ConjuntoProdutos();

        Fornecedor forn_1 = new Fornecedor("1234321", " (81)34136655", "Zé Maria");
        Fornecedor forn_2 = new Fornecedor("543212345", " (81)35227841", "Cláudio");

        System.out.println(forn_1);
        System.out.println(forn_2);

        System.out.println("\n-----------------------------------\n");
        Produto produto_1 = new Produto(1, "TV LCD", 3500, forn_1);
        Produto produto_2 = new Produto(2, "Notebook", 2000, forn_2);
        Produto produto_3 = new Produto(3, "Impressora", 232, forn_2);

        // Inserir produtos no conjunto
        conjuntoProdutos.inserirProduto(produto_1);
        conjuntoProdutos.inserirProduto(produto_2);
        conjuntoProdutos.inserirProduto(produto_3);

        // Mostrar produtos do conjunto
        System.out.println("Produtos:");
        System.out.println(conjuntoProdutos.mostrarProdutos());

        System.out.println("\n-----------------------------------\n");

        // Atualizar preço dos produtos por porcentagem
        conjuntoProdutos.atualizarPrecoPorcentagem(10.0f);

        // Mostrar produtos atualizados
        System.out.println("Produtos atualizados:");
        System.out.println(conjuntoProdutos.mostrarProdutos());

        System.out.println("\n-----------------------------------\n");

        // Remover um produto do conjunto
        conjuntoProdutos.removerProduto(2);

        // Mostrar produtos após remoção
        System.out.println("Produtos após remoção:");
        System.out.println(conjuntoProdutos.mostrarProdutos());


        // Atualizar um produto no conjunto
        Produto produtoAtualizado = new Produto(1, "TV LED", 4000.0f, forn_2);
        conjuntoProdutos.atualizarProduto(produtoAtualizado);

        // Mostrar produtos após atualização
        System.out.println("Produtos após atualização:");
        System.out.println(conjuntoProdutos.mostrarProdutos());
    }

}