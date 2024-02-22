package br.com.dioPOO.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descrição curso de Java");
		curso1.setCargahoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de Js");
		curso2.setDescricao("Descrição curso de Js");
		curso2.setCargahoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("Descrição mentoria java");
		mentoria.setData(LocalDate.now());

		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Devloper");
		bootcamp.setDescricao("Descrição: Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

	}

}
