import java.util.Scanner;

public class Bibliotecaapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        
        int opcao;
        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Cliente");
            System.out.println("3. Realizar Empréstimo");
            System.out.println("4. Realizar Devolução");
            System.out.println("5. Consultar Multas");
            System.out.println("6. Pagar Multa");
            System.out.println("7. Listar Livros");
            System.out.println("8. Listar Clientes");
            System.out.println("9. Pesquisar Livro por Título ou Autor");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Cadastrar Livro ===");
                    biblioteca.CadastroLivro();
                    break;

                case 2:
                    System.out.println("\n=== Cadastrar Cliente ===");
                    biblioteca.CadastrarCliente();
                    break;

                case 3:
                    System.out.println("\n=== Realizar Empréstimo ===");
                    biblioteca.emprestimo();
                   
                    break;

                case 4:
                    System.out.println("\n=== Realizar Devolução ===");
                    biblioteca.devolucao();
                    break;

                case 5:
                    System.out.println("\n=== Consultar Multas ===");
                    biblioteca.consultarMultas();
                    break;

                case 6:
                    System.out.println("\n=== Pagar Multa ===");
                    biblioteca.pagarMulta();
                    break;

                case 7:
                    System.out.println("\n=== Listar Livros ===");
                    biblioteca.listarLivros();
                    break;

                case 8:
                    System.out.println("\n=== Listar Clientes ===");
                    biblioteca.listarUsurarios();
                    break;

                case 9:
                    System.out.println("\n=== Pesquisar Livro por Título ou Autor ===");
                    biblioteca.BuscarLivro();
                    break;

                case 10:
                    System.out.println("Saindo... Obrigado por usar o sistema!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 10);

        scanner.close();
    }
}
