package Aula6Fabri;

public class Usuario {
	String nome;
	String email;
	String login; 
	boolean ativo;

	public void exibirInfo() {
		System.out.println("--- Informações do Usuário ---");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Login " + login);
		System.out.println("Status " + (ativo ? "Ativo" : "Inativo"));
	}
	public void ativarUsuario() {
		this.ativo = true;
		System.out.println("Usuário" + nome + "ativado");
	}
	public void desativarUsuario() {
		this.ativo = true;
		System.out.println("Usuário" + nome + "desativado");		
	}
}