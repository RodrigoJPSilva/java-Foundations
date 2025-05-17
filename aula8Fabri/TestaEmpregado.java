package aula8Fabri;

public class TestaEmpregado {

	public static void main(String[] args) {
		Empregado funssa = new Empregado();
		
		funssa.setNome("antonio");
		funssa.setRg("25.786.039-9");
		funssa.setCartao("RP854");
		
		System.out.println(funssa.getNome());
		System.out.println(funssa.getRg());
		System.out.println(funssa.getCartao());
		

	}

}
