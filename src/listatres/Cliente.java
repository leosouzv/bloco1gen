package listatres;

public class Cliente {

	public static void main(String[] args) {
		ModeloCliente c1 = new ModeloCliente();

		c1.nome = "Leonardo";
		c1.idade = 17;
		c1.rg = 121231235;
		c1.cpf = 12312312312l;

		c1.estado();
		c1.maioridade();
	}
}
