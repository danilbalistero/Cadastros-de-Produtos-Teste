
import org.example.CadastroProduto;
import org.example.Produto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ProdutoTest {

    @Test
    public void cadastroProduto() {
        CadastroProduto cadastroProduto = new CadastroProduto();

        Produto produto1 = new Produto("Arroz", "Cereal", "Alimento", 2.5, 20);
        cadastroProduto.cadastrarProduto(produto1);

        List<Produto> produtosCadastrados = cadastroProduto.listarProdutos();
        Assertions.assertTrue(produtosCadastrados.contains(produto1));
    }

    @Test
    public void editarProduto() {
        CadastroProduto cadastroProduto = new CadastroProduto();
        Produto produto = new Produto("Arroz", "Cereal", "Alimento", 2.5, 20);
        cadastroProduto.cadastrarProduto(produto);

        Produto novoProduto = new Produto("Arroz Integral", "Cereal Nutritivo", "Alimento Saudável", 3.0, 25);
        cadastroProduto.editarProduto("Arroz", novoProduto);

        List<Produto> produtosCadastrados = cadastroProduto.listarProdutos();
        Assertions.assertTrue(produtosCadastrados.contains(novoProduto));
    }

    @Test
    public void excluirProduto() {
        CadastroProduto cadastroProduto = new CadastroProduto();
        Produto produto = new Produto("Arroz", "Cereal", "Alimento", 2.5, 20);
        cadastroProduto.cadastrarProduto(produto);

        cadastroProduto.excluirProduto("Arroz");

        List<Produto> produtosCadastrados = cadastroProduto.listarProdutos();
        Assertions.assertFalse(produtosCadastrados.contains(produto));
    }

    @Test
    public void consultarProduto() {
        CadastroProduto cadastroProduto = new CadastroProduto();
        Produto produto = new Produto("Arroz", "Cereal", "Alimento", 2.5, 20);
        cadastroProduto.cadastrarProduto(produto);

        Produto produtoConsultado = cadastroProduto.consultarProduto("Arroz");

        Assertions.assertNotNull(produtoConsultado);
        Assertions.assertEquals("Arroz", produtoConsultado.getNome());
    }
}
