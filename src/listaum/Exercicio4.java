package listaum;

import java.lang.Object;
import java.util.Scanner;

public class Exercicio4 {

	static int n1;

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		n1 = scan.nextInt();

		if (n1 % 2 == 0) {

			System.out.println("O n�mero " + n1 + " � par e sua raiz quadrada �: " + Math.sqrt(n1));
		} else {
			System.out.println("O n�mero " + n1 + " � impar e seu quadrado �: " + n1 * n1);

		}
	}
}
