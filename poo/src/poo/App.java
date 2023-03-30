package poo;

public class App {
	public static void main(String[] args) {
		Loja l = new Loja();
		l.nomeDaLoja = " Makeup";
		l.cnpj ="1233866";
		System.out.println("Nome da Loja: " +l.nomeDaLoja);
		System.out.println( "Cnpj :"+ l.cnpj);
		System.out.println("------------------");
		
		
		Cliente c = new Cliente();
		c.nome= "Carol";
		c.cpf = "12345489";
		System.out.println("Cliente " + c.nome);
		System.out.println("Cpf do Cliente:" + c.cpf);
		System.out.println("------------------");

		
		Produto pr= new Produto();
		pr.nome = "Rimel";
		pr.preço= 14.00f;
		System.out.println("Nome do Produto: " + pr.nome);
		System.out.println("Preço do produto: " +pr.preço);
		System.out.println("------------------");

		Itens i = new Itens ();
		i.quantidade = 2;
		
		
		Pedidos p = new Pedidos();
		p.numeroDePedidos="1";
		p.itens= i;
		System.out.println("Numeros de Pedidos:" + p.numeroDePedidos);
		System.out.println( "Quantidade de Itens: " + p.itens.quantidade);
		
		}

		

}
