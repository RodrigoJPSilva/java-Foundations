package aula3Fabri;

import java.util.Locale;
import java.util.Scanner;

public class OperacaoMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2, multi;
		Scanner teclado = new Scanner(System.in);
		teclado.useLocale(Locale.US);
		
		
		System.out.println("Digite o primeiro numero");
		num1 = teclado.nextDouble();
		System.out.println("Digite segundo numero");
		num2 = teclado.nextDouble();
		
		multi = Math.pow(num1, num2);
		System.out.printf("A multiplicação entre %.2f e %.2f é de %.2f",num1,num2,multi);
		
		teclado.close();

	}

}
