package aula8Fabri;

public class Empregado extends PessoaFisica {
	private String cartao;

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	public void mostraClasse() {
		System.out.println("\nClasse Empregado!");
	}

}
