package aula6;

import java.util.List;

	public class Pessoa {
		private int cpf;
		private String nome;
		private List<Endereco> enderecos;
		
		public Pessoa() {
			
		}

		public int getCpf() {
			return cpf;
		}

		public void setId(int cpf) {
			this.cpf = cpf;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public List<Endereco> getEnderecos() {
			return enderecos;
		}

		public void setEnderecos(List<Endereco> enderecos) {
			this.enderecos = enderecos;
		}
		
		

	}

