package br.com.alexalves.uec;

import java.util.ArrayList;
import java.util.List;
import br.com.alexalves.lutador.Lutador;

public class UltraEmojiCombat{
		
	public static void main(String[] args) {
		List<Lutador> l = new ArrayList<>();
		l.add(new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1));
		l.add(new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3));
		l.add(new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1));
		l.add(new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 12));
		l.add(new Lutador("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3));
		l.add(new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4));
		
		Luta uec01 = new Luta();
		uec01.marcarLuta(l.get(4), l.get(5));
		uec01.lutar();
	}
}