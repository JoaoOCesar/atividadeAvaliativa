package principal;

import java.util.Scanner;

import entidades.*;

public class Principal {
	
	
	public static void main(String[] args) {
		int x;
		Scanner lerDados = new Scanner(System.in);
		
		do {
			System.out.println("Digite 1 para cadastrar um aluno na turma.");
			System.out.println("Digite 2 para cadastrar um professor.");
			System.out.println("Digite 3 para exibir as informacoes do professor");
			System.out.println("Digite 3 para cadastrar uma nota para um Aluno.");
			System.out.println("Digite 4 para exibir as informacoes de um Aluno.");
			
			x=lerDados.nextInt();
			
		}while(x!=8);
		
		
	}
}
