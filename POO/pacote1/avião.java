package pacote1;

public class avião {
	private String lugares;
	private String motor;
	private String modelo;
	private boolean paraqueda;

	public avião(String lugares, String motor, String modelo, boolean paraquedas) {
		this.lugares = lugares;
		this.motor = motor;
		this.modelo = modelo;
		this.paraqueda = paraqueda;
	}

	public void imprimirInfo() {
		String paraquedas = new String();
		if (paraquedas) {
			paraquedas = " e possui paraquedas. ";
		} else {
			temparaquedas = "e não possui paraquedas.";
		}
		System.out.println(
				"O avião tem " + lugares + " lugares, motor " + motor + ", do modelo " + modelo + paraquedas);
	}

	public String getLugares() {
		return lugares;
	}

	public void setLugares(String lugares) {
		this.lugares = lugares;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isParaqueda() {
		return paraqueda;
	}

	public void setParaquedas(boolean paraquedas) {
		this.paraquedas = paraqueda;
	}

}
