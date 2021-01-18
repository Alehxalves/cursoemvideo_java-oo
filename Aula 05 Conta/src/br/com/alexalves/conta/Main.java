package br.com.alexalves.conta;

public class Main {
	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		ContaBanco c2 = new ContaBanco();
		
		c1.setTitular("Maria");
		c1.setNumConta(777);
		c1.abrirConta("CC");
		c1.depositar(300);
		c1.fecharConta();
		
		c2.setTitular("Jose");
		c2.setNumConta(222);
		c2.abrirConta("CP");
		c2.depositar(500);
		c2.sacar(100);

		
		c1.estadoAtual();
		c2.estadoAtual();
	}
}
