package br.com.alexalves.uec;

import java.util.Random;

import br.com.alexalves.lutador.Lutador;

public class Luta {
	
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;
	
	public Luta() {
		setDesafiado(null);
		setDesafiante(null);
		setAprovado(false);
		setRounds(3);
	}
		
	public void marcarLuta(Lutador desafiado, Lutador desafiante) {
		if(desafiado.getCategoria().equals(desafiante.getCategoria())) {
			if(desafiado != desafiante) {
				setAprovado(true);
				setDesafiado(desafiado);
				setDesafiante(desafiante);
			}else
				System.out.println("Concorrentes iguais, luta negada!.");
		}else
			System.out.println("Lutadores de categorias diferentes, luta negada!.");
		
	}
	
	public void lutar() {
		if(isAprovado() && getRounds() > 0) {		
			System.out.println("### DESAFIADO ###");
			getDesafiado().apresentar();
			System.out.println("### DESAFIANTE ###");
			getDesafiante().apresentar();
			Random random = new Random();
			//// Rounds ganhos por cada lutador.
			int l1 = 0, l2 = 0;
			
			for(int i = 0; i < getRounds(); i++) {
				int vencedor = random.nextInt(3);
				
				System.out.println("-------- RESULTADO DO "+(i+1)+" ROUND --------");
				switch (vencedor) {
				
				case 0://Empate
					System.out.println("Temos um empate no " + (i+1) + " round!");
					break;
				case 1://Desafiado vencedor.
					System.out.println(getDesafiado().getNome() + " ganha o " + (i+1) + " round!");
					l1++;
					break;
				case 2://Desafiante vencedor.
					System.out.println(getDesafiante().getNome() + " ganha o " + (i+1) + " round!");
					l2++;
					break;
				default:
					System.out.println("Luta indisponível");
					break;
				}
			}
			System.out.println("--------------------------------------");
			//// Contagem de rounds ganhos.
			if(l1 > l2) {
				System.out.println("E o grande vencedor foi " + getDesafiado().getNome()+"!");
				getDesafiado().ganharLuta();
				getDesafiante().perderLuta();
			}else if(l1 < l2) {
				System.out.println("E o grande vencedor foi " + getDesafiante().getNome()+"!");
				getDesafiante().ganharLuta();
				getDesafiado().perderLuta();
			}else
				System.out.println("Senhoras e senhores temos um empate!");
				getDesafiado().empatarLuta();
				getDesafiante().empatarLuta();
			////
		}else
			System.out.println("A luta não pode acontecer");
	}
	
	public Lutador getDesafiado() {
		return desafiado;
	}
	private void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	private void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		if(rounds % 2 != 0)
			this.rounds = rounds;
		else
			System.out.println("O número de rounds deve ser ímpar");
	}
	public boolean isAprovado() {
		return aprovado;
	}
	private void setAprovado(boolean aprovada) {
		this.aprovado = aprovada;
	}
		
}
