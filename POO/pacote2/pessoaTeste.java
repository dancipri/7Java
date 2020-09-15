package pacote2;

public class pessoaTeste {
	public static void main(String args[]) {

		// classe pessoa
		pessoa a = new pessoa("Jhon", "Diva, 318 Gapaouva", "gerente", 45567186, 32);
		a.imprimirInfo();

		pessoa b = new pessoa("\nJonas", "Vedendor.");
		b.imprimirProfissao();

		pessoa c = new pessoa("\nJones", 433456777, 23);
		c.imprimirIdade();

		// classe administrador
		administrador Adriana = new administrador("\nJonathan", "Vednerdor", "2000");
		System.out.println(Adriana.getNome());
		System.out.println(Adriana.getProfissao());
		System.out.println(Adriana.getAjudaDeCusto());

		administrador Isadora = new administrador("\nJustice", "designer", "2500");
		System.out.println(Isadora.getNome());
		System.out.println(Isadora.getProfissao());
		System.out.println(Isadora.getAjudaDeCusto());

		// classe operario
		Operario Jose = new Operario("\nJose", 1000, 40);
		System.out.println(Jose.getNome());
		System.out.println(Jose.getValorProducao());
		Jose.imprimirOperario();

		Operario Marta = new Operario("\nJoao", 1500,55);
		System.out.println(Marta.getNome());
		System.out.println(Marta.getValorProducao());
		Marta.imprimirOperario();
	}
}
