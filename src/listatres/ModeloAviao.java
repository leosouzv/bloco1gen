package listatres;

public class ModeloAviao {

	public String modelo, tipouso;
	public int anofabric;
	public boolean documentacao;

	public void voar() {
		if (documentacao == true) {
			System.out.println("O avi�o pode voar");
		} else {
			System.out.println("O avi�o n�o pode voar");

		}

	}

	public void estado() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tipo de uso: " + this.tipouso);
		System.out.println("Ano de fabrica��o: " + this.anofabric);
		System.out.println("Documenta��o do avi�o est� OK?: " + this.documentacao);

	}

}
