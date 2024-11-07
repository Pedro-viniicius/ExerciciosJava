
public class TransporteMaritimo extends Transporte{

	public TransporteMaritimo(String modelo, double capacidadeDeCarga, double distanciaPercorrida) {
		super(modelo, capacidadeDeCarga, distanciaPercorrida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double  CalcularCusto(double  distanciaPercorrida, double  capacidadeDeCarga) {
		double  taxaPorMilhaNautica =  (double ) 1.5;
		double  taxaPorTonelada = (double ) 0.8;
		double  taxaPortuaria = (double ) 300.0; 

        // Calculando o valor total
        double  valorTransporte = taxaPortuaria + (distanciaPercorrida * taxaPorMilhaNautica) + (capacidadeDeCarga * taxaPorTonelada);
        return valorTransporte;
	}

}
