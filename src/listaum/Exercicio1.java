package listaum;

import java.util.Scanner;

public class Exercicio1 {

	static int n1, n2, n3, maior;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		n1 = scan.nextInt();

		System.out.print("Digite um segundo n�mero: ");
		n2 = scan.nextInt();

		System.out.print("Digite um terceiro n�mero: ");
		n3 = scan.nextInt();

		if (n1 >= n2 && n1 >= n3) {
			maior = n1;
		} else if (n2 >= n3) {
			maior = n2;
		} else {
			maior = n3;
		}
		System.out.println("O maior n�mero �: " + maior);

	}
}
