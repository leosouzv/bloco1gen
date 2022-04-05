package listadois;

import java.util.Scanner;

public class Exercicio6 {

	static int n1, soma = 0, contador, media;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Digite um número inteiro: ");
			n1 = scan.nextInt();
			if (n1 % 3 == 0 && n1!=0) {
				soma += n1;
				contador++;
			}
			else {
				
			};
		} while (n1 != 0);

		media = (soma / contador);
		System.out.println("A média dos números é: " + media);

	}
}