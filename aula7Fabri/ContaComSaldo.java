package aula7Fabri;

public class ContaComSaldo {
	
	private String nome;
	private double saldo;
	
	public ContaComSaldo(String nome, double saldo) {
		this.nome = nome;
	if (saldo > 0.0) {
		this.saldo = saldo;
	}
	}
	public void deposita(double valorDepositado) {
		if (valorDepositado > 0.0) {
			saldo += valorDepositado;
		}
	}
	public double getSaldo() {
		return saldo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return nome;
	}
}
