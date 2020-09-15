package pacote3;

public class Monkey extends Animal {
	public Monkey() {
		super("macaco ", 2);
	}

	public void som(int numSom) {
		System.out.println("Um macaco, fazendo macaquiçe.");
	}

	public void movimento(int numMovimento) {
		System.out.println("sobe nas arvores");
	}

}
