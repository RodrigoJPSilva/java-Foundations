package aula4Fabri;

import java.util.Scanner;

public class SwitchMercado {

	public static void main(String[] args) {
//	Variáveis
	double valor_total_compra = 0.0;
	float valor_feijao = 5.5f;
	float valor_arroz = 4.0f;
	float valor_macarrao = 2.5f;
	String produto;
	
	Scanner teclado = new Scanner(System.in);
	
//	Entrada
	
	System.out.println("Progama do mercado");
	System.out.println("Digite o nome do produto");
	System.out.println("feijão, arroz ou macarrão");
	produto = teclado.next().toLowerCase();

	if (produto.equals("feijao")) {
		valor_total_compra += valor_feijao;
	}
	else if (produto.equals("arroz")) {
		valor_total_compra += valor_arroz;
	}
	else if (produto.equals("macarrao")) {
		valor_total_compra += valor_macarrao;		
	}
	System.out.println("Digite o nome do segundo produto");
	System.out.println("feijão, arroz ou macarrão");
	produto = teclado.next().toLowerCase();
	if (produto.equals("feijao")) {
		valor_total_compra += valor_feijao;
	}
	else if (produto.equals("arroz")) {
		valor_total_compra += valor_arroz;
	}
	else if (produto.equals("macarrao")) {
		valor_total_compra += valor_macarrao;		
	}
	System.out.println("Digite o nome do terceiro produto");
	System.out.println("feijão, arroz ou macarrão");
	produto = teclado.next().toLowerCase();
	if (produto.equals("feijao")) {
		valor_total_compra += valor_feijao;
	}
	else if (produto.equals("arroz")) {
		valor_total_compra += valor_arroz;
	}
	else if (produto.equals("macarrao")) {
		valor_total_compra += valor_macarrao;		
	}
	
	System.out.printf("O valor total da compra foi de: R$%.2f \n", valor_total_compra);
	}
}