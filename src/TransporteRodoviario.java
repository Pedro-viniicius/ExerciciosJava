
public class TransporteRodoviario extends Transporte {


	public TransporteRodoviario(String modelo, double capacidadeDeCarga, double distanciaPercorrida) {
		super(modelo, capacidadeDeCarga, distanciaPercorrida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalcularCusto (double distanciaPercorrida,double  capacidadeCarga) {
		double  taxaPorKm = (double ) 2.0; 
		double  taxaPorTonelada = (double ) 0.5; 

        // Calculando o valor total
		double  valorTransporte = (double ) (distanciaPercorrida * taxaPorKm) + (capacidadeCarga * taxaPorTonelada);
        return valorTransporte;
	}


}



