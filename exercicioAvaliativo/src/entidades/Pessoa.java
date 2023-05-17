package entidades;

public abstract class Pessoa {
	private String nome;
	private int cpf;
	
	
	public Pessoa(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setCpf(int cpf) {
		this.cpf=cpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return "nome: " + this.nome + ", CPF: " + cpf;
	}
	
	public abstract void exibirInfo();
}
