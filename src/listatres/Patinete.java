package listatres;

public class Patinete {

	public static void main(String[] args) {

		ModeloPatinete pa = new ModeloPatinete();

		pa.marca = "Foston";
		pa.modelo = "S09";
		pa.tipo = "Elétrico";
		pa.velomax = 25;
		pa.bluetooth = true;
		pa.carga = 100;

		pa.estado();
		pa.autonomia();
	}

}
