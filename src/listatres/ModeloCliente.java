package listatres;

public class ModeloCliente {

	public String nome;
	public int rg, idade;
	public long cpf;

	public void maioridade() {
		if (idade >= 18) {
			System.out.println("O cliente pode consumir bebidas alcoolicas");
		} else {
			System.out.println("O cliente não pode consumir bebidas alcoolicas");

		}
	}

	public void estado() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("RG: " + this.rg);
		System.out.println("Idade: " + this.idade);

	}

}
