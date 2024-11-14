import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
	List<Livro> acervo = new ArrayList<>();
	List<Aluno> alunos = new ArrayList<>();
	List<Professor> professores = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public List<Aluno> getAluno() {
		return alunos;
	}

	public void setAluno(List<Aluno> aluno) {
		this.alunos = aluno;
	}

	public List<Professor> getProf() {
		return professores;
	}

	public void setProf(List<Professor> prof) {
		this.professores = prof;
	}

	public void CadastroLivro() {
		Livro NovoLivro = new Livro();
		NovoLivro.AddLivro();
		acervo.add(NovoLivro);
	}

	public Cliente CadastrarCliente() {

		int opcao;
		do {

			System.out.println("\nQuer cadastrar que tipo de usuario?");
			System.out.println("1. Cadastrar Aluno");
			System.out.println("2. Cadastrar Professor");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("\n===Cadastro Aluno ===");
				Aluno novoAluno = new Aluno();
				novoAluno.cadastrarCliente();
				alunos.add(novoAluno);
				return novoAluno;

			case 2:
				System.out.println("\n=== Cadastrar Professor ===");
				Professor novoProfessor = new Professor();
				novoProfessor.cadastrarCliente();
				professores.add(novoProfessor);
				return novoProfessor;

			default:
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (opcao != 2);
		scanner.close();
		return null;

	}

	public void BuscarLivro() {

		for (Livro titulo : acervo) {

			System.out.println("Digite nome do Livro ou nome do autor: ");
			String nome = scanner.nextLine();

			if (nome.equalsIgnoreCase(titulo.getTitulo())) {
				titulo.exibirInfo();
			} 
			if(nome.equalsIgnoreCase(titulo.getAutor())) {
				titulo.exibirInfo();
			}
				else {
				System.out.println("Não existe esse livro no acervo do sistema: ");
			}
		}

	}

	public void removeLivro(String titulo) {
		acervo.removeIf(livro -> livro.getTitulo().equalsIgnoreCase(titulo));
	}

	public void listarLivros() {

		for (Livro livro : acervo) {
			System.out.println("Título: " + livro.getTitulo());
			System.out.println("Autor: " + livro.getAutor());
			System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
			System.out.println("Número Disponível: " + livro.getExemplares());
			System.out.println("Genero: " + livro.getGenero());
		}
	}

	public void emprestimo() {
		System.out.println("Digite o tipo de usuário que irá fazer o empréstimo (Aluno ou Professor): ");
		String tipoUsuario = scanner.nextLine();

		if (tipoUsuario.equalsIgnoreCase("Aluno")) {
			for (Aluno aluno : alunos) {
				System.out.println("Digite o nome do aluno: ");
				String nomeAluno = scanner.nextLine();
				if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
					aluno.emprestimoAluno(acervo);
					return;
				}
			}
			System.out.println("Aluno não encontrado.");

		} else if (tipoUsuario.equalsIgnoreCase("PROFESSOR")) {
			for (Professor prof : professores) {
				System.out.println("Digite o nome do professor: ");
				String nomeProfessor = scanner.nextLine();
				if (prof.getNome().equalsIgnoreCase(nomeProfessor)) {
					prof.emprestimoProfessor(acervo);
					return;
				}
			}
			System.out.println("Professor não encontrado.");

		} else {
			System.out.println("Tipo inválido.");
		}
	}

	public void devolucao() {
		System.out.println("Digite o tipo de usuário que irá fazer a devolucao (Aluno ou Professor): ");
		String tipoUsuario = scanner.nextLine();

		if (tipoUsuario.equalsIgnoreCase("ALUNO")) {
			for (Aluno aluno : alunos) {
				System.out.println("Digite o nome do aluno: ");
				String nomeAluno = scanner.nextLine();
				if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
					aluno.devolucaoAluno(acervo);
					return;
				}
			}
			System.out.println("Aluno não encontrado.");

		} else if (tipoUsuario.equalsIgnoreCase("PROFESSOR")) {
			for (Professor prof : professores) {
				System.out.println("Digite o nome do professor: ");
				String nomeProfessor = scanner.nextLine();
				if (prof.getNome().equalsIgnoreCase(nomeProfessor)) {
					prof.devolucaoProfessor(acervo);
					return;
				}
			}
			System.out.println("Professor não encontrado.");

		} else {
			System.out.println("Tipo inválido.");
		}
	}
	public void consultarMultas() {
		System.out.println("Digite o tipo de usuário que irá fazer a consulta (Aluno ou Professor): ");
		String tipoUsuario = scanner.nextLine();
		
		if (tipoUsuario.equalsIgnoreCase("ALUNO")) {
			for (Aluno aluno : alunos) {
				System.out.println("Digite o nome do aluno: ");
				String nomeAluno = scanner.nextLine();
				if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
					double valor = aluno.calculoMulta();
					if(valor> 0) {
						System.out.println("Multa é no valor de: " + valor);
					} 
					System.out.println("Aluno nao possui multa no sistema.");
					return;
				}
			}
			System.out.println("Aluno não encontrado.");

		} else if (tipoUsuario.equalsIgnoreCase("PROFESSOR")) {
			for (Professor prof : professores) {
				System.out.println("Digite o nome do professor: ");
				String nomeProfessor = scanner.nextLine();
				if (prof.getNome().equalsIgnoreCase(nomeProfessor)) {
					double valor = prof.calculoMulta();
					if(valor> 0) {
						System.out.println("Multa é no valor de: " + valor);
					} 
					System.out.println("Professor não possui multa no sistema.");
					return;
				}
			}
			System.out.println("Professor não encontrado.");

		} else {
			System.out.println("Tipo inválido.");
		}
	}
	
	public void pagarMulta() {
		System.out.println("Digite o tipo de usuário que irá fazer o pagamento (Aluno ou Professor): ");
		String tipoUsuario = scanner.nextLine();
		
		if (tipoUsuario.equalsIgnoreCase("ALUNO")) {
			for (Aluno aluno : alunos) {
				System.out.println("Digite o nome do aluno: ");
				String nomeAluno = scanner.nextLine();
				if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
					double valor = aluno.calculoMulta();
					if(valor> 0) {
						System.out.println("Multa é no valor de: " + valor);
						System.out.println("Digite o valor que o professor deseja pagar");
						double dinheiro = scanner.nextDouble();
						aluno.pagarMulta(dinheiro);
					} 
					System.out.println("Aluno nao possui multa no sistema.");
					return;
				}
			}
			System.out.println("Aluno não encontrado.");

		} else if (tipoUsuario.equalsIgnoreCase("PROFESSOR")) {
			for (Professor prof : professores) {
				System.out.println("Digite o nome do professor: ");
				String nomeProfessor = scanner.nextLine();
				if (prof.getNome().equalsIgnoreCase(nomeProfessor)) {
					double valor = prof.calculoMulta();
					if(valor> 0) {
						System.out.println("Multa é no valor de: " + valor);
						System.out.println("Digite o valor que o professor deseja pagar");
						double dinheiro = scanner.nextDouble();
						prof.pagarMulta(dinheiro);
					} 
					System.out.println("Professor não possui multa no sistema.");
					return;
				}
			}
			System.out.println("Professor não encontrado.");

		} else {
			System.out.println("Tipo inválido.");
		}
	}
	
	public void listarUsurarios() {
		System.out.println("Alunos: ");
		for(Aluno aluno: alunos) {
			aluno.exibirInfo();
		}
		System.out.println("Professores: ");
		for(Professor professor: professores) {
			professor.exibirInfo();
		}
	}


}
