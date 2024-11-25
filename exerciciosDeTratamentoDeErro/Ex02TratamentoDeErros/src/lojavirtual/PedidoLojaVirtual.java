package lojavirtual;

public class PedidoLojaVirtual {

    private static final double LIMITE_MAXIMO = 10000.00;
    private double valorTotal = 0;

    public void adicionarItem(String produto, double preco, int quantidade) 
            throws PrecoInvalidoException, QuantidadeInvalidaException, ValorTotalExcedidoException {
        
        if (preco <= 0) {
            throw new PrecoInvalidoException("Preço inválido para o produto: " + produto);
        }
        if (quantidade <= 0) {
            throw new QuantidadeInvalidaException("Quantidade inválida para o produto: " + produto);
        }
        
        double valorItem = preco * quantidade;
        if (valorTotal + valorItem > LIMITE_MAXIMO) {
            throw new ValorTotalExcedidoException("Valor total excede o limite permitido ao adicionar o produto: " + produto);
        }

        valorTotal += valorItem;
        System.out.printf("Item adicionado: %s | Preço: R$ %.2f | Quantidade: %d | Valor Item: R$ %.2f%n", 
                          produto, preco, quantidade, valorItem);
    }

    public double getValorTotal() {
        return valorTotal;
    }

}