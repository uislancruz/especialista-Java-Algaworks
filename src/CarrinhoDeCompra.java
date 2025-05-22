public class CarrinhoDeCompra {

    static final double TAXA_SERVICO_PADRAO = 0.10;

    int quantidadeItens;
    Produto produto;

    void realizarCompra(String numeroCarta){
        double valorTotal = calcularValorTotal();

        boolean pagamentoAutorizado = GatewayPagamento.autorizarPagamento(numeroCarta, valorTotal);

        if (pagamentoAutorizado){
            System.out.println("Recibo de Pagamento");
            System.out.printf("Valor total: R$%2.f%n", valorTotal);
        }
    }

    double calcularValorTotal() {
        double subtotal = produto.precoUnitario * quantidadeItens;
        double taxaServico = subtotal * TAXA_SERVICO_PADRAO;
        double valorTotal = subtotal + taxaServico;
        return valorTotal;
    }
}
