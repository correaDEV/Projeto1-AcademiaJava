import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public void removerItem(Produto produto) {
        itens.remove(produto);
    }

    public void listarItens() {
        for (Produto item : itens) {
            System.out.println(item.exibirDetalhes());
        }
    }

    public List<Produto> exportarListaProdutos() {
        return new ArrayList<>(itens);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void gerarArquivoTexto(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            int itemNumber = 1;
            for (Produto item : itens) {
                writer.write(itemNumber + " " + item.getQuantidade() + " " + item.getNome() + " " +
                        item.getPreco() + " " + (item.getPreco() * item.getQuantidade()) + "\n");
                itemNumber++;
            }
            writer.write("Total: " + calcularTotal());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    public void adicionarProduto(Produto produto) {
        itens.add(produto);
    }

   
    public void removerProduto(Produto produto) {
        itens.remove(produto);
    }

   
    public void listarProdutos() {
        System.out.println("Produtos no carrinho:");
        for (Produto produto : itens) {
            System.out.println(produto.exibirDetalhes());
        }
    }


    public void emitirRelatorio(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write("Lista de Produtos no Carrinho:\n\n");
            for (Produto produto : itens) {
                writer.write(produto.exibirDetalhes() + "\n");
            }
            writer.write("\nTotal: " + calcularTotal());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
