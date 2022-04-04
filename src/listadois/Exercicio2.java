package listadois;

import java.util.Scanner;

public class Exercicio2 {

	static int n1, contadorpar, contadorimpar;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for (int x = 0; x < 10; x++) {
			System.out.println("Digite um número: ");
			n1 = scan.nextInt();
			if (n1 % 2 == 0) {
				contadorpar++;
			} else {
				contadorimpar++;
			}

		}
		System.out.println("O total de números pares é: " + contadorpar + " e o2 total de ímpares é: " + contadorimpar);
	}

}
