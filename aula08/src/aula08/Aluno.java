package aula08;

public class Aluno extends Pessoa {
	private String semestre;
	private String curso ;
	
	public Aluno() {
		super();
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
