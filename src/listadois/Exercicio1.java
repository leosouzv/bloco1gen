package listadois;

public class Exercicio1 {

	static int n1;

	public static void main(String[] args) {
		for (n1 = 1000; n1 < 2000; n1++) {
			if (n1 % 11 == 5) {
				System.out.println("Os números são: " + n1);
			}
		}
	}
}
