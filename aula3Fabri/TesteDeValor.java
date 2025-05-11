package aula3Fabri;

import java.util.Scanner;

public class TesteDeValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner sc = new Scanner(System.in);
	        double num1;

	        System.out.println("Digite o primeiro numero: ");
	        num1 = sc.nextDouble();



	        if (num1 > 20 && num1 < 90)
	            System.out.printf("%.2f está dentro da faixa",num1); 
	        else  
	        	System.out.printf("%.2f não está dentro da faixa",num1); 
	      
	        sc.close();
	    }
	
}
