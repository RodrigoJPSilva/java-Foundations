package aula5Fabri;

import java.util.Scanner;

public class UpperAndLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String exemplo = scn.nextLine();
		
		System.out.println("\nPalavra: " + exemplo);
		System.out.println("Caracter: " + exemplo.toUpperCase());
		System.out.println("Caracter: " + exemplo.toLowerCase());

	}

}
