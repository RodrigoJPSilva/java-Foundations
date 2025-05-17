package aula8Fabri;

public class LojaApp {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.codigo = 101;
		produto1.nome = "Mouse Gamer RGB";
		produto1.preco = 149.90;
		produto1.quant = 20;
		
		System.out.println(">>> Testando Produto 1: " + produto1.nome + "<<<");
		produto1.exibirDetalhes();
		
		System.out.println("\n Adicionando 5 unidades ao estoque de " + produto1.nome);
		produto1.addEstoque(5);
		produto1.exibirDetalhes();
		
		System.out.println("\nTentando vender 30 unidades de " + produto1.nome + " (mais que a quantidade)");
		boolean venda1Sucesso = produto1.vender(30);
		System.out.println("Status da venda:" + (venda1Sucesso ? "SUCESSO":"FALHA"));
		produto1.exibirDetalhes();
		
		
		System.out.println("\n=============================");
		Produto produto2 = new Produto();
		produto2.codigo = 170;
		produto2.nome = "Monitor";
		produto2.preco = 400;
		produto2.quant = 10;
		
		System.out.println(">>> Testando Produto 1: " + produto1.nome + "<<<");
		produto1.exibirDetalhes();
		
		System.out.println("\n Adicionando 5 unidades ao estoque de " + produto1.nome);
		produto1.addEstoque(5);
		produto1.exibirDetalhes();
		
		System.out.println("\nTentando vender 30 unidades de " + produto1.nome + " (mais que a quantidade)");
		boolean venda2Sucesso = produto1.vender(12);
		System.out.println("Status da venda:" + (venda2Sucesso ? "SUCESSO":"FALHA"));
		produto1.exibirDetalhes();
	}

}
