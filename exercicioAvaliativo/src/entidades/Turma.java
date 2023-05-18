package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Turma {
	private ArrayList<Aluno> listaAlunos;
	
	public Turma() {
		listaAlunos = new ArrayList<>();
	}
	
	public void adicionarAlunos(Aluno aluno) {
		if(!listaAlunos.isEmpty()) {
			for(int i=0; i<listaAlunos.size();i++) {
				if(listaAlunos.get(i).getCodigo()==aluno.getCodigo()) {
					System.out.println("Aluno ja cadastrado");
					return;
				}else {
					listaAlunos.add(aluno);
					return;
					}
			}
		}
		listaAlunos.add(aluno);
		System.out.println("Aluno adicionado");
		
		
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
				return;
			}
		}
		System.out.println("Aluno nao encontrado!");
	}
	
	public void editarInfo(int x,int codigo) {
		Scanner lerDados = new Scanner(System.in);
		
		if(x==1) {
			for(int i=0; i<listaAlunos.size();i++) {
				if(listaAlunos.get(i).getCodigo()==codigo) {
					System.out.println("Digite a nota");
					double nota = lerDados.nextDouble();
					listaAlunos.get(i).adicionarNota(nota);
					System.out.println("Nota adicionada!");
					return;
				}
			}
			System.out.println("Aluno nao encontrado!");
		}else if(x==2){
			for(int i=0; i<listaAlunos.size();i++) {
				if(listaAlunos.get(i).getCodigo()==codigo) {
					System.out.println("Digite qual nota deseja remover");
					int nota = lerDados.nextInt();
					listaAlunos.get(i).removerNota(nota-1);
					return;
				}
			}
			System.out.println("Aluno nao encontrado!");
		}
		
		
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
