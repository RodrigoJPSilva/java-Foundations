package aula5Fabri;

import java.util.Scanner;

public class ArredondarParaCima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LOTACAO_ONIBUS = 20;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o numero de turistas?");
		int turistas = teclado.nextInt();
		
		float qtdeOnibus = (float)turistas / LOTACAO_ONIBUS;
		
		System.out.println("\nQuantidade de passageiros: " + turistas);
		System.out.println();
		System.out.println("\nQuantidade de calculada: " + qtdeOnibus);
		System.out.println();
		System.out.println("\nQuantidade de onibus: " + (int)Math.ceil(qtdeOnibus));
		System.out.println();
		

	}

}
