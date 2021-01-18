package br.com.alexalves.livro;

import br.com.alexalves.pessoa.Leitor;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private Leitor leitor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;

	

	public Livro(String titulo, String autor, Leitor leitor, int totPaginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.leitor = leitor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
	}

	public String detalhes() {
		return "Livro Titulo: " + titulo + "\nAutor: " + autor  + "\nTotalPaginas: " 
				+totPaginas + ", pagAtual: " + pagAtual + ", Aberto: " + aberto 
				+"\nLeitor: " + leitor.getNome() + "\nIdade: " + leitor.getIdade() 
				+ "\nSexo: " + leitor.getSexo();
	}

	@Override
	public void abrir() {
		if(!isAberto()) {
			setAberto(true);
		}
	}

	@Override
	public void fechar() {
		if(isAberto()) {
			setAberto(false);
		}
	}

	@Override
	public void folhear(int pag) {
		if(pag > getTotPaginas()) {
			return;
		}
		setPagAtual(pag);
	}

	@Override
	public void avancarPag() {
		if(getPagAtual() < getTotPaginas()) {
			setPagAtual(getPagAtual() + 1);
		}
	}

	@Override
	public void voltarPag() {
		if(getPagAtual() > 0) {
			setPagAtual(getPagAtual() + 1);
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Leitor getLeitor() {
		return leitor;
	}

	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	
	public int getPagAtual() {
		return pagAtual;
	}
	
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

}
