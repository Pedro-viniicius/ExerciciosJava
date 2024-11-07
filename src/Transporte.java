
public abstract class Transporte {
	String modelo;
	double capacidadeDeCarga;
	double distanciaPercorrida;
	
	public Transporte(String modelo, double capacidadeDeCarga, double distanciaPercorrida) {
        this.modelo = modelo;
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.distanciaPercorrida = distanciaPercorrida;
    }
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(int capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(float distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

	public abstract double CalcularCusto (double  distanciaPercorrida, double  capacidadeDeCarga  );

	
}
