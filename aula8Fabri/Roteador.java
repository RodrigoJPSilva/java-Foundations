package aula8Fabri;

public class Roteador extends EquipamentoRede {
	public int qtdePortas;
	
	public void configurar() {
		System.out.println("Configurando o roteador...");
	}

	public int getQtdeporas() {
		return qtdePortas;
	}

	public void setQtdeporas(int qtdeporas) {
		this.qtdePortas = qtdeporas;
	}
}
