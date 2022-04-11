package listaquatro;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Estoque {


	public static void main(String[] args) {

		String item1 = "Processador";
		String item2 = "Placa de vídeo";
		String item3 = "Memoria RAM";
		int menu=0;
		
		ArrayList<String> estoque = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		estoque.add(item1);
		estoque.add(item2);
		estoque.add(item3);
		
		System.out.println(estoque);
		System.out.println();
		
		estoque.remove(2);
		
		System.out.println(estoque);
		System.out.println();
		
		System.out.println("Deseja alterar algum produto? Se sim, digite o código do produto! Caso não queira, apenas digite 99: ");
		menu=scan.nextInt();
		
		try {			
			if(menu==0) {
				System.out.println("Agora digite seu novo produto: ");
				item1=scan.next();
				estoque.remove(0);
				estoque.add(item1);
				System.out.println("Seu estoque está assim: "+ estoque);
			}
			else if(menu==1) {
				System.out.println("Agora digite seu novo produto: ");
				item2=scan.next();
				estoque.remove(1);
				estoque.add(item2);
				System.out.println("Seu estoque está assim: "+ estoque);
			}
			else if (menu==99) {
				System.out.println("Obrigado por utilizar o programa!");
			
			}
		} catch (InputMismatchException erro) {
			System.out.println("Digite apenas códigos válidos para os produtos" + erro);
			System.out.println("Deseja alterar algum produto? Se sim, escolha um dos itens. Caso não, digite 99.");
			menu = scan.nextInt();
		}
	}

}
