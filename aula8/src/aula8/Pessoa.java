package aula8;

public class Pessoa {
	private String nome;
	private int idade;
	private Endereco endereco;
	
	public Pessoa() {
	
	}
	

	public Pessoa (String nome, int idade) {
	   super();
		this.nome=nome;
		this.idade=idade;
	}
	



	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void Falar() {
		
	}

}
