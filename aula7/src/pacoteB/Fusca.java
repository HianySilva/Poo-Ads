package pacoteB;

import pacoteA.Carro;

public class Fusca extends Carro {
	public void imprimirModelo() {
		System.out.println(modelo);
	}
	public void acessarCarro() {
		Carro carro = new Carro();
		System.out.println(carro.modelo);
	}

}
