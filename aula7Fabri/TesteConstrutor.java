package aula7Fabri;

public class TesteConstrutor {

	public static void main(String[] args) {
		ContaComConstrutor conta1 = new ContaComConstrutor("Professor Pardal");
		ContaComConstrutor conta2 = new ContaComConstrutor("Lampadinha");
		
		System.out.printf("\nNome da Conta: %s",conta1.getNome());		
		System.out.printf("\nNome da Conta: %s",conta2.getNome());		
	}

}
