package entidades;

public class Professor extends Pessoa{
	private String especialidade;
	private Disciplina disciplina;
	
	public Professor(String nome, int cpf, String especialidade, Disciplina disciplina) {
		super(nome,cpf);
		this.especialidade = especialidade;
		this.disciplina = disciplina;
	}
	
	public Professor(String nome, int cpf) {
		super(nome,cpf);
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("Nome do Professor: "+ getNome());
		System.out.println("Especialidade do Professor: " + especialidade);
		System.out.println("Disciplina do Professor: " + disciplina.getDisciplina());
	}
}
