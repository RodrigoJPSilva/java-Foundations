package aula4Fabri;



public class RelógioComFor {

	public static void main(String[] args) {
		int horas,minutos,segundos;

		for (horas = 0; horas < 23; horas++)
		for (minutos = 0; minutos <= 5; minutos++) {
		for (segundos = 0; segundos < 60; segundos++) {
		System.out.println(horas + "hrs:" + minutos + "min:" + segundos + "s");
		}
	}
		}
	}
