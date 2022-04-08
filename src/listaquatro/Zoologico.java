package listaquatro;

public class Zoologico {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica pre = new Preguica();

		dog.rundog();
		dog.emitirsom();

		System.out.println();

		horse.runhorse();
		horse.emitirsom();

		System.out.println();

		pre.climb();
		pre.emitirsom();

	}

}
