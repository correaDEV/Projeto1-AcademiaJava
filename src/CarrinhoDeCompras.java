import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarrinhoDeCompras {
    private List<Produto> itens;
    private Scanner scanner;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
        this.scanner = new Scanner(System.in);
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
            writer.write("item: Qtd: Nome: Preço: SubTotal:\n");
            int itemNumber = 1;
            for (Produto item : itens) {
                double subTotal = item.getPreco() * item.getQuantidade();
                writer.write(itemNumber + " " + item.getQuantidade() + " " + item.getNome() + " " +
                        df.format(item.getPreco()) + " " + df.format(subTotal) + "\n");
                itemNumber++;
            }
            writer.write("Total: " + df.format(calcularTotal()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
