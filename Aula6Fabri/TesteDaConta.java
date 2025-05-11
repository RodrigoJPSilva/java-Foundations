package Aula6Fabri;

public class TesteDaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta minhaConta;
		minhaConta = new Conta(); // Associando o objeto conta a variável
		
		minhaConta.setTitular("Carlos");
		minhaConta.setNumero(1077764);
		minhaConta.setSaldo(1500.00);
		minhaConta.setLimite(500.00);
		System.out.println("O saldo da sua conta é: "+minhaConta.getSaldo());
		
		// saca 200 reais
		minhaConta.saca(200);
		
		minhaConta.deposita(500);
		
		
		System.out.println("Saldo após as operações: " + minhaConta.getSaldo());
	}

}
