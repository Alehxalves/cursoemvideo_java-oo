package br.com.alexalves.main;
import br.com.alexalves.remotecontrol.ControleRemoto;

public class Main {

	public static void main(String[] args) {
		ControleRemoto control = new ControleRemoto();

		control.ligar();
		control.abrirMenu();
	
	}

}
