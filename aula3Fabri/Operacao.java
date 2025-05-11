package aula3Fabri;

import java.util.Scanner;

public class Operacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2, diferenca;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro numero");
		num1 = teclado.nextDouble();
		System.out.println("Digite segundo numero");
		num2 = teclado.nextDouble();
		
		diferenca = num1 - num2;
		System.out.printf("A diferença entre %.2f e %.2f é de %.2f",num1,num2,diferenca);
		
		teclado.close();

	}

}
