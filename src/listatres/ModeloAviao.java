package listatres;

public class ModeloAviao {

	public String modelo, tipouso;
	public int anofabric;
	public boolean documentacao;

	public void voar() {
		if (documentacao == true) {
			System.out.println("O avião pode voar");
		} else {
			System.out.println("O avião não pode voar");

		}

	}

	public void estado() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tipo de uso: " + this.tipouso);
		System.out.println("Ano de fabricação: " + this.anofabric);
		System.out.println("Documentação do avião está OK?: " + this.documentacao);

	}

}
