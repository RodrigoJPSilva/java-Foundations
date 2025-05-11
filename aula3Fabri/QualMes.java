package aula3Fabri;

import java.util.Scanner;

public class QualMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int codigo;
		System.out.println("Entre com o código de acesso: [1],[2] ou [3]");
		codigo = scn.nextInt();
		if (codigo == 1 || codigo == 2 || codigo == 3) {
			if (codigo == 1)
				System.out.println("Opção um");
			if (codigo == 2)
				System.out.println("Opção um");
			if (codigo == 3)
				System.out.println("Opção um");
		}

	}

}
