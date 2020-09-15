package pacote2;


public class administrador extends pessoa {
	private String custo;

	public administrador(String nome, String profissao, String custo) {
		super(nome, profissao);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public String getCusto() {
		return custo;
	}

	public void setAjudaDeCusto(String custo) {
		this.custo = custo;
	}

}
