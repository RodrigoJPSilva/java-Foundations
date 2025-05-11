package aula5Fabri;

import java.util.Scanner;

public class PedaçosDaFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira uma frase:");
		String frase = teclado.nextLine();
		
		System.out.println("A frase inserida foi: " + frase);
		System.out.println(frase.substring(0,6));
	}

}
