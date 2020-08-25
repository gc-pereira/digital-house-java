package aula07.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestaCursoStream {
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Java", 120));
		cursos.add(new Curso("PHP", 120));
		cursos.add(new Curso("JavaScript", 200));

		List<Curso> cursosNovo = cursos.stream().filter(c -> c.getValor() >= 200).collect(Collectors.toList());
		cursosNovo.forEach(c -> System.out.println(c.getNome()));
		
		Map<Integer, List<Curso>> map = cursos.stream().collect(Collectors.groupingBy(c -> c.getValor()));
		map.get(120).forEach(c -> System.out.println(c.getNome()));
		
		System.out.println(cursos.stream().mapToInt(Curso::getValor).sum());
	}
}
