package listadois;

import java.util.Scanner;

public class Exercicio6 {

	static int numero, soma = 0;

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			soma += numero;

		} while (numero != 0);

		System.out.println("A soma dos número digitados é: " + soma);

	}
}