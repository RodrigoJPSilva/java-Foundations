package Aula6Fabri;

public class AppUsuarios {
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario();
		usuario1.nome = "Alice Oliveira";
		usuario1.email = "alice@exemplo.com.br";
		usuario1.login = "alice_o";
		usuario1.ativo = true;
		
		Usuario usuario2 = new Usuario();
		usuario2.nome = "Bob construtor";
		usuario2.email = "bob@google.com.br";
		usuario2.login = "bob_c";
		usuario2.ativo = false;
		
		System.out.println("\nDados do usuário 1:\n");
		usuario1.exibirInfo();
		usuario1.desativarUsuario();
		usuario1.exibirInfo();
		
		System.out.println("\nDados do usuário 2:\n");
		usuario2.exibirInfo();
		usuario2.desativarUsuario();
		usuario2.exibirInfo();
		
	}
}