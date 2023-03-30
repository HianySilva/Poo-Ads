package aula6;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AppPrincipal {
	public static void main(String[] args) {	
		List<Endereco> enderecos = new ArrayList<Endereco>();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		pessoa.setNome("Robson");
		
		
		Endereco endereco = new Endereco();
		
		endereco.setRua("Rua da felicidade");
		endereco.setRua("Rua da tristeza");
		endereco.setBairro("Feliz");
		endereco.setNumero(52);
		
		Endereco endereco2 = new Endereco();
		endereco2.setRua("Rua da tristeza");
		endereco2.setBairro("Triste");
		endereco2.setNumero(25);
		
		Endereco endereco3 = new Endereco();
		endereco3.setRua("Ruda da concordia");
		endereco3.setBairro("cc");
		endereco3.setNumero(15);
		
		pessoa.setEnderecos(enderecos);
		
		enderecos.add(endereco);
		enderecos.add(endereco2);
		enderecos.add(endereco3);
		
		System.out.println(pessoa.getNome());
		
		for (Endereco endereco1 : pessoa.getEnderecos()) {
			System.out.println(endereco1.getRua());
		}
		
		System.out.println("----------------------");
		
		/*
		 * ------------------------------------------
		*/
		Set<String> lista2 = new HashSet<String>();
		
		lista2.add("Leo");
		lista2.add("Jair");
		lista2.add("Nanda");
		lista2.add("Leo");
		
		for (String string : lista2) {
			System.out.println(string);
		}
		
		System.out.println("----------------------------");
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Leo");
		lista.add("Jair");
		lista.add("Nanda");
		lista.add("Leo");
		
		for (String string : lista) {
			System.out.println(string);
		}

	}

}
