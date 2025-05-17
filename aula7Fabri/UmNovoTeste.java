package aula7Fabri;

import java.util.Scanner;

public class UmNovoTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ContaDefinitiva minhaConta = new ContaDefinitiva();
		
		System.out.printf("\nNome inicial é %s\n", minhaConta.getNome());
		System.out.println("Por favor entre com o nome da conta:");
		String oNome = entrada.nextLine();
		minhaConta.setNome(oNome); // Insere oNome em minhaConta
		System.out.println();
		
		System.out.printf("Nome da conta é: \n%s\n",minhaConta.getNome());
	}

}
