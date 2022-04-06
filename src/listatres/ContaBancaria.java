package listatres;

public class ContaBancaria {

	public static void main(String[] args) {
		ModeloConta c1 = new ModeloConta();

		c1.banco = "Next";
		c1.codigob = 237;
		c1.nome = "Leonardo";
		c1.numeroc = 11111;
		c1.situacao = true;

		c1.estado();
		c1.situacaobancaria();
	}

}
