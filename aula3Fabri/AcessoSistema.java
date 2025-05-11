package aula3Fabri;

import java.util.Scanner;

public class AcessoSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int tempo;
		
		System.out.println("Digite somente numeros! \n digite tempo de resposta do servidor em milisegundos");
		tempo = sc.nextInt();
		
		if (tempo <= 200)
			System.out.println("Ativo");
		else
			System.out.println("Inativo");
			

	}

}
