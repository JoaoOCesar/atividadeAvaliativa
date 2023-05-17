package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
	private ArrayList<Aluno> listaAlunos;
	
	public Turma() {
		listaAlunos = new ArrayList<>();
	}
	
	public void adicionarAlunos(Aluno aluno) {
		for(int i=0; i<listaAlunos.size();i++) {
			if(listaAlunos.get(i).getCodigo()==aluno.getCodigo()) {
				
			}
		}
		}
	
	public void removerAluno(int codigo) {
		for(int i=0; i<listaAlunos.size();i++) {
			if(listaAlunos.get(i).getCodigo()==codigo) {
				System.out.println("Aluno removido com sucesso!");
				listaAlunos.remove(i);
				return;
			}
		}
		System.out.println("Aluno nao encontrado ou ja removido");
	}
	
	public void infoAluno(int codigo) {
		for(int i=0; i<listaAlunos.size();i++) {
			if(listaAlunos.get(i).getCodigo()==codigo) {
				listaAlunos.get(i).exibirInfo();
			}
		}
		System.out.println("Aluno nao encontrado!");
	}
	
	public void editarInfo(int codigo) {
		Scanner lerDados = new Scanner(System.in);
		
		for(int i=0; i<listaAlunos.size();i++) {
			if(listaAlunos.get(i).getCodigo()==codigo) {
				System.out.println("Novo nome do aluno");
				String nome = lerDados.next();
				System.out.println("Novo CPF");
				int CPF = lerDados.nextInt();
				
				listaAlunos.get(i).setNome(nome);
				listaAlunos.get(i).setCpf(CPF);
				
				System.out.println("Mudanças feitas com exito!");
			}
		}
		System.out.println("Aluno nao encontrado!");
	}
	
	public void listarAlunos() {
		if(!listaAlunos.isEmpty()) {
			System.out.println("---------Lista Alunos-------");
			for(int i=0; i<listaAlunos.size();i++) {
				System.out.println(listaAlunos.get(i).getNome());
			}
		}
		else {
			System.out.println("Nenhum aluno matriculado!");
		}
	}
	
	
}
