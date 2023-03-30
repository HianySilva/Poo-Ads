package aula8;

public class AppMain {
	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Hiany");
		pf.setIdade(20);
		pf.setCpf("123.343.456-18");
		System.out.println(pf.getNome());
		System.out.println(pf.getIdade());
		System.out.println(pf.getCpf());
		
		Endereco e= new Endereco();
		e.setBairro("Bairro ifpe");
		e.setRua("Rua Fulano");
		
		pf.setEndereco(e);
		System.out.println(pf.getEndereco().getRua());
		System.out.println(pf.getEndereco().getBairro());
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Leo");
		pj.setIdade(45);
		pj.setCnpj("234.2345.455.23");
		
		System.out.println(pj.getNome());
		System.out.println(pj.getIdade());
		System.out.println(pj.getCnpj());
		
	}

}
