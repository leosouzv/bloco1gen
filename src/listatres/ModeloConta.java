package listatres;

public class ModeloConta {

	public String banco, nome;
	public int numeroc, codigob;
	public boolean situacao;

	public void situacaobancaria() {
		if (situacao = true) {
			System.out.println("A conta est� ativa");
		} else {
			System.out.println("A conta se encontra inativa");
		}

	}

	public void estado() {
		System.out.println("Nome usu�rio: " + this.nome);
		System.out.println("Banco: " + this.banco);
		System.out.println("C�digo do banco: " + this.codigob);
		System.out.println("N�mero da Conta: " + this.numeroc);
	}
}
