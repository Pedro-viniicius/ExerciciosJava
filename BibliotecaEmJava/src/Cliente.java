import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
	int max =10;
    private String nome;
    private String CPF;
    private double multa;
    List<String> LivrosEmprestados = new ArrayList<>();;
    private TipoCliente tipo;
    Scanner scanner = new Scanner(System.in);
    List<dataDevolucao> datas = new ArrayList<>();;
  

   
    public Cliente(String nome, String CPF, double multa, TipoCliente tipo, List<String> livrosEmprestados) {
        this.nome = nome;
        this.CPF = CPF;
        this.multa = multa;
        this.tipo = tipo != null ? tipo : TipoCliente.ALUNO; 
        this.LivrosEmprestados = (livrosEmprestados != null) ? livrosEmprestados : new ArrayList<>();
    }


    public Cliente() {
        this.nome = "";
        this.CPF = "";
        this.multa = 0.0;
        this.tipo = TipoCliente.ALUNO; 
        this.LivrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public String getTipo() {
        return (tipo != null) ? tipo.getTipo() : "Tipo não definido";
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public List<String> getLivrosEmprestados() {
        return LivrosEmprestados;
    }

    public void setLivrosEmprestados(List<String> livrosEmprestados) {
        this.LivrosEmprestados = livrosEmprestados != null ? livrosEmprestados : new ArrayList<>();
    }


    public void cadastrarCliente() {
       

        System.out.println("Nome: ");
        String nome = scanner.nextLine().trim().toUpperCase();
        setNome(nome);

        System.out.println("CPF: ");
        String CPF = scanner.nextLine().trim();
        setCPF(CPF);

        System.out.println("Tipo de usuário (ALUNO, PROFESSOR): ");
        String tipoInput = scanner.nextLine().toUpperCase().trim();

        
        try {
            TipoCliente tipo = TipoCliente.valueOf(tipoInput);
            setTipo(tipo);
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo inválido! Usando ALUNO como padrão.");
            setTipo(TipoCliente.ALUNO);
        }

    }

   
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Multa: R$ " + getMulta());
        System.out.println("Livros Emprestados: " + (LivrosEmprestados.isEmpty() ? "Nenhum" : LivrosEmprestados));
    }



}
