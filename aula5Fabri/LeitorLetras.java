package aula5Fabri;

import java.util.Scanner;

public class LeitorLetras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String palavra = scn.nextLine();
		
		System.out.println("\nPalavra: " + palavra);
		System.out.println("Caracter: " + palavra.charAt(0));
		System.out.println("Caracter: " + palavra.charAt(1));
		System.out.println("Caracter: " + palavra.charAt(2));
		System.out.println("Caracter: " + palavra.charAt(3));
	}

}
