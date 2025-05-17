package aula7Fabri;

import java.util.Scanner;

public class TesteContaComSaldo {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			ContaComSaldo conta10 = new ContaComSaldo("Obiwan", 50000.00);
			ContaComSaldo conta20 = new ContaComSaldo("Skywalker", 20000.00);
			
			System.out.printf("%s Saldo: %.2f \n", conta10.getNome(),conta10.getSaldo());
			System.out.printf("%s Saldo: %.2f \n", conta20.getNome(),conta20.getSaldo());
			
			System.out.println("Digite o valor que irá entrar para a conta 10:");
			double valorDeposito10 = entrada.nextDouble();
			System.out.printf("\nAdicionando %.2f para o saldo da conta10\n", valorDeposito10);
			conta10.deposita(valorDeposito10);
			
			System.out.printf("%s Saldo: %.2f \n", conta10.getNome(),conta10.getSaldo());
			System.out.printf("%s Saldo: %.2f \n", conta20.getNome(),conta20.getSaldo());
			System.out.println("Digite o valor que irá entrar para a conta 20:");
			double valorDeposito20 = entrada.nextDouble();
			System.out.printf("\nAdicionando %.2f para o saldo da conta10\n", valorDeposito20);
			
		}

}
