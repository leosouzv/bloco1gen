package listatres;

public class Funcionario {

	public static void main(String[] args) {
		ModeloFuncionario f1 = new ModeloFuncionario();

		f1.nome = "Leonardo";
		f1.idade = 19;
		f1.registro = 123445;
		f1.setor = "T.I";
		f1.cargo = "Desenvolvedor";
		f1.desempenho=true;

		f1.estado();
		f1.idade();
		f1.desempenho();
	}

}
