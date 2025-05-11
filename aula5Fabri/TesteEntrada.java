package aula5Fabri;

import java.util.Scanner;

public class TesteEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Manda uma frase ai: ");
		String entrada = scn.nextLine();
		
		entrada = "       " + entrada + "       ";
		
		System.out.println("Com espaços :" + "-" + entrada + "-");
		System.out.println("Sem espaços :" + "-" + entrada.trim() + "-");
	}

}
