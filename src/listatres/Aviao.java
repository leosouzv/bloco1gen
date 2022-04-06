package listatres;

public class Aviao {

	public static void main(String[] args) {
		ModeloAviao a1 = new ModeloAviao();

		a1.modelo = "Boeing 777";
		a1.anofabric = 2002;
		a1.tipouso = "Civil";
		a1.documentacao = true;

		a1.estado();
		a1.voar();
	}
}
