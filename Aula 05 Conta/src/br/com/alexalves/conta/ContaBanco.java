package br.com.alexalves.conta;

public class ContaBanco {
	
	public int numConta;
	protected String tipo;
	private String titular;
	private float saldo;
	private boolean status;

	
	
	public ContaBanco() {
		setSaldo(0.0f);
		setStatus(false);
	}
	
	public void estadoAtual() {
		System.out.println("-----------------");
		System.out.println(getTitular());
		System.out.println(getNumConta());
		System.out.println(getTipo());
		System.out.println(getSaldo());
		System.out.println(getStatus());
		System.out.println("-----------------");
	}
	
	public void abrirConta(String tipo) {
		setTipo(tipo);
		setStatus(true);
		if(getTipo().equals("CC")) {
			setSaldo(50f);
		}else if(getTipo().equals("CP")) {
			setSaldo(150f);
		}
	}
	
	public void fecharConta() {
		if(getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		}else if(getSaldo() < 0) {
			System.out.println("Conta está em débito");
		}else {
			setStatus(false);
		}
	}
	
	public void depositar(float value) {
		if(getStatus() && value > 0) {
			setSaldo(getSaldo() + value);
		}else {
			System.out.println("Impossivel depositar");
		}
	}
	
	public void sacar(float value) {
		if(getStatus()) {
			if(getSaldo() >= value) {
				setSaldo(getSaldo() - value); 
				System.out.println("Saca efetuado na conta de " + getTitular());
			}else {
				System.out.println("Saldo insuficiente");
			}
		}else {
			System.out.println("Impossivel sacar");
		}
	}
	
	public void pagarMensal() {
		float value = 0;
		if(getTipo().equals("cc")) {
			value = 12f;
		}else if(getTipo().equals("cp")) {
			value = 20f;
		}
		
		if(getStatus()) {
			if(getSaldo() > 0)
				setSaldo(getSaldo() - value);
			System.out.println("Mensalidade paga com sucesso!");
		}else {
			System.out.println("Impossivel pagar mensalidade");
		}
	}
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
