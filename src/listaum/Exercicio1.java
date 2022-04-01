package listaum;

import java.util.Scanner;

public class Exercicio1 {

	static int n1, n2, n3, maior;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número: ");
		n1 = scan.nextInt();

		System.out.print("Digite um segundo número: ");
		n2 = scan.nextInt();

		System.out.print("Digite um terceiro número: ");
		n3 = scan.nextInt();

		if (n1 >= n2 && n1 >= n3) {
			maior = n1;
		} else if (n2 >= n3) {
			maior = n2;
		} else {
			maior = n3;
		}
		System.out.println("O maior número é: " + maior);

	}
}
