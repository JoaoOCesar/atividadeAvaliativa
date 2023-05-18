package principal;

import java.util.Scanner;

import entidades.*;

public class Principal {
	
	public static void menu(int x,Turma turma, Professores professores, Scanner lerDados) {
		
		switch(x) {
		case 1:
			System.out.println("Digite o nome do Aluno:");
			String nome = lerDados.next();
			System.out.println("Digite o CPF do Aluno: ");
			int cpf = lerDados.nextInt();
			System.out.println("Digite o numero de chamada do Aluno: ");
			int codigo = lerDados.nextInt();
			
			System.out.println("Digite 1 para cadastrar o Aluno em FPOO");
			System.out.println("Digite 2 para cadastrar o Aluno em LM");
			System.out.println("Digite 3 para cadastrar o Aluno em SO");
			System.out.println("Digite 4 para cadastrar o Aluno em REDES");
			int y = lerDados.nextInt();
			
				if(y==1) {
					Aluno aluno = new Aluno(nome,cpf,codigo,Disciplina.FPOO);
					turma.adicionarAlunos(aluno);
					System.out.println("Aluno cadastrado em "+ Disciplina.FPOO.getDisciplina());
				}else if(y==2) {
					Aluno aluno = new Aluno(nome,cpf,codigo,Disciplina.LM);
					turma.adicionarAlunos(aluno);
					System.out.println("Aluno cadastrado em "+ Disciplina.LM.getDisciplina());
				}else if(y==3) {
					Aluno aluno = new Aluno(nome,cpf,codigo,Disciplina.SO);
					turma.adicionarAlunos(aluno);
					System.out.println("Aluno cadastrado em "+ Disciplina.SO.getDisciplina());
				}else if(y==4) {
					Aluno aluno = new Aluno(nome,cpf,codigo,Disciplina.REDES);
					turma.adicionarAlunos(aluno);
					System.out.println("Aluno cadastrado em "+ Disciplina.REDES.getDisciplina());
				}else {
					System.out.println("erro de entrada");
				}
			break;
		case 2:
			System.out.println("Digite o nome do professor: ");
			nome = lerDados.next();
			System.out.println("Digite o CPF do professor");
			cpf = lerDados.nextInt();
			System.out.println("Digite a especializacao do professor");
			String especializacao = lerDados.next();
			
			System.out.println("Digite 1 para cadastrar o Professor em FPOO");
			System.out.println("Digite 2 para cadastrar o Professor em LM");
			System.out.println("Digite 3 para cadastrar o Professor em SO");
			System.out.println("igite 4 para cadastrar o Professor em REDES\n");
			y= lerDados.nextInt();
			
				if(y==1) {
					Professor p1 = new Professor(nome,cpf,especializacao, Disciplina.FPOO);
					System.out.println("Professor da aulas de " +Disciplina.FPOO.getDisciplina());
					professores.adicionarProfessores(p1);
				}else if(y==2) {
					Professor p1 = new Professor(nome,cpf,especializacao, Disciplina.LM);
					System.out.println("Professor da aulas de " +Disciplina.LM.getDisciplina());
					professores.adicionarProfessores(p1);
				}else if(y==3) {
					Professor p1 = new Professor(nome,cpf,especializacao, Disciplina.SO);
					System.out.println("Professor da aulas de " +Disciplina.SO.getDisciplina());
					professores.adicionarProfessores(p1);
				}else if(y==4) {
					Professor p1 = new Professor(nome,cpf,especializacao, Disciplina.REDES);
					System.out.println("Professor da aulas de " +Disciplina.REDES.getDisciplina());
					professores.adicionarProfessores(p1);
				}else {
					System.out.println("erro de entrada");
				}
			
			break;
		case 3:
			
			System.out.println("Digite o numero de chamada do Aluno:");
			codigo = lerDados.nextInt();
			System.out.println("Digite 1 para cadastrar ou 2 para remover uma nota:");
			x = lerDados.nextInt();
			
			turma.editarInfo(x, codigo);
			
			break;
		case 4:
			System.out.println("Digite o numero de Chamada do Aluno: ");
			codigo = lerDados.nextInt();
			turma.infoAluno(codigo);
			
			break;
		case 5:
			turma.listarAlunos();
			break;
		case 6:
			System.out.println("Digite o numero de Chamada do Aluno");
			codigo = lerDados.nextInt();
			turma.removerAluno(codigo);
			break;
		case 7:
			professores.exibirProfessores();
			break;
		case 8:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Erro de entrada!");
				break;
		}
		
	}
	
	
	public static void main(String[] args) {
		int x;
		Scanner lerDados = new Scanner(System.in);
		Turma turma = new Turma();
		Professores professores = new Professores();
		
		do {
			System.out.println("\nDigite 1 para CADASTRAR um ALUNO na turma.");
			System.out.println("Digite 2 para CADASTRAR um PROFESSOR.");
			System.out.println("Digite 3 para CADASTRAR uma ou REMOVER uma NOTA para de um ALUNO.");
			System.out.println("Digite 4 para EXIBIR as INFORMACOES de um ALUNO.");
			System.out.println("Digite 5 para MOSTRAR a LISTA de ALUNOS matriculados.");
			System.out.println("Digite 6 para REMOVER um ALUNO.");
			System.out.println("Digite 7 para EXIBIR os PROFESSORES cadastrados.");
			System.out.println("Digite 8 para sair do programa.");
			
			x=lerDados.nextInt();
			menu(x,turma,professores,lerDados);
			
		}while(x!=8);
		
		lerDados.close();
	}
}
