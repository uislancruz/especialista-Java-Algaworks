public class Principal {

    public static void main(String[] args) {
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.adicionarItem("Agua", 5, 4);

        Produto produto = new Produto();
        produto.nome = "Agua";
        produto.precoUnitario = 5;

        carrinho.adicionarItem(produto,4);

        //produto.alterarStatus(true);
        produto.ativar();
        produto.inativar();
    }


}
