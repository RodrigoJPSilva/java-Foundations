package aula5Fabri;

import java.text.DecimalFormat;
import java.util.Locale;

public class FormatarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat();
		Locale local = Locale.getDefault();
		double valor = 1350.80;
		
		if (local.getCountry().equals("BR")) {
			df.applyPattern("R$ #,##0.00");
			
		}
		// Saída
		System.out.println("Configurações do Sistema Operacional");
		System.out.println("\nSigla: "+local.getCountry());
		System.out.println("\nPaís: "+local.getDisplayCountry());
		System.out.println("\nIdioma: "+local.getDisplayLanguage());
		System.out.println("\nTeclado: "+local.getDisplayName());
		System.out.println("\nValor: "+df.format(valor));
	}

}
