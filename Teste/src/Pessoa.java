import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pessoa {
    private int idade;
    private String nome;
    private LocalDate dataDeNascimento;
    private Universidade universidade = new Universidade();
    Scanner scanner = new Scanner (System.in);

    public void calculaIdade() {
        LocalDate dataAtual = LocalDate.now();
        this.idade = Period.between(dataDeNascimento, dataAtual).getYears();
    }


    public int getIdade() {
    	return idade;
    }

 
    public void setDataNascimento() {
        
        System.out.print("Informe a data de nascimento (dd/MM/yyyy): ");
        String dataDeNascimentoStr = scanner.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataDeNascimento = LocalDate.parse(dataDeNascimentoStr, formato);

        calculaIdade();
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUniversidade() {
    	System.out.println("Difite o nome da instituição");	
    	String nome1 =scanner.nextLine();
    	this.universidade.setNome(nome1);
    }
    public void infoProficional() {
    	System.out.println(nome);
    	String nome1 = this.universidade.getNome();
    	System.out.println(nome1);	
    }
}
