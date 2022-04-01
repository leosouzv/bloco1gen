package listaum;

import java.util.Scanner;

public class Exercicio3 {

	static int n1;

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite sua idade em anos: ");
		n1 = scan.nextInt();

		if (n1 < 10) {
			System.out.println("Você não entra em nenhuma categoria do programa");
		} else if (n1 >= 10 && n1 <= 14) {
			System.out.println("Sua categoria é: infatil");
		} else if (n1 >= 15 && n1 <= 17) {
			System.out.println("Sua categoria é: juvenil");
		} else if (n1 >= 18 && n1 <= 25) {
			System.out.println("Sua categoria é: adulto");
		}

	}

}
