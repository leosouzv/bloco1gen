package listatres;

public class ModeloPaciente {

	public String nome;
	public int registro, idade, rg;
	public boolean tratamento;

	public void tratamento() {
		if (tratamento == true) {
			System.out.println("O paciente est� em tratamento");
		} else {
			System.out.println("O paciente n�o est� em tratamento");
		}
	}

	public void estado() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("RG: " + rg);
		System.out.println("Registro no Hospital: " + registro);

	}
}
