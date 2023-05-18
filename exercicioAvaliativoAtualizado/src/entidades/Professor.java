package entidades;

/*Classe professor com o construtor que herda atributos da classe pai
 * e atributos da propria classe professor, tem um construtor vazio
 * somente com os atributos herdados da classe pai e faz um override
 * no metodo de exibição de informação(exibirInfo).
 */

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
		System.out.println("\n-------------------------------\n");
		System.out.println("Nome do Professor: "+ getNome());
		System.out.println("Especialidade do Professor: " + especialidade);
		System.out.println("Disciplina do Professor: " + disciplina.getDisciplina());
		System.out.println("\n-------------------------------\n");
	}
}
