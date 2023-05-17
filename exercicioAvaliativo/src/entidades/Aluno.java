package entidades;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	private int codigo;
	private Disciplina disciplina;
	private ArrayList<Double> listaNotas;
	private double media;
	
	public Aluno(String nome, int cpf, int codigo, Disciplina disciplina) {
		super(nome,cpf);
		this.codigo = codigo;
		this.disciplina = disciplina;
		listaNotas = new ArrayList<>();
	}
	
	public Aluno(String nome, int cpf) {
		super(nome, cpf);
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}

	public double getMedia() {
		return media;
	}

	public void adicionarNota(Double nota) {
		listaNotas.add(nota);
	}
	
	public void removerNota(int indice) {
		for(int i=0; i<listaNotas.size();i++) {
			if(listaNotas.get(i) == indice) {
				System.out.println((1+i) + "° Nota removida com sucesso!");
				listaNotas.remove(i);
				return;
			}
		}
		System.out.println("Nota nao encontrada");
	}
	
	public void listarNotas() {
		for(int i=0; i<listaNotas.size();i++) {
			System.out.println("--------Notas--------");
			System.out.println((1+i)+"° NOTA: " + listaNotas.get(i));
		}
	}
	
	
	public void calculaMedia(){
		double soma=0;
		for(int i=0; i<listaNotas.size();i++) {
			soma = soma+listaNotas.get(i);
		}
		media=soma/listaNotas.size();
		
		if(media>=6) {
			System.out.println("Aluno Aprovado!");
		}else {
			System.out.println("Aluno Reprovado!");
		}
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("Nome do Aluno: " + getNome());
		System.out.println("Numero da Chamada: " + codigo);
		System.out.println("Disciplina sendo cursada pelo Aluno: " + disciplina);
		listarNotas();
		System.out.println("Media Atual: " + media);
	}
		
}
