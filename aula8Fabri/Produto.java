package aula8Fabri;

public class Produto {
	double valor, possui, preco;
	int  escolha,quant;
	String produtos[] = {"1- Mouse","2- Monitor","3- Pc Gamer","4- Controle remoto","5- Geladeira"};
	public int codigo;
	public String nome;
	
	
	
	
	void setEscolha(int escolha) {
		this.escolha = escolha;
	}
	
	void setQuant(int quant) {
		
	}
	
	void setComprar(int escolhido) {
		if (preco[escolha] < escolhido) {
			System.out.println("\nSaldo insuficiente");
		} else {
			double gasto = this.possui - valor;
			this.possui = gasto;
		}
	}
	
	public double getValor() {
		return valor;
	}

	public void exibirDetalhes() {
		System.out.println("--- Detalhe do produto ---");
	System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: " + this.preco);
		System.out.println("Quantidade em estoque: " + this.quant);
	}
	public void addEstoque(int quantadd) {
		if (quantadd > 0) {
			this.quant += quantadd;
			System.out.println(quantadd + "unidades de " + this.nome);
			System.out.println();
		}
		else
			System.out.println("Erro: a quantidade para adicionar ao estoque deve ser positiva");
	}

public boolean vender(int quantvenda) {
		if (quantvenda <= 0) {
			System.out.println("!Erro: a quantidade para vender deve ser positiva");
			return false;
		}
		else {
			if (this.quant >= quantvenda) {
				this.quant -= quantvenda;
				System.out.println(quantvenda + "unidades de " + this.nome + ", \nVenda realizada com sucesso");
				System.out.println("Quantidade restante em estoque" + this.quant);
				return true;
			}else {
				System.out.println("Venda de " + this.nome + ", não realizada. \nEstoque insuficiente");
				System.out.println("Quantidade em estoque: " + this.quant + ", solicitado: " + quantvenda);
				return false;
			}
		}
}}