package pacote3;

public class AnimalTeste {
	public static void main(String args[]) {
		Cat gato = new Cat();
		Dog cachorro = new Dog();
		monkey monkey = new Monkey1();

		Animal animal = null;
		int n = (int) (Math.random() * 4.0);
		System.out.println(n);
		switch (n) {
		case 1:
			animal = gato;
			break;
		case 2:
			animal = cachorro;
			break;
		case 3:
			animal = macaco;
			break;
		default:
			System.out.println("Erro na digita��o...");
		}
		if (animal != null) {
			animal.som(1);
			animal.movimento(1);
		}
	}
}
