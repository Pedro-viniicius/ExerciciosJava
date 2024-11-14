import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;




public class Aluno extends Cliente {
	int quantLivros;
	LocalDate hoje = LocalDate.now();

	

	public int getQuantLivros() {
		return quantLivros;
	}

	public void incrementarQuantLivros() {
		quantLivros = quantLivros + 1;
	}

	public void decrementarQuantLivros() {
		quantLivros = quantLivros - 1;
	}

	public void emprestimoAluno(List<Livro> acervo) {
		calculoMulta();
		if (getTipo().equals("Aluno") && getMulta() == 0 && getQuantLivros() <= 3) {
			System.out.println("Digite nome do Livro a ser emprestado: ");
			String nome = scanner.nextLine();

			boolean encontrado = false;

			for (Livro titulo : acervo) {
				if (nome.equalsIgnoreCase(titulo.getTitulo())) {
					encontrado = true;
					LivrosEmprestados.add(nome.trim().toLowerCase());
					incrementarQuantLivros();
					LocalDate devolucao = hoje.plusDays(5);
					System.out.println("Data de devolução: " + devolucao);
					titulo.decrementarExemplares(1);
					dataDevolucao data = new dataDevolucao();
					data.setData(devolucao);
					data.setTitulo(nome);
					datas.add(data);
					break;
				}
			}

			if (!encontrado) {
				System.out.println("Livro não existe no acervo");
			}
		} else {
			System.out.println("Irregularidade no cadastro, verificar com gestor do sistema.");
		}
	}

	public void devolucaoAluno(List<Livro> acervo) {
	    double multa = calculoMulta();
	    
	    if (multa == 0) {
	        System.out.println("Digite o nome do Livro a ser devolvido: ");
	        String nome = scanner.nextLine();

	        boolean encontrado = false;

	        for (Livro titulo : acervo) {
	            if (nome.equalsIgnoreCase(titulo.getTitulo())) {
	                encontrado = true;
	                if (LivrosEmprestados.remove(nome.trim().toLowerCase())) {
	                    titulo.incrementarExemplares(1);
	                    decrementarQuantLivros();
	                    
	                 
	                    Iterator<dataDevolucao> iterator = datas.iterator();
	                    while (iterator.hasNext()) {
	                        dataDevolucao titulo1 = iterator.next();
	                        if (nome.equalsIgnoreCase(titulo1.getTitulo())) {
	                            iterator.remove();  
	                            break; 
	                        }
	                    }
	                    
	                    System.out.println("Livro devolvido com sucesso");
	                } else {
	                    System.out.println("Este livro não consta como emprestado para o aluno.");
	                }
	                break;
	            }
	        }

	        if (!encontrado) {
	            System.out.println("Livro não encontrado no acervo.");
	        }
	    } else {
	        System.out.println("Necessário acertar multa pendente antes de fazer a devolução, no valor de " + multa);
	    }
	}
	
	public double calculoMulta() {
		 if (datas == null || datas.isEmpty()) {
			    return 0;  
			}
	        double multaTotal = 0;  
	        
	        for (dataDevolucao data : datas) {
	            long diasDeAtraso = ChronoUnit.DAYS.between(data.getData(), hoje);
	            
	            if (diasDeAtraso > 0) {  
	                multaTotal += diasDeAtraso * 2;  
	            }
	        }
	        
	        setMulta(multaTotal);  
	        return getMulta(); 
	    }

	public void pagarMulta(double valor) {
		double multa = calculoMulta();
		double boleto = multa - valor;
		if(boleto > 00) {
			System.out.println("Valor restante a ser pago" + boleto);
		}
		setMulta(boleto);
		System.out.println("Multa acertada com sucesso");
	}
}
