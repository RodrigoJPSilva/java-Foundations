package aula4Fabri;

import java.util.Scanner;

public class PreTesteComWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, resp;
		Scanner entrada = new Scanner(System.in);
		
		resp = 1;
		while (resp == 1) {
			
			System.out.println("resp");
			
			i = 1;
			while (i <=5) {
				System.out.println("Valor = " + i);
				i++;
			}
		}

	}

}
