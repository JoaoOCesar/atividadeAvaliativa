package entidades;

public enum Disciplina {
	FPOO("Fundamentos Programacao Orientada a Objetos"),
	LM("Linguagem de Marcacao"),
	SO("Sistemas Operacionais"),
	REDES("Redes");
	
	private String disciplina;
	
	Disciplina(String disciplina){
		this.disciplina = disciplina;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
}
