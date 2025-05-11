package aula5Fabri;

import java.text.DecimalFormat;

public class ConfigRegionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat();
		
		short idade = 38; 
		df.applyPattern("000");
		System.out.println(df.format(idade));
		
		df.applyPattern("###");
		System.out.println(df.format(idade));
		
		int quantidade = 9759;
		df.applyPattern("0,000");
		System.out.println(df.format(quantidade));

		long estoque = 1198764;
		df.applyPattern("#,##0.00");
		System.out.println(df.format(estoque));
	}

}
