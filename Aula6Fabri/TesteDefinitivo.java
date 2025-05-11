package Aula6Fabri;

public class TesteDefinitivo {

	public static void main(String[] args) {
		
		Conta outraconta = new Conta();
		outraconta.saldo = 1000;
		double novoSaldo = -200.00;
		
//		Quero retirar 200
		if (novoSaldo < 0) {
			System.out.println("Não é possivel efetuar essa transação");
		}
		else {
			outraconta.saldo = novoSaldo;
			System.out.println("Transação realização realizada com sucesso");
		}
	}

}
