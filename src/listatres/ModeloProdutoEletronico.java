package listatres;

public class ModeloProdutoEletronico {
	public String marca, modelo, so, aparelho;
	public boolean funciona, garantia;

	public void funcionamento() {
		if (funciona == true) {
			System.out.println("O aparelho est� funcionando!");
		} else {
			System.out.println("O aparelho n�o est� funcionando!");
		}

	}
	
	public void garantia(){
		if(garantia==true) {
			System.out.println("O aparelho possui garantia!");
		} else {
			System.out.println("O aparelho n�o possui garantia!");
		}
		
	}

	public void estado() {

		System.out.println("O produto �: " + this.marca +" "+ this.aparelho +" "+ this.modelo);
		System.out.println("O Sistema Operacional �: " + this.so);
	}
}
