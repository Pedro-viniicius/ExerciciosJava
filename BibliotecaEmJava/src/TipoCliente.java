
public enum TipoCliente {
	
	ALUNO ("Aluno"),
	PROFESSOR ("Professor");
	
	private final String tipo;
	
	TipoCliente(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	
	
}