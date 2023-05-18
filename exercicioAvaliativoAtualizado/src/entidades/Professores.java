package entidades;

import java.util.ArrayList;

/*Classe Professores que possui um ArrayList da classe professores,
 * podendo adicionar mais de um professor.Possui os metodos de 
 * adicionar professores que adiciona um objeto da classe Professor
 * na arraylist e um metodo que exibe os professores na ArrayList junto
 * com o metodo que foi sobrescrito na classe professor.
 * 
 */

public class Professores {
	private ArrayList<Professor> listaProfessores;
	
	public Professores() {
		listaProfessores = new ArrayList<>();
	}
	
	public void adicionarProfessores(Professor p1) {
		listaProfessores.add(p1);
	}
	
	public void exibirProfessores() {
		if(!listaProfessores.isEmpty()) {
			System.out.println("-----------------PROFESSORES----------");
			for(int i=0; i<listaProfessores.size();i++) {
				listaProfessores.get(i).exibirInfo();
			}
		}else {
			System.out.println("Nenhum professor encontrado!");
		}
		
	}
}
