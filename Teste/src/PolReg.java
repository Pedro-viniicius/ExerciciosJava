
public class PolReg {
	private int numeroLados;
	protected int tamanhoLado;

	public PolReg(int numeroLados, int tamanhoLado) {
		this.numeroLados = numeroLados;
		this.tamanhoLado = tamanhoLado;
	}
	public PolReg() {
		this.numeroLados = 0;
		this.tamanhoLado = 0;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public int getTamanhoLado() {
		return tamanhoLado;
	}

	public void setTamanhoLado(int tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}
	public double calculoPerimetro() {
		double P = numeroLados*tamanhoLado;
		return P;
	}
	
	public double calculoAnguloInterno() {
		double anguloInterno = ((numeroLados - 2) * 180.0) / numeroLados;
		return anguloInterno;
	}
	public double calcularArea() {
        // Como não é possível calcular a área de um polígono regular genérico sem mais informações,
        // retornamos 0
        return 0;
    }
}
