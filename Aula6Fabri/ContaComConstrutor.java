package Aula6Fabri;

public class ContaComConstrutor {
	private String nome;
	// o construtor inicia o nome com o parâmetro nome
	public ContaComConstrutor(String nome) { // o nome do construto
		this.nome = nome;
	}
	
	public void setNome(String nome) { // <-- Este é o cabeçário do metodo
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	// Fim da classe ContaComConstrutor
}
