package listaum;

import java.lang.Object;
import java.util.Scanner;

public class Exercicio4 {

	static int n1;

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		n1 = scan.nextInt();

		if (n1 % 2 == 0) {

			System.out.println("O número " + n1 + " é par e sua raiz quadrada é: " + Math.sqrt(n1));
		} else {
			System.out.println("O número " + n1 + " é impar e seu quadrado é: " + n1 * n1);

		}
	}
}
