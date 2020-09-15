package pacote3;

public class Dog extends Animal {
	public Dog() {
		super("cachorro ", 5);
	}

	public void som(int numSom) {
		System.out.println("Um Chachorro, faz auau.");
	}

	public void movimento(int numMovimento) {
		System.out.println("e  corre.");
	}
}
