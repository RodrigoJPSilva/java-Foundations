package aula3Fabri;

import java.util.Scanner;

public class TesteComOU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int mes;
		System.out.println("Insira um mês");
		mes = scn.nextInt();
		if (mes >= 1 && mes <= 12) {
			if (mes == 1)
				System.out.println("Janeiro");
				else if (mes == 2)
					System.out.println("Fevereiro");
					else if (mes == 3)
						System.out.println("Março");
						else if (mes == 4)
							System.out.println("Abril");
							else if (mes == 5)
								System.out.println("Maio");
								else if (mes == 6)
									System.out.println("Junho");
									else if (mes == 7)
										System.out.println("Julho");
										else if (mes == 8)
											System.out.println("Agosto");
											else if (mes == 9)
												System.out.println("Setembro");
												else if (mes == 10)
													System.out.println("Outubro");
													else if (mes == 11)
														System.out.println("Novembro");
														else if (mes == 12)
															System.out.println("Dezembro");
	} else
			System.out.println("Você inseriu um numero inesistente");

	}

}
