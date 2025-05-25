public class CarrinhoDeCompra {

    static final double TAXA_SERVICO_PADRAO = 0.10;

    int quantidadeItens;
    Produto produto;

    void adicionarItem(String nomeProduto, double precoUnitario, int quantidade) {

    }

    void realizarCompra(String numeroCarta){
        double valorTotal = calcularValorTotal();

        boolean pagamentoAutorizado = GatewayPagamento.autorizarPagamento(numeroCarta, valorTotal);

        if (pagamentoAutorizado){
            imprimirRecibo(valorTotal);
        }
    }


    private static void imprimirRecibo(double valorTotal) {
        System.out.println("Recibo de Pagamento");
        System.out.printf("Valor total: R$%2.f%n", valorTotal);
    }

    double calcularValorTotal() {
        double subtotal = calcularSubtotal();
        double taxaServico = calcularTaxaServico(subtotal);
        double valorTotal = subtotal + taxaServico;
        return valorTotal;
    }

    static double calcularTaxaServico(double subtotal) {
        return subtotal * TAXA_SERVICO_PADRAO;
    }

    double calcularSubtotal() {
        return produto.precoUnitario * quantidadeItens;
    }
}
