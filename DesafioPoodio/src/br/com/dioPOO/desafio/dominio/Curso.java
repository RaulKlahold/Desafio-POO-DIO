package br.com.dioPOO.desafio.dominio;

public class Curso {
	private String titulo;
	private String descrição;
	private int cargahoraria;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	public int getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

}
