package br.com.alexalves.main;

import br.com.alexalves.livro.*;
import br.com.alexalves.pessoa.Leitor;

public class Main {

	public static void main(String[] args) {

		Leitor[] p = new Leitor[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Leitor("Alex", 23, 'M');
		p[1] = new Leitor("Ana", 26, 'F');
		
		l[0] = new Livro("Aprendendo Java", "Kovacs", p[0], 300);
		l[1] = new Livro("POO para Iniciantes", "Scorpion", p[1], 250);
		l[2] = new Livro("Java Avançado", "Kovacs", p[0], 1000);
		
		l[1].folhear(250);
		l[2].avancarPag();
		
		System.out.println(l[1].detalhes() + l[2].detalhes());
	}

}
