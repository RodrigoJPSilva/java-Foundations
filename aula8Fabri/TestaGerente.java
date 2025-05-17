package aula8Fabri;

public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente manager = new Gerente();

		manager.setNome("Alfredo");
		manager.setCpf(75872);
		manager.setSenha(4321);
		
		System.out.println(manager.getBonificacao());
	}

}
