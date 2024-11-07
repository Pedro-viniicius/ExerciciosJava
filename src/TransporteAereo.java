
public class TransporteAereo extends Transporte {

	public TransporteAereo(String modelo, double capacidadeDeCarga, double distanciaPercorrida) {
		super(modelo, capacidadeDeCarga, distanciaPercorrida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double  CalcularCusto(double  distanciaPercorrida, double capacidadeDeCarga) {
		double taxaPorKm = 5.0; 
        double taxaPorTonelada = 2.0; 
        double taxaEmbarque = 500.0; 

        // Calculando o valor total
        double  valorTransporte =  (double ) (taxaEmbarque + (distanciaPercorrida * taxaPorKm) + (capacidadeDeCarga* taxaPorTonelada));
        return valorTransporte;
	}

}
