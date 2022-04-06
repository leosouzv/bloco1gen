package listatres;

public class ModeloPatinete {

	public String marca, modelo, tipo;
	public int velomax, carga;
	public boolean bluetooth;

	public void autonomia() {
		if (carga == 100) {
			System.out.println("O patinete possui uma autônomia de 32km");
		} else {
			System.out.println("O patinete possui uma autônomia menor que 32km");
		}

	}

	public void estado() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tipo de patinete: " + this.tipo);
		System.out.println("Velocidade Máxima: " + this.velomax+" Km/h");
		System.out.println("Pussui bluetooth? " + this.bluetooth);
	}
}
