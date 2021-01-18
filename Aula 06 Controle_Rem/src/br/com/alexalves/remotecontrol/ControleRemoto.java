package br.com.alexalves.remotecontrol;

public class ControleRemoto implements Controlador{

	private int volume;
	private int maxVolume;
	private boolean ligado;
	private boolean tocando;
	private int volumeAtual;

	public ControleRemoto() {
		setVolume(50);
		setLigado(false);
		setTocando(false);
		this.maxVolume = 100;

	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
		if(getVolume() > 0)
			setVolumeAtual(getVolume());
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	private int getVolumeAtual() {
		return volumeAtual;
	}
	
	private void setVolumeAtual(int volume) {
		this.volumeAtual = volume;
	}
	
	private int getMaxVolume() {
		return maxVolume;
	}
	
	//Métodos Abstratos.	
	@Override
	public void ligar() {
		setLigado(true);
		setVolume(50);
	}

	@Override
	public void desligar() {
		setLigado(false);
		setVolume(0);
		setTocando(false);
	}

	@Override
	public void abrirMenu() {
		if(isLigado()) {
			System.out.println("--------MENU--------");
			System.out.println("Está ligado? " + isLigado());
			System.out.println("Está tocando? " + isTocando());
			System.out.print("Volume: " + getVolume() + " ");
			
			for(int i = 10; i <= getVolume(); i += 10) {
				System.out.print("|");
			}
			System.out.println("");
			System.out.println("--------------------");
		}else
			System.out.println("Aparelho desligado.");
			
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}

	@Override
	public void maisVolume() {
		if(isLigado()) {
			if(getVolume() < getMaxVolume()) {
				setVolume(getVolume() + 5);
			}else
				System.out.println("Volume está no máximo");
		}
	}		

	@Override
	public void menosVolume() {
		if(isLigado()) {
			if(getVolume() > 0) {
				setVolume(getVolume() - 5);
			}else
				System.out.println("Volume está no mínimo");
		}
	}

	@Override
	public void ligarMudo() {
		if(isLigado() && getVolume() > 0)
			setVolume(0);
	}

	@Override
	public void desligarMudo() {
		if(isLigado() && getVolume() == 0)
			setVolume(getVolumeAtual());
	}

	@Override
	public void play() {
		if(isLigado()) {
			if(!isTocando()) {
				setTocando(true);
			}else
				System.out.println("Impossível reproduzir.");
		}
	}

	@Override
	public void pause() {
		if(isLigado()) {
			if(isTocando()) {
				setTocando(false);
			}else
				System.out.println("Impossível pausar.");
		}
	}
	
}
