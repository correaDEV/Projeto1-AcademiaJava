 # 💻 Projeto1-AcademiaJava
<hr>
<h2>Objetivo</h2>
    <p>Implementar um sistema de vendas de produtos utilizando conceitos de programação orientada a objetos: métodos, encapsulamento, construtores, herança, interfaces, classes abstratas e tratamento de exceções.</p>

   <h2>Descrição</h2>
    <p>Este projeto consiste na criação de um sistema para gerenciar diferentes tipos de produtos, incluindo eletrônicos, roupas e alimentos. O sistema permitirá a adição, remoção e listagem de produtos, bem como a emissão de relatórios em arquivo de texto contendo detalhes específicos para cada tipo de produto.</p> 

  <h2>Estrutura do Projeto</h2>

 <h3>1. Interface Produto</h3>
<p>Define os métodos a serem implementados pelas classes de produtos.</p> 
 <ul>
        <li><code>public String getTipo()</code></li>
        <li><code>public String getNome()</code></li>
        <li><code>public double getPreco()</code></li>
        <li><code>public void setNome(String nome)</code></li>
        <li><code>public void setPreco(double preco)</code></li>
        <li><code>public void setQuantidade(int quantidade)</code></li>
        <li><code>public int getQuantidade()</code></li>
        <li><code>public String exibirDetalhes()</code></li>
    </ul>
    <h3>2. Classe Abstrata ProdutoBase</h3>
    <p>Implementa a interface Produto e contém a lógica comum para os produtos.</p>
    <ul>
        <li>Atributos:
            <ul>
                <li><code>private String nome</code></li>
                <li><code>private double preco</code></li>
                <li><code>private int quantidade</code></li>
            </ul>
        </li>
        <li>Métodos:
            <ul>
                <li>Construtores:
                    <ul>
                        <li><code>public ProdutoBase(String nome, double preco, int quantidade)</code></li>
                        <li><code>public ProdutoBase()</code></li>
                    </ul>
                </li>
                <li>Métodos abstratos:
                    <ul>
                        <li><code>public abstract String exibirDetalhes()</code></li>
                    </ul>
                </li>
            </ul>
        </li>
    </ul>
    <h3>3. Classe Eletronico</h3>
    <p>Herda de ProdutoBase e adiciona atributos específicos para eletrônicos.</p>
    <ul>
        <li>Atributos adicionais:
            <ul>
                <li><code>private int garantiaMeses</code></li>
            </ul>
        </li>
        <li>Métodos:
            <ul>
                <li>Construtores:
                    <ul>
                        <li><code>public Eletronico(String nome, double preco, int garantiaMeses, int quantidade)</code></li>
                        <li><code>public Eletronico()</code></li>
                    </ul>
                </li>
                <li><code>public int getGarantiaMeses()</code></li>
                <li><code>public void setGarantiaMeses(int garantiaMeses)</code></li>
                <li>Implementação de <code>exibirDetalhes()</code>, exibindo todas as informações do eletrônico.</li>
                <li><code>public String getTipo()</code>, retornando "Eletrônico".</li>
            </ul>
        </li>
    </ul>

  <h3>4. Classe Roupa</h3>
    <p>Herda de ProdutoBase e adiciona atributos específicos para roupas.</p>
    <ul>
        <li>Atributos adicionais:
            <ul>
                <li><code>private String tamanho</code></li>
                <li><code>private String cor</code></li>
            </ul>
        </li>
        <li>Métodos:
            <ul>
                <li>Construtores:
                    <ul>
                        <li><code>public Roupa(String nome, double preco, String tamanho, String cor, int quantidade)</code></li>
                        <li><code>public Roupa()</code></li>
                    </ul>
                </li>
                <li><code>public String getTamanho()</code></li>
                <li><code>public void setTamanho(String tamanho)</code></li>
                <li><code>public String getCor()</code></li>
                <li><code>public void setCor(String cor)</code></li>
                <li>Implementação de <code>exibirDetalhes()</code>, exibindo todas as informações da roupa.</li>
                <li><code>public String getTipo()</code>, retornando "Roupa".</li>
            </ul>
        </li>
    </ul>
    
  <h3>5. Classe Alimento</h3>
    <p>Herda de ProdutoBase e adiciona atributos específicos para alimentos.</p>
    <ul>
        <li>Atributos adicionais:
            <ul>
                <li><code>private String dataValidade</code></li>
            </ul>
        </li>
        <li>Métodos:
            <ul>
                <li>Construtores:
                    <ul>
                        <li><code>public Alimento(String nome, double preco, String dataValidade, int quantidade)</code></li>
                        <li><code>public Alimento()</code></li>
                    </ul>
                </li>
                <li><code>public String getDataValidade()</code></li>
                <li><code>public void setDataValidade(String dataValidade)</code></li>
                <li>Implementação de <code>exibirDetalhes()</code>, exibindo todas as informações do alimento.</li>
                <li><code>public String getTipo()</code>, retornando "Alimento".</li>
            </ul>
        </li>
    </ul>

  <h3>6. Classe CarrinhoDeCompras</h3>
    <p>Gerencia os produtos no carrinho de compras e gera relatórios.</p>
    <ul>
        <li>Atributos:
            <ul>
                <li><code>private List<Produto> itens</code></li>
                <li>Demais atributos para escrita de arquivo de texto.</li>
            </ul>
        </li>
        <li>Métodos:
            <ul>
                <li>Construtor:
                    <ul>
                        <li><code>public CarrinhoDeCompras()</code>, inicializando a lista de itens.</li>
                    </ul>
                </li>
                <li><code>public void adicionarItem(Produto produto)</code>, para adicionar um produto ao carrinho.</li>
                <li><code>public void removerItem(Produto produto)</code>, para remover um produto do carrinho.</li>
                <li><code>public void listarItens()</code>, para exibir os detalhes de todos os produtos no carrinho.</li>
                <li><code>public List<Produto> exportarListaProdutos()</code>, para devolver a lista de produtos do carrinho.</li>
                <li><code>public double calcularTotal()</code>, para calcular o valor total dos produtos no carrinho.</li>
                <li><code>public void gerarArquivoTexto(String nomeArquivo)</code>, para gerar um arquivo de texto com o formato:
                    <pre>
item: Qtd: Nome: Preço: SubTotal:
1 3 Smartphone 2999.0 8997.0
2 6 T-Shirt 89.99 539.93
3 4 Arroz 9.99 39.96
Total: 9576.90
                    </pre>
                </li>
            </ul>
        </li>
    </ul>

  <h3>7. Classe Principal</h3>
    <p>Executa o programa e testa as funcionalidades implementadas.</p>
    <ul>
        <li>Método <code>main</code>:
            <ul>
                <li>Criar duas instâncias de <code>CarrinhoDeCompras</code>.</li>
                <li>Na primeira adicionar um <code>Eletronico</code>, uma <code>Roupa</code>, e um <code>Alimento</code>.</li>
                <li>Na segunda instância adicionar mais itens quaisquer.</li
