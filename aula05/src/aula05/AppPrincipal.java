package aula05;

public class AppPrincipal {
	public static void main(String[] args) {
		Pessoa pessoa= new Pessoa("Hiany", 1233);

		Pessoa pessoa2=new Pessoa();
		Pessoa pessoa3=new Pessoa(1234);
		Pessoa pessoa4=new Pessoa("Gabriely");
		
		System.out.println(pessoa.nome);
		System.out.println("------------------------");
		System.out.println(pessoa2.nome);
		System.out.println("------------------------");
		System.out.println(pessoa3.nome);
		System.out.println("------------------------");
		System.out.println(pessoa4.nome);


	}

}
