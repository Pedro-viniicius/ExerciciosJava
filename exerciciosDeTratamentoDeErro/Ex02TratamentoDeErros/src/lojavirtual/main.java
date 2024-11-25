package lojavirtual;

public class main {

	public static void main(String[] args) {
		PedidoLojaVirtual pedido = new PedidoLojaVirtual();

        try {
            pedido.adicionarItem("Notebook", 4500.00, 2);
            pedido.adicionarItem("Smartphone", 2000.00, 3); // Deve lançar exceção de valor total excedido
        } catch (PrecoInvalidoException | QuantidadeInvalidaException | ValorTotalExcedidoException e) {
            System.out.println("Erro ao adicionar item: " + e.getMessage());
        }

        try {
            pedido.adicionarItem("Mouse", -50.00, 1); // Deve lançar exceção de preço inválido
        } catch (PrecoInvalidoException | QuantidadeInvalidaException | ValorTotalExcedidoException e) {
            System.out.println("Erro ao adicionar item: " + e.getMessage());
        }

        try {
            pedido.adicionarItem("Teclado", 120.00, -2); // Deve lançar exceção de quantidade inválida
        } catch (PrecoInvalidoException | QuantidadeInvalidaException | ValorTotalExcedidoException e) {
            System.out.println("Erro ao adicionar item: " + e.getMessage());
        }

        System.out.printf("Valor total do pedido: R$ %.2f%n", pedido.getValorTotal());

	}

}
