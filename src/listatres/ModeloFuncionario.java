package listatres;

public class ModeloFuncionario {

	public String nome, setor, cargo;
	public int idade, registro;
	public boolean desempenho;

	public void idade() {
		if (idade > 16 && idade < 21) {
			System.out.println("O funcion�rio pode ser Jovem Aprendiz, Estagi�rio ou um Funcion�rio Efetivado");
		} else {
			System.out.println("O funcion�rio pode ser Estagi�rio ou um Funcion�rio Efetivado");
		}
	}
	
	public void desempenho() {
		if(desempenho=true) {
			System.out.println("O funcion�rio est� com bom desempenho!");
		} else {
			System.out.println("O funcion�rio n�o est� com bom desempenho!");

		}
	}
	
	

	public void estado() {
		System.out.println("Nome do funcion�rio: " + this.nome);
		System.out.println("Registro na empresa: " + this.registro);
		System.out.println("Trabalha no setor de " + this.setor + " com o cargo de " + cargo);
		System.out.println("Idade: " + this.idade);
	}
}
