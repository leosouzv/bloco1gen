package listatres;

public class ProdutoEletronico {

	public static void main(String[] args) {
		ModeloProdutoEletronico p1 = new ModeloProdutoEletronico();
		
		p1.marca="Apple";
		p1.aparelho="Iphone";
		p1.modelo="XR";
		p1.so="IOS";
		p1.funciona=true;
		p1.garantia=true;
		
		
		p1.estado();
		p1.garantia();
		p1.funcionamento();
	}

}
