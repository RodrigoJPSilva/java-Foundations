package Aula6Fabri;

public class TesteDaConta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta destino;
		destino = new Conta(); // Associando o objeto conta a variável
		
		destino.setTitular("André");
		destino.setNumero(40028922);
		destino.setSaldo(0.00);
		destino.setLimite(4000.00);
		
		System.out.printf("O saldo da conta %s é de R$%.2f\n",destino.getTitular(),destino.getSaldo());
		
		
		Conta origem;
		origem= new Conta(); // Associando o objeto conta a variável
		
		origem.titular = "Carlos";
		origem.numero = 40028922;
		origem.saldo = 40000.00;
		origem.limite = 4000.00;

		System.out.printf("\nO saldo da conta de %s é de R$%.2f",origem.getTitular(),origem.getSaldo());
		origem.pixpara(destino, 5000);
		System.out.printf("\n\nO saldo da conta %s é de R$%.2f ",destino.getTitular(),destino.getSaldo());
		
		System.out.printf("\n\nO novo saldo da conta de %s é de R$%.2f",origem.getTitular(),origem.getSaldo());

	
	}

}
