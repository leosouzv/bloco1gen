package listaum;

import java.util.Scanner;

public class Exercicio2 {

	static int n1, n2, n3, maior, meio, menor;

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
			if (n2 >= n3) {
				meio = n2;
				menor = n3;
			} else {
				meio = n3;
				menor = n2;
			}
		} else if (n2 >= n3) {
			maior = n2;
			if (n1 >= n3) {
				meio = n1;
				menor = n3;
			} else {
				meio = n3;
				menor = n1;
			}
		} else if (n3 >= n1 && n3 >= n2) {
			maior = n3;
			if (n1 >= n2) {
				meio = n1;
				menor = n2;
			} else {
				meio = n2;
				menor = n1;
			}

		}

		System.out.println("A ordem crescente dos n�meros �: " + menor + " ; " + meio + " ; " + maior);

	}

}
