package listatres;

public class Paciente {

	public static void main(String[] args) {
		ModeloPaciente pac = new ModeloPaciente();
		pac.nome = "Leonardo";
		pac.idade = 19;
		pac.rg = 121231233;
		pac.registro = 1232133;
		pac.tratamento = false;

		pac.estado();
		pac.tratamento();

	}

}
