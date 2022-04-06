package listatres;

public class ModeloFuncionario {

	public String nome, setor, cargo;
	public int idade, registro;
	public boolean desempenho;

	public void idade() {
		if (idade > 16 && idade < 21) {
			System.out.println("O funcionário pode ser Jovem Aprendiz, Estagiário ou um Funcionário Efetivado");
		} else {
			System.out.println("O funcionário pode ser Estagiário ou um Funcionário Efetivado");
		}
	}
	
	public void desempenho() {
		if(desempenho=true) {
			System.out.println("O funcionário está com bom desempenho!");
		} else {
			System.out.println("O funcionário não está com bom desempenho!");

		}
	}
	
	

	public void estado() {
		System.out.println("Nome do funcionário: " + this.nome);
		System.out.println("Registro na empresa: " + this.registro);
		System.out.println("Trabalha no setor de " + this.setor + " com o cargo de " + cargo);
		System.out.println("Idade: " + this.idade);
	}
}
