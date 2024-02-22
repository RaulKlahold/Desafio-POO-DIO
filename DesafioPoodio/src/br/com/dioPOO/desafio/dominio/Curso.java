package br.com.dioPOO.desafio.dominio;

public class Curso extends Conteudo {

	private int cargahoraria;

	@Override
	public double calcularXp() {

		return XPpadrao * cargahoraria;
	}

	public int getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(int cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descrição=" + getDescricao() + ", cargahoraria=" + cargahoraria
				+ "]";
	}

}
