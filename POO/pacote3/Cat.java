package pacote3;

public class Cat extends Animal {
	public Cat() {
		super("gato ", 11);
	}

	public void som(int numSom) {
		System.out.println("Um gato, faz miau");
	}

	public void movimento(int numMovimento) {
		System.out.println("e corre.");
	}
}
