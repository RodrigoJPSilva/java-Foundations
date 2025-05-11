package aula5Fabri;

import java.util.Scanner;

public class TamanhoDaFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Forneça uma frase");
		String frase = scn.nextLine();
		
		int tamanho = frase.length();
		
		System.out.printf("Frase %s \nQuantidade de caracteres: %d", frase, tamanho);
	}

}
			