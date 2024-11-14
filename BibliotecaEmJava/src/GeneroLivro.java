
public enum GeneroLivro{
	
	FICCAO("Ficção"),
    NAO_FICCAO("Não-Ficção"),
    ROMANCE("Romance"),
    FANTASIA("Fantasia"),
    CIENCIA("Ciência"),
    HISTORIA("História"),
    BIOGRAFIA("Biografia"),
    AUTOAJUDA("Autoajuda"),
    TERROR("Terror"),
    MISTERIO("Mistério"),
    POESIA("Poesia");

    private final String descricao;


    GeneroLivro(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}