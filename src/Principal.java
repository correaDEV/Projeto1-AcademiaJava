public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();

        Eletronico eletronico = new Eletronico("Smartphone", 2999.0, 24, 3);
        Roupa roupa = new Roupa("T-Shirt", 89.99, "M", "Preto", 6);
        Alimento alimento = new Alimento("Arroz", 9.99, "2023-12-31", 4);

        carrinho1.adicionarItem(eletronico);
        carrinho1.adicionarItem(roupa);
        carrinho1.adicionarItem(alimento);

        Roupa outraRoupa = new Roupa("Calça Jeans", 199.99, "G", "Azul", 2);
        carrinho2.adicionarItem(outraRoupa);

        System.out.println("Carrinho 1:");
        carrinho1.listarItens();
        System.out.println("Total: " + carrinho1.calcularTotal());

        System.out.println("\nCarrinho 2:");
        carrinho2.listarItens();
        System.out.println("Total: " + carrinho2.calcularTotal());

        carrinho1.gerarArquivoTexto("carrinho1.txt");
        carrinho2.gerarArquivoTexto("carrinho2.txt");
    }
}
