import java.util.List;
import java.util.Scanner;

public class Livro {
	
	String Titulo;
	String Autor;
	GeneroLivro genero;
	int AnoPublicacao;
	int exemplares;
	Scanner scanner = new Scanner(System.in);

	public Livro(String titulo, String autor, int anoPublicacao, int exemplares) {
		Titulo = titulo;
		Autor = autor;
		AnoPublicacao = anoPublicacao;
		this.exemplares = exemplares;
	}
	
	public Livro() {
		Titulo = "titulo";
		Autor = "autor";
		AnoPublicacao = 0;
		exemplares = 0;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getGenero() {
		return genero.getDescricao();
	}
	public void setGenero(GeneroLivro genero) {
		this.genero = genero;
	}
	public int getAnoPublicacao() {
		return AnoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		AnoPublicacao = anoPublicacao;
	}
	public int getExemplares() {
		return exemplares;
	}
	public void setExemplares(int exemplares) {
		this.exemplares = exemplares;
	}
	public void decrementarExemplares(int contador) {
		exemplares = exemplares - contador;
	}
	public void incrementarExemplares(int contador) {
		exemplares = exemplares + contador;
	}
	public void AddLivro() {
		
		System.out.println("Digite nome do livro.");
		String Titulo = scanner.nextLine().toUpperCase();
		setTitulo(Titulo);
		
		System.out.println("Digite nome do autor.");
		String Autor = scanner.nextLine();
		setAutor(Autor);
		
		System.out.println("Digite ano de publicação:");
		int Ano = scanner.nextInt();
		scanner.nextLine(); 
		setAnoPublicacao(Ano);
		
		System.out.println("Digite quntos exemplares tem.");
		int quant = scanner.nextInt();
		setExemplares(quant);
		
		scanner.nextLine();
		
		 System.out.println("Digite o gênero do livro (FICCAO, NAO_FICCAO, ROMANCE, etc.):");
	        String generoInput = scanner.nextLine().toUpperCase();
	        
	        try {
	            GeneroLivro genero = GeneroLivro.valueOf(generoInput);
	            setGenero(genero);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Gênero inválido! Usando gênero padrão FICCAO.");
	            setGenero(GeneroLivro.FICCAO);
	        }
	    }
	public void exibirInfo() {
        System.out.println("Nome: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Genero: " + getGenero());
        System.out.println("Ano de publicação " + getAnoPublicacao());
        System.out.println("Exemplares: " + getExemplares());
    }


}