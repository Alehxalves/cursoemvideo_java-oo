package br.com.alexalves.lutador;

public class Lutador{

	private String nome, nacionalidade, categoria;
	private int idade;
	private float altura, peso;
	private int vitorias, derrotas, empates;
	private int totalLutas;
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
				   int vitorias, int derrotas, int empates) {
		setNome(nome);
		setNacionalidade(nacionalidade);
		setIdade(idade);
		setAltura(altura);
		setPeso(peso);
		setVitorias(vitorias);
		setDerrotas(derrotas);
		setEmpates(empates);
		setTotalLutas(getVitorias() + getDerrotas() + getEmpates());
	}
	
	public void apresentar() {
		System.out.println("---------------------------------------------------------");
		System.out.println("ITS TIME!!, Aprasento-lhes " + getNome() + " de " + getIdade() + " anos de idade");
		System.out.println("diretamente de " + getNacionalidade() + "");
		System.out.println("pesando " + getPeso() + " Kg " + ", com " + getAltura() + "m de altura,");
		// Definifir se a palavra est� ou n�o no plural
		System.out.println("carregando " + getTotalLutas() + " lutas no total");
		System.out.println("sendo " + getVitorias() + (getVitorias() > 1 ? " vit�rias, " : " vit�ria, "));
		System.out.println(getDerrotas() + (getDerrotas() > 1 ? " derrotas e " : " derrota e "));
		System.out.println(getEmpates() + (getEmpates() > 1 ? " empates" : " empate"));
		System.out.println("---------------------------------------------------------");
	}

	public void status() {
		System.out.println("-------------------------");
		System.out.println(getNome() + " � um peso " + getCategoria());
		System.out.println("Com um total de " + getTotalLutas() + " lutas");
		System.out.println("Ganhou " + getVitorias() + (getVitorias() > 1 ? " lutas" : " luta"));
		System.out.println("Perdeu " + getDerrotas() + (getDerrotas() > 1 ? " lutas" : " luta"));
		System.out.println("Empatou " + getEmpates() + (getEmpates() > 1 ? " lutas" : " luta"));
		System.out.println("-------------------------");
	}

	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
		setTotalLutas(getTotalLutas() + 1);
	}

	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
		setTotalLutas(getTotalLutas() + 1);
	}

	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
		setTotalLutas(getTotalLutas() + 1);
	}
	
	//

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(getPeso() < 52.2) {
			this.categoria = "Inv�lido";
		}else if(getPeso() <= 70.3) {
			this.categoria = "leve";
		}else if(getPeso() <= 83.9) {
			this.categoria = "m�dio";
		}else if(getPeso() <= 120.2) {
			this.categoria = "pesado";
		}else
			this.categoria = "Inv�lido";
	}

	public int getVitorias() {
		return vitorias;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getTotalLutas() {
		return totalLutas;
	}

	private void setTotalLutas(int totalLutas) {
		this.totalLutas = totalLutas;
	}

	
}
