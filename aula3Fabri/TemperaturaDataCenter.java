package aula3Fabri;

import java.util.Scanner;

public class TemperaturaDataCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String senha;
		int caracteres;
		
		System.out.println("Insira uma senha de 8 caracteres");
		senha = sc.nextLine();
		caracteres = senha.length();
		
		if (senha.length() > 8)
			System.out.println("Senha cadastrada com sucesso!");
		else
			System.out.println("Sua senha não contém caracteres o suficiente");
			
	}
}