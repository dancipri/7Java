package pacote2;


public class Operario extends pessoa {
	private int valorProducao;
	private int comissao;

	public Operario(String nome, int valorProducao, int comissao) {
		super(nome);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public void imprimirOperario() {
		int x;
		x = (this.valorProducao * this.comissao) / 100;
		System.out.println("Comiss�o de " + comissao + "% = " + x);
	}

	public int getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(int valorProducao) {
		this.valorProducao = valorProducao;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

}
