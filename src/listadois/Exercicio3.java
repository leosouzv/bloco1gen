package listadois;

import java.util.Scanner;

public class Exercicio3 {

	static int idade = 0, contador1, contador2;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();

			if (idade < 21) {
				contador1++;
			}
			if (idade > 50) {
				contador2++;
			}
			System.out.println("O total de pessoas com menos de 21 anos é: "+ contador1 + " e com mais de 50 anos é: "+ contador2);
		}
	}
}