package pacote1;

public class bike {
	private String rodas;
	private String cor;
	private boolean inf;
	private boolean eletrica;

	public bike(String rodas, String cor, boolean inf, boolean eletrica) {
		this.rodas = rodas;
		this.cor = cor;
		this.inf = infl;
		this.eletrica = eletrica;
	}

	public void imprimirInfo() {
		String inf = new String();
		if (inf) {
			inf = "pequeno ";
		} else {
			inf = " grande ";
		}
		String eletrico = new String();
		if (eletrica) {
			eletrico = " , eletrica.";
		} else {
			eletrico = ", não é eletrica.";
		}
		System.out.println("O bike possui " + rodas + " rodas, é da cor " + cor + ", ele é" + inf + eletrico);
	}

	public String getRodas() {
		return rodas;
	}

	public void setRodas(String rodas) {
		this.rodas = rodas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isInf() {
		return inf;
	}

	public void setInf(boolean inf) {
		this.inf = inf;
	}

	public boolean isEletrica() {
		return eletrica;
	}

	public void setEletrica(boolean eletrica) {
		this.eletrica = eletrica;
	}
}
