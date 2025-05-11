package aula5Fabri;

import java.util.Scanner;

public class TrocandoCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Insira uma frase:");
		String texto = scn.nextLine();
		
		
		System.out.println("A frase fornecida: " + texto);
		System.out.println("Retirando os espaços: " + texto.replace(" ",""));
		System.out.println("Substituindo a por u: " + texto.replace("a","u");
		
	}

}
