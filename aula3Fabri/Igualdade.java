package aula3Fabri;

import java.util.Scanner;

public class Igualdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro número ");
		int jabathehut = teclado.nextInt();
		System.out.println("Digite o segundo número ");
		int yoda = teclado.nextInt();
		
		boolean igualdade = (jabathehut == yoda);
		boolean maior = (jabathehut > yoda);
		boolean menor = (jabathehut < yoda);
		boolean diferente = (jabathehut != yoda);
		boolean maiorigual = (jabathehut >= yoda);
		boolean menorigual = (jabathehut <= yoda);
		
		System.out.println("Operadores relacionais... ");
		System.out.printf("Igualdade entre %d == %d resulta em %b \n ",jabathehut, yoda, igualdade);
		System.out.printf("Diferente entre %d == %d resulta em %b \n ",jabathehut, yoda, diferente);
		System.out.printf("Maior entre %d == %d resulta em %b \n ",jabathehut, yoda, maior);
		System.out.printf("Menor entre %d == %d resulta em %b \n ",jabathehut, yoda, menor);
		System.out.printf("Maior ou igual entre %d == %d resulta em %b \n ",jabathehut, yoda, maiorigual);
		System.out.printf("Menor ou igual entre %d == %d resulta em %b \n ",jabathehut, yoda, menorigual);

	}

}
