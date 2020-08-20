package aula05.cursos.teste;

import aula05.cursos.Aluno;
import aula05.cursos.Curso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestaAluno {
	public static void main(String[] args) {

		List<Aluno> alunosJava = new ArrayList<>();
		List<Aluno> alunosFrontEnd = new ArrayList<>();
		
		Aluno maria = new Aluno("Maria", 382, 21);
		Aluno juliana = new Aluno("Juliana", 286, 21);
		Aluno carlos = new Aluno("Carlos", 747, 21);

		Aluno joao = new Aluno("Joao", 2514, 21);
		Aluno jose = new Aluno("Jose", 2514, 21);
		Aluno pedro = new Aluno("Pedro", 4587, 17);

		Curso curso = new Curso();
		curso.setNome("JAVA");
		curso.setPeriodo("Noturno");

		alunosJava.add(joao);
		alunosJava.add(jose);
		alunosJava.add(pedro);
		
		alunosFrontEnd.add(maria);
		alunosFrontEnd.add(juliana);
		alunosFrontEnd.add(carlos);

		HashMap<String, List<Aluno>> mapaAlunos = new HashMap<>();
		mapaAlunos.put("JAVA", alunosJava);
		mapaAlunos.put("FrontEnd", alunosFrontEnd);

		for (String keySet : mapaAlunos.keySet()) {
			System.out.println(keySet);
			for(Aluno aluno: mapaAlunos.get(keySet)) {
				System.out.println(aluno.toString());
			}
		}

		// curso.setAlunos(alunos);

		/*
		 * for(Aluno aluno: alunos) { System.out.println(aluno.getNome()); }
		 * 
		 * System.out.println(alunos.get(2).getNome());
		 */
	}
}
