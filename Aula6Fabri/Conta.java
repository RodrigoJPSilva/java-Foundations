package Aula6Fabri;

class Conta {

	// Definir as variáveis: propriedades
	private int numero;
	private String titular;
	private double saldo, limite;

	public String getTitular() {
		return this.titular;
	}
	public int getNumero() {
		return this.numero;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public double getLimite() {
		return this.limite;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	// Comportamentos da Conta
	public boolean saca(double quantidade) {
		if (saldo < quantidade) {
			System.out.println("\nSaldo insuficiente");
			return false;
		} else {
			double novoSaldo = this.saldo - quantidade;
			this.saldo = novoSaldo;
			return true;
		}
	}

	
	public void deposita(double bufunfa) {
		this.saldo += bufunfa;
	}

	public boolean pixpara(Conta destino, double valor) {
		boolean saqueOk = this.saca(valor);
		if (saqueOk == false) {
			System.out.println("\nTransferência não realizada");
			return false;
		} else {
			destino.deposita(valor);
			System.out.println("\nTransferência realizada com sucesso!");
			return true;
		}
	}
}
