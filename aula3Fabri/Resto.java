package aula3Fabri;

import java.util.Scanner;

public class Resto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resto,numerador, denominador;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Informe o numerador");
		numerador = scn.nextInt();
		System.out.println("Informe o denominador");
		denominador = scn.nextInt();
		
		resto = numerador % denominador;
		
		System.out.printf("O resto da divisão de %d pelo $d é \n",numerador, denominador);
		System.out.println("Bye...");
		
		scn.close();
	}

}
