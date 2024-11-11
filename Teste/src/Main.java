import java.util.Scanner;

public class Main {
	
	 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
	        
		while (true) {
			
			System.out.println("Que tipo de objeto você quer criar:");
	        System.out.println("1 - Polígono regular");
	        System.out.println("2 - Triângulo equilátero");
	        System.out.println("3 - Quadrado");
	        System.out.println("0 - Sair");
	                
	        int opcao = scanner.nextInt();
			 
			switch (opcao) {
				
			case 1:
				PolReg pol = new PolReg();
				pol.setNumeroLados(6);
				pol.setTamanhoLado(2);
				
				double area = pol.calcularArea();
				double angulo = pol.calculoAnguloInterno();
				double perimetro = pol.calculoPerimetro();
				
				System.out.println("Area igual: " + area);
				System.out.println("Angulo interno igual: " +angulo);
				System.out.println("Perimetro igual: " +perimetro);
				break;
				
			case 2:
				TrianguloEq tri = new TrianguloEq();
				tri.setNumeroLados(3);
				tri.setTamanhoLado(2);
				
				double area1 = tri.calcularArea();
				double angulo1 = tri.calculoAnguloInterno();
				double perimetro1 = tri.calculoPerimetro();
				
				System.out.println("Area igual: " + area1);
				System.out.println("Angulo interno igual: " +angulo1);
				System.out.println("Perimetro igual: " +perimetro1);
				break;
			case 3:
				Quadrado qua = new Quadrado();
				qua.setNumeroLados(4);
				qua.setTamanhoLado(2);
				
				double area11 = qua.calcularArea();
				double angulo11 = qua.calculoAnguloInterno();
				double perimetro11 = qua.calculoPerimetro();
				
				System.out.println("Area igual: " + area11);
				System.out.println("Angulo interno igual: " +angulo11);
				System.out.println("Perimetro igual: " +perimetro11);
				break;
			case 0:
				System.out.println("Saindo...");
                break;
			default:
                System.out.println("Opção inválida, tente novamente.");		
			}
			   if (opcao == 0) {
	                break;
	            }
	    }

        scanner.close();
		}
	}

